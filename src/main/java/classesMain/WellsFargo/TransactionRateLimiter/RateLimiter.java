package classesMain.WellsFargo.TransactionRateLimiter;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class RateLimiter {

    private final int limit;
    private final long windowMillis;
    private final Map<String, Deque<Long>> userTransactions = new HashMap<>();

    public RateLimiter(int limit, long windowMillis) {
        this.limit = limit;
        this.windowMillis = windowMillis;
    }

    public synchronized boolean allow(String userId) {
        long now = System.currentTimeMillis();

        userTransactions.putIfAbsent(userId, new ArrayDeque<>());
        Deque<Long> queue = userTransactions.get(userId);

        while (!queue.isEmpty() && queue.peekFirst() <= now - windowMillis) {
            queue.pollFirst();
        }

        if (queue.size() < limit) {
            queue.addLast(now);
            return true;
        }
        return false;
    }
}
