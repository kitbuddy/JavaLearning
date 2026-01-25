package classesMain.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Wayfair1 {

    public static void main(String[] args) {
        String[][] logs1 = new String[][] {
                { "58523", "user_1", "resource_1" },
                { "62314", "user_2", "resource_2" },
                { "54001", "user_1", "resource_3" },
                { "200", "user_6", "resource_5" },
                { "215", "user_6", "resource_4" },
                { "54060", "user_2", "resource_3" },
                { "53760", "user_3", "resource_3" },
                { "58522", "user_22", "resource_1" },
                { "53651", "user_5", "resource_3" },
                { "2", "user_6", "resource_1" },
                { "100", "user_6", "resource_6" },
                { "400", "user_7", "resource_2" },
                { "100", "user_8", "resource_6" },
                {"54359", "user_1", "resource_3"},
        };

        String[][] logs2 = new String[][] {
                {"300", "user_1", "resource_3"},
                {"599", "user_1", "resource_3"},
                {"900", "user_1", "resource_3"},
                {"1199", "user_1", "resource_3"},
                {"1200", "user_1", "resource_3"},
                {"1201", "user_1", "resource_3"},
                {"1202", "user_1", "resource_3"}
        };

        String[][] logs3 = new String[][] {
                {"300", "user_10", "resource_5"}
        };

        Wayfair1 w = new Wayfair1();
        Map<String, int[]> session = w.getUserTimeSorted(logs2);
        for (Map.Entry<String, int[]>  entry : session.entrySet()) {
            System.out.println(entry.getKey() + " -> " +
                    Arrays.toString(entry.getValue()));
        }

    }

    public Map<String, int[]> getUserTimeSorted(String[][] logs1) {
        Map<String, int[]> userSessions = new HashMap<>();

        for (String[] log : logs1) {
            int time = Integer.parseInt(log[0]);
            String userId = log[1];

            if (!userSessions.containsKey(userId)) {
                userSessions.put(userId, new int[]{time, time});
            } else {
                int[] session = userSessions.get(userId);
                session[0] = Math.min(session[0], time);
                session[1] = Math.max(session[1], time);
            }

        }
        return userSessions;
    }

}