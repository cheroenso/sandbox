<?php
// Calculate the average and median values of a file of numbers
// and add the values to a single CSV string for each type.
// Calculate the request-per-second if the number of users is supplied

// Load file
$fileName = $argv[1];
echo "Input file is $fileName \n";
$userCount = $argv[2];
echo "user count = $userCount \n";
$outputMedian = fopen('medians.csv', 'a');
$outputAverage = fopen('averages.csv', 'a');
$lines = file($fileName);
$count = 0.0;
$sum = 0.0;
$avg = 0.0;
$requestsPerSecond = 0.0;
$timeArray = array();

foreach ($lines as $line_num => $line) {
    $timeArray[] = $line;
    $sum += $line;
    $count++;
}
// Compute average value
$avg = round(($sum/$count));

// Compute median value
$median = getMedian($timeArray);

// Check to see if we should compute requests-per-second
if (isset($userCount) && $userCount > 0) {
        $totalSeconds = $sum / 1000;
        $requestsPerSecond = round(($count / ($totalSeconds/$userCount)), 2);
        echo "requests per second = $requestsPerSecond\n"; 
        $outputRps = fopen('rps.csv', 'a');
        fwrite($outputRps, trim($requestsPerSecond));
        fwrite($outputRps, ',');
} else {
    echo 'users not included';
}
echo "median = $median";
echo "average = $avg\n";
fwrite($outputMedian, trim($median));
fwrite($outputMedian, ',');
fwrite($outputAverage, trim($avg));
fwrite($outputAverage, ',');

// Compute median value
function getMedian($entries)
{
    rsort($entries);
    $midIndex = round(count($entries)/2);
    $medianValue = $entries[$midIndex - 1];
    return $medianValue;
}

// Compute total requests-per-second
function getRequestsPerSecond($users, $totalEntries)
{
    if (isset($users) && $users > 0) {
//        $totalSeconds = $sum / 1000;
        $totalSeconds = $totalEntries / 1000;
        $requestsPerSecond = round(($count / ($totalSeconds/$userCount)), 2);
        echo "requests per second = $requestsPerSecond\n"; 
        $outputRps = fopen('rps.csv', 'a');
        fwrite($outputRps, trim($requestsPerSecond));
        fwrite($outputRps, ',');
    } else {
        echo 'users not included';
    }
}
?>

