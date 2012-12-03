<?php
require_once '../lib/vendor/PEAR/Math_Stats/Stats.php';

/**
 * Script and associated classes for loading performance test results into DB
 * This assumes a specific JMeter SummaryReport output.
 * See http://svn.cnet.com/entertainment/AutomationTests/QAEngineering/trunk/JMeter/TestPlans/GS_PageBenchmark_Anon_TestPlan_linux.jmx
 *
 * @package    none
 * @subpackage none
 * @category   none
 *
 * @copyright  Copyright (c) CBS Interactive
 *
 *
 */
$input = new Input($argv);

$summary = new Summary();
$summary->analyze($input->getFilepath());

$db = new Database();
$host = 'c17-cne-dev1';
$port = '3306';
$user = 'gamespot';
$pass = '';
$dbName = 'perf';

$db->connect($host, $port, $user, $pass, $dbName);

foreach ($summary->getLabels() as $label) {
    $type = $input->getTestType();
    $date = "'" . date ("Y-m-d H:i:s", $summary->getTimestamp()) . "'";
    $version = $input->getVersion();
    $request_label = "'" . $label . "'";
    $url = "'" . $summary->getUrl($label) . "'" ;
    $threads = $input->getConcurrentUsers();
    $rps = round(($summary->getReqPerSec($label)), 2);
    $median = round($summary->getMedianLatency($label), 2);
    $avg = round(($summary->getAverageLatency($label)), 2);
    $std_deviation = round(($summary->getStandardDeviation($label)), 2);
    $percentile = $summary->getPercentile($label);
    print "$label: test_type=$type date=$date version=$version label = $request_label url=$url users=$threads rps=$rps, median=$median, avg=$avg, std_dev=$std_deviation, percentile=$percentile\n";

    $query_string = 'INSERT INTO test_data (
            type_id,
            date,
            svn_rev,
            label,
            url,
            conc_users,
            rps,
            median,
            avg,
            std_deviation,
            percentile_mean) VALUES ('
            . $type
            . ',' . $date
            . ',' . $version
            . ',' . $request_label
            . ',' . $url
            . ',' . $threads
            . ',' . $rps
            . ',' . $median
            . ',' . $avg
            . ',' . $std_deviation
            . ',' . $percentile
            . ')';
    // echo "query: $query_string\n";
    // load data into database
    $db->execute($query_string, $type_id);


}
exit(0);


////////////////////////////////////////////////////////////////////////////////
// CLASSES ONLY BEYOND HERE
////////////////////////////////////////////////////////////////////////////////

class Database
{
    private $_link;

    public function __construct() {}

    public function connect($host, $port, $user, $pass, $db)
    {
        $this->_link = mysql_connect($host.":".$port, $user, $pass);
        if (!$this->_link) {
            die("Error connecting to MySQL server: ".mysql_error()."\n");
        }
        if (!mysql_select_db($db)) {
            die("Error selecting DB after connection: ".mysql_error()."\n");
        }
    }

    public function query($sql, $data)
    {
        if (!mysql_query($sql, $this->_link)) {
            $message = "Error running query: ".mysql_error()."\n";
            $message .= "Whole query: $sql";
            die($message);
        }

        $data = array();
        while ($row = mysql_fetch_assoc($result)) {
            $data[] = $row;
        }
        mysql_free_result();
    }

    public function execute($sql, $data)
    {
        if (!mysql_query($sql, $this->_link)) {
            $message = "Error running query: ".mysql_error()."\n";
            $message .= "Whole query: $sql";
            // Display any errors but allow the next line to be inserted.
//            die($message);
            print "$message\n\n";
        }

    }
}

class Summary
{
    /**
     * @var array keys are unique test types. values are arrays with
     *            keys: time start, time end, line count.
     */
    private $_labels;
    private $_timestamp;
    private $_ignoredLabels;
    
    public function __construct()
    {
        $this->_labels = array();
        $this->_original_latency_values = array();
    }

    public function analyze($filepath)
    {
        $fp = fopen($filepath, 'r');
        explode(',', fgets($fp));
        
        while(!feof($fp)) {
            $line = fgets($fp);
            $data = explode(',', $line);
            // make sure we have a valid line.
            if (strlen($line) > 0) {
                $this->_processLine($data);
            }
        }

        foreach ($this->_labels as $label => $data) {
            ksort($this->_labels[$label]['latency']);
        }
    }

    public function getTimestamp()
    {
        return $this->_timestamp;
    }

    public function getUrl($label)
    {
        if (!isset($this->_labels[$label])) {
            return -1; // error: label not found in data set
        }
        $data = $this->_labels[$label];
        return $data['URL'];
    }


    public function getAverageLatency($label)
    {
        if (!isset($this->_labels[$label])) {
            return -1; // error: label not found in data set
        }
        $data = $this->_labels[$label];
        return $data['sumLatency'] / $data['lineCount'];
    }

    public function getMedianLatency($label)
    {
        if (!isset($this->_labels[$label])) {
            return -1; // error: label not found in data set
        }
        $data = $this->_labels[$label];
        $sum = 0;
        $halfCount = round($data['lineCount'] / 2) - 1;
        // I'm assuming that the data has been sorted by latency (keys)
        // sum the count of each latency, starting from smallest latency,
        // until we reach the latency value where there is an equal amount
        // of data points with lesser values as there are with higher values.
        foreach ($data['latency'] as $latency => $itemCount) {
            $runningCount += $itemCount;
            if ($runningCount >= $halfCount) {
                break;
            }
        }
        return $latency;
    }

    /**
     * Even out responses by using the median of a specific percentile.
     *
     * @param string $label
     * @return integer Currently returns the quartile mean.
     */
    public function getPercentile($label)
    {
        if (!isset($this->_labels[$label])) {
            return -1; // error: label not found in data set
        }
        $mystats = new Math_Stats;
        $mystats->setData($this->_original_latency_values[$label]);
        $statsOut = $mystats->calcFull();
        //  print_r($statsOut);
        $results = round($statsOut['interquartile_mean']);
        // print "\n Results: $results \n";
        return $results;
    }

    public function getStandardDeviation($label)
    {
        if (!isset($this->_labels[$label])) {
            return -1; // error: label not found in data set
        }

        $result = $this->_standard_deviation($this->_original_latency_values[$label]);
        return $result;
    }

    private function _standard_deviation($std)
    {
        $total;
        while(list($key,$val) = each($std))
            {
                $total += $val;
            }
        reset($std);
        $mean = $total/count($std);

        while(list($key,$val) = each($std))
            {
                $sum += pow(($val-$mean),2);
            }
        $var = sqrt($sum/(count($std)-1));
        return $var;
    }

    public function getLabels()
    {
        $r = array();
        foreach ($this->_labels as $label => $data) {
            if (empty($label)) {
                continue;
            }
            $r[] = $label;
        }
        return $r;
    }

    public function getReqPerSec($label)
    {
        if (!isset($this->_labels[$label])) {
            return -1; // error: label not found in data set.
        }
        $data = $this->_labels[$label];
        $sec = ($data['end'] - $data['start']) / 1000;
        if ($sec == 0) {
            return -1; // error: unable to calc rps when tot elapsed time is 0.
        }
        $rps = $data['lineCount'] / $sec;
        return $rps;
    }

    private function _processLine($data)
    {
        $label = trim($data[2]);
        if (isset($this->_ignoredLabels[$label])) {
            return;
        }
        $latency = trim($data[9]);
        $start = trim($data[0]);
        $end = $start + $latency;
        $url = trim($data[8]);

        // the first timestamp is used as the time of the stamp.
        if ($this->_timestamp == null) {
            $this->_timestamp = round(($start / 1000), 0); // convert millisec
        }

        if (!isset($this->_labels[$label])) {
            $this->_labels[$label]['start'] = $start;
            $this->_labels[$label]['end'] = $start;
            $this->_labels[$label]['lineCount'] = 1;
            $this->_labels[$label]['sumLatency'] = $latency;
            $this->_labels[$label]['latency'] = array($latency => 1);
        } else {
            // How many data points does this label have?
            $this->_labels[$label]['lineCount']++;
            
            // start and end times provide total run time for a label, which
            // allows us to calculate req/sec for this label.
            if ($this->_labels[$label]['start'] > $start) {
                $this->_labels[$label]['start'] = $start;
            }
            if ($this->_labels[$label]['end'] < $end) {
                $this->_labels[$label]['end'] = $end;
            }
            
            // ['latency']: array('latency value' => 'times this latency appears in data')
            if (isset($this->_labels[$label]['latency'][$latency])) {
                $this->_labels[$label]['latency'][$latency]++;
            } else {
                $this->_labels[$label]['latency'][$latency] = 1;
            }
            
            // Sum of all latency allows us to determine average latency
            $this->_labels[$label]['sumLatency'] += $latency;

            // URL
            $this->_labels[$label]['URL'] = $url;
        }
        // get original latency values for computing standard deviation
        $this->_original_latency_values[$label][] = $latency;
    }

}



class Input
{
    private $_filepath;
    private $_concurrentUsers;
    private $_version;
    private $_type = 1;    //If test type is not specified on command line default to type 1

    public function __construct($argv)
    {
        $this->_concurrentUsers = 1;
        $this->_parse($argv);
    }

    public function getUsage()
    {
        return "    {$this->_script} -f <filepath> [-c <concurrent users>]\n"
             . "     -u,-users  Number of concurrent users used to run the tests that generated the input file.\n"
             . "     -v,--version   Version number of code that was the target of the tests.\n"
             . "     -t,--type     Test type id (should match a value in perf.test_type).\n"
             . "     -f,--file     File with test results to process.\n"
             . "     -h,--help     Print usage\n";
    }

    public function getFilepath()
    {
        return $this->_filepath;
    }

    public function getConcurrentUsers()
    {
        return $this->_concurrentUsers;
    }

    public function getVersion()
    {
        return $this->_version;
    }

    public function getTestType()
    {
        return $this->_type;
    }


    private function _parse($argv)
    {
        $argc = count($argv);
        for ($i=1; $i<$argc; $i++) {
            if (substr($argv[$i], 0, 2) == '-h'
                || substr($argv[$i], 0, 6) == '--help') {
                print $this->getUsage();
                exit(0);
            } elseif (substr($argv[$i], 0, 2) == '-f'
                || substr($argv[$i], 0, 6) == '--file') {
                $this->_setFilepath($argv[++$i]);
                continue;
            } elseif (substr($argv[$i], 0, 2) == '-u'
                || substr($argv[$i], 0, 6) == '--users') {
                $this->_setConcurrentUsers($argv[++$i]);
                continue;
            } elseif (substr($argv[$i], 0, 2) == '-v'
                || substr($argv[$i], 0, 6) == '--version') {
                $this->_setVersion($argv[++$i]);
                continue;
            } elseif (substr($argv[$i], 0, 2) == '-t'
                || substr($argv[$i], 0, 6) == '--type') {
                $this->_setType($argv[++$i]);
                continue;
            }
        }
    }

    private function _setFilepath($path)
    {
        if (!is_readable($path)) {
            print "File is not readable: $path\n";
            exit(1);
        }
        $this->_filepath = $path;
    }

    private function _setConcurrentUsers($n)
    {
        if (!is_numeric($n)) {
            print "Concurrent users value must be numeric (invalid: $n).\n";
            exit(1);
        }
        $this->_concurrentUsers = (int)$n;
    }

    private function _setVersion($n)
    {
        $this->_version = $n;
    }

    private function _setType($n)
    {
        $this->_type = (int)$n;
    }

}

