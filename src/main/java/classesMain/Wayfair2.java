package classesMain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Wayfair2 {
    /*
    *
For example:
logs1 = [
    ["58523", "user_1", "resource_1"],
    ["62314", "user_2", "resource_2"],
    ["54001", "user_1", "resource_3"],
    ["200", "user_6", "resource_5"],
    ["215", "user_6", "resource_4"],
    ["54060", "user_2", "resource_3"],
    ["53760", "user_3", "resource_3"],
    ["58522", "user_22", "resource_1"],
    ["53651", "user_5", "resource_3"],
    ["2", "user_6", "resource_1"],
    ["100", "user_6", "resource_6"],
    ["400", "user_7", "resource_2"],
    ["100", "user_8", "resource_6"],
    ["54359", "user_1", "resource_3"],
]


We would like to compute user sessions, specifically: write a function that takes the logs and returns a data structure that associates to each user their earliest and latest access times.

Example:
{'user_1': [54001, 58523],
 'user_2': [54060, 62314],
 'user_3': [53760, 53760],
 'user_5': [53651, 53651],
 'user_6': [2, 215],
 'user_7': [400, 400],
 'user_8': [100, 100],
 'user_22': [58522, 58522],
}

Example 2:
logs2 = [
    ["300", "user_1", "resource_3"],
    ["599", "user_1", "resource_3"],
    ["900", "user_1", "resource_3"],
    ["1199", "user_1", "resource_3"],
    ["1200", "user_1", "resource_3"],
    ["1201", "user_1", "resource_3"],
    ["1202", "user_1", "resource_3"]
]

Should return:
{'user_1': [300, 1202]}

Example 3:
logs3 = [
    ["300", "user_10", "resource_5"]
]

Should return:
{'user_10': [300, 300]}

Complexity analysis variables:

n: number of logs in the input

 */

    public static void main(String[] args) {

        String[][] logs1 = new String[][]{
                {"300", "user_1", "resource_3"},
                {"599", "user_1", "resource_3"},
                {"900", "user_1", "resource_3"},
                {"1199", "user_1", "resource_3"},
                {"1200", "user_1", "resource_3"},
                {"1201", "user_1", "resource_3"},
                {"1202", "user_1", "resource_3"}
        };


        Wayfair2 wayfair2 = new Wayfair2();

        Map<String, int[]> session = wayfair2.getUserSessions(logs1);
        for (Map.Entry<String, int[]> entry : session.entrySet()) {
            System.out.println(entry.getKey() + ": " + Arrays.toString(entry.getValue()));
//            System.out.println(Arrays.toString(entry.getValue()));
        }

    }


    private Map<String, int[]> getUserSessions(String[][] logs1) {
        Map<String, int[]> session = new HashMap<>();
        for (String[] log : logs1) {
            int time = Integer.parseInt(log[0]);
            String userId = log[1];

            if (!session.containsKey(userId)) {
                session.put(userId, new int[]{time, time});
            } else {
                int[] userSession = session.get(userId);
                userSession[0] = Math.min(userSession[0], time);
                userSession[1] = Math.max(userSession[1], time);
            }

        }

        return session;
    }
}
