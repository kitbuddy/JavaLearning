package classesMain.WellsFargo.AverageLogAggregator;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogAggregator {
    public static void main(String[] args) {
        // Updated timestamps for better testing
        LogEntry log1 = new LogEntry("ServiceA", 100L, Instant.now().toEpochMilli() - 5000);  // 5 sec ago
        LogEntry log2 = new LogEntry("ServiceB", 200L, Instant.now().toEpochMilli() - 7000);  // 7 sec ago
        LogEntry log3 = new LogEntry("ServiceA", 150L, Instant.now().toEpochMilli() - 12000); // 12 sec ago

        List<LogEntry> logs = List.of(log1, log2, log3);

        // Current time and the time window (15 seconds)
        long currentTime = Instant.now().toEpochMilli();
        long K = 15000; // 15 seconds window

        // Call the method and print the results
        System.out.println(LogAggregator.averageResponseTime(logs, currentTime, K));
    }

    public static Map<String, Double> averageResponseTime(
            List<LogEntry> logs, long currentTime, long K) {

        Map<String, int[]> map = new HashMap<>();

        long windowStart = currentTime - K;

        for (LogEntry log : logs) {
            if (log.timestamp >= windowStart) {
                map.putIfAbsent(log.serviceName, new int[2]);

                int[] data = map.get(log.serviceName);
                data[0] += log.responseTime; // total response time
                data[1] += 1;               // count
            }
        }

        Map<String, Double> result = new HashMap<>();

        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            int total = entry.getValue()[0];
            int count = entry.getValue()[1];
            result.put(entry.getKey(), total / (double) count);
        }

        return result;
    }
}
