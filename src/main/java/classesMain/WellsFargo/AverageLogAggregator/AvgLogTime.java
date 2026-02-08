package classesMain.WellsFargo.AverageLogAggregator;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*Question 2: Log Aggregation by Service (Medium)
Problem

You are given application logs:

class LogEntry {
    String serviceName;
    long timestamp;
    int responseTime;
}


Write a method that returns the average response
time per service for logs within the last K seconds.

Input

List<LogEntry> logs

currentTime

K

Output
Map<String, Double>  // service → average response time

Constraints

Logs are not sorted

Large input size

What they look for

Efficient filtering

Proper use of Map

Avoid unnecessary sorting

Handling empty results
*/

public class AvgLogTime {

    public static void main(String[] args) {
        List<LogEntry> logs = new ArrayList<>();
        String currentTime = Instant.now().toString();
        int K = 10;
        AvgLogTime.getAverageLogTime(logs, currentTime, K);
    }

    private static void getAverageLogTime(List<LogEntry> logs, String currentTime, int k) {
        Map<String, List<Integer>> map = new HashMap<>();

        for (LogEntry log : logs) {

//            map.put(log.serviceName, map.getOrDefault(log.responseTime, 0) +1);
        }

    }
}
