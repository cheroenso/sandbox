<?php
/**
 *
 * @package    none
 * @subpackage none
 * @category   none
 * @author     Chris Brann	
 *
 * Extract values from WebpageTest output for use in wiki
 * TODO: Add db storage for reporting over time
 * TODO: Find a better way to parse the xml file
 */
$input = new Input($argv);

// load webpagetest script output file
$xml = xml2ary(file_get_contents($input->getFilepath()));
// get URLs for xml and GUI versions of the report
$wpXmlResultUrl = $xml['response']['_c']['data']['_c']['xmlUrl']['_v'];
$wpUserResultUrl = $xml['response']['_c']['data']['_c']['userUrl']['_v'];
// parse the xml file
$myFile = file_get_contents($wpXmlResultUrl);
$xml2 = xml2ary($myFile);

// get values
$wpUrl = $xml2['response']['_c']['data']['_c']['median']['_c']['firstView']['_c']['URL']['_v'];
$wpLoadTime = $xml2['response']['_c']['data']['_c']['median']['_c']['firstView']['_c']['loadTime']['_v'];
$wpTimestamp = $xml2['response']['_c']['data']['_c']['median']['_c']['firstView']['_c']['date']['_v'];
$wpTTFB = $xml2['response']['_c']['data']['_c']['median']['_c']['firstView']['_c']['TTFB']['_v'];
$wpBytesIn = $xml2['response']['_c']['data']['_c']['median']['_c']['firstView']['_c']['bytesIn']['_v'];
$wpLoadTime2 = $xml2['response']['_c']['data']['_c']['median']['_c']['repeatView']['_c']['loadTime']['_v'];
$wpTTFB2 = $xml2['response']['_c']['data']['_c']['median']['_c']['repeatView']['_c']['TTFB']['_v'];
$wpBytesIn2 = $xml2['response']['_c']['data']['_c']['median']['_c']['repeatView']['_c']['bytesIn']['_v'];

// format strings for DB and wiki
$wpLoadTime = number_format($wpLoadTime, 0, '.', '.');
$wpLoadTime2 = number_format($wpLoadTime2, 0, '.', '.');
$wpTTFB = bcdiv($wpTTFB,1000,3);
$wpTTFB2 = bcdiv($wpTTFB2,1000,3);
$wpBytesIn = $wpBytesIn / 1024;
$wpBytesIn2 = $wpBytesIn2 / 1024;
$wpBytesIn = number_format($wpBytesIn, 0 , '.', ',');
$wpBytesIn2 = number_format($wpBytesIn2, 0 , '.', ',');
$formattedDateDB = "'" . date ("Y-m-d H:i:s", $wpTimestamp) . "'";
$formattedDate = date ("Y-m-d", $wpTimestamp);

// create a label
$wpLabel = pathinfo($input->getFilepath(), PATHINFO_FILENAME);
// strip any .xml extensions
$wpLabel = str_ireplace(".xml", "", $wpLabel);

// Output values to screen
echo("DB load values: \n");
print_r("| $formattedDateDB | $wpLabel |$wpLoadTime | $wpTTFB | $wpBytesIn | $wpLoadTime2 | $wpTTFB2 | $wpBytesIn2 | $wpUrl | $wpUserResultUrl | \n");

echo("Wiki load values: \n");
print_r("| $wpLabel |$formattedDate|$wpLoadTime|$wpTTFB|$wpBytesIn|$wpLoadTime2|$wpTTFB2|$wpBytesIn2| [$wpUserResultUrl] | \n");

// XML to Array
function xml2ary(&$string) {
    $parser = xml_parser_create();
    xml_parser_set_option($parser, XML_OPTION_CASE_FOLDING, 0);
    xml_parse_into_struct($parser, $string, $vals, $index);
    xml_parser_free($parser);

    $mnary=array();
    $ary=&$mnary;
    foreach ($vals as $r) {
        $t=$r['tag'];
        if ($r['type']=='open') {
            if (isset($ary[$t])) {
                if (isset($ary[$t][0])) $ary[$t][]=array(); else $ary[$t]=array($ary[$t], array());
                $cv=&$ary[$t][count($ary[$t])-1];
            } else $cv=&$ary[$t];
            if (isset($r['attributes'])) {foreach ($r['attributes'] as $k=>$v) $cv['_a'][$k]=$v;}
            $cv['_c']=array();
            $cv['_c']['_p']=&$ary;
            $ary=&$cv['_c'];

        } elseif ($r['type']=='complete') {
            if (isset($ary[$t])) { // same as open
                if (isset($ary[$t][0])) $ary[$t][]=array(); else $ary[$t]=array($ary[$t], array());
                $cv=&$ary[$t][count($ary[$t])-1];
            } else $cv=&$ary[$t];
            if (isset($r['attributes'])) {foreach ($r['attributes'] as $k=>$v) $cv['_a'][$k]=$v;}
            $cv['_v']=(isset($r['value']) ? $r['value'] : '');

        } elseif ($r['type']=='close') {
            $ary=&$ary['_p'];
        }
    }

    _del_p($mnary);
    return $mnary;
}

// _Internal: Remove recursion in result array
function _del_p(&$ary) {
    foreach ($ary as $k=>$v) {
        if ($k==='_p') unset($ary[$k]);
        elseif (is_array($ary[$k])) _del_p($ary[$k]);
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
        $this->_getArgs($argv);
    }

    public function getUsage()
    {
        return "    {$this->_script} -f <filepath> [-c <concurrent users>]\n"
             . "        -c,          Number of concurrent users used to run the tests that generated the input file.\n"
             . "        -v,          Version number of code that was the target of the tests.\n"
             . "        -f,--file    File with test results to process.\n"
             . "        -h,--help    Print usage\n";
    }

    public function getFilepath()
    {
        return $this->_filepath;
    }
    private function _getArgs($argv)
    {
        $argc = count($argv);
        print_r($argc);
        if ($argc < 1) {
        	print $this->getUsage();
        	exit(0);
        }
        for ($i=1; $i<$argc; $i++) {
            if (substr($argv[$i], 0, 1) == ''
                || substr($argv[$i], 0, 6) == '--help') {
                print $this->getUsage();
                exit(1);
            } elseif (substr($argv[$i], 0, 2) == '-h'
                || substr($argv[$i], 0, 6) == '--help') {
                print $this->getUsage();
                exit(0);
            } elseif (substr($argv[$i], 0, 2) == '-f'
                || substr($argv[$i], 0, 6) == '--file') {
                $this->_setFilepath($argv[++$i]);
                continue;
            } elseif (substr($argv[$i], 0, 2) == '-c') {
                $this->_setConcurrentUsers($argv[++$i]);
                continue;
            } elseif (substr($argv[$i], 0, 2) == '-v') {
                $this->_setVersion($argv[++$i]);
                continue;
            } elseif (substr($argv[$i], 0, 2) == '-t') {
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

}

?>
