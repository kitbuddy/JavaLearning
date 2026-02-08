package classesMain.WellsFargo.AverageLogAggregator;

class LogEntry {
    String serviceName;
    long timestamp;
    long responseTime;

    LogEntry(String serviceName,
             long timestamp,
             long responseTime) {
        this.serviceName = serviceName;
        this.timestamp = timestamp;
        this.responseTime = responseTime;
    }
}
