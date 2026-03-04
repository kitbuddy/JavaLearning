package classesMain.LeetCode;

import java.util.*;

public class Wayfair1_1 {

    public static Map<String, List<Integer>> getUserAccessTimes(String[][] logs1) {
        List<Integer> list = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < logs1.length; i++) {
            String key = "";
            for (int j = 0; j < 2; j++) {
                list = new ArrayList<>();

                key = logs1[i][1];
                Integer minValue = Integer.MAX_VALUE;
                Integer maxValue = Integer.MIN_VALUE;
                if(logs1[i][1] == key) {
                    String value = logs1[i][0];
                    minValue = Math.min(minValue, Integer.valueOf(value));
                    maxValue = Math.max(Integer.valueOf(value), maxValue);
                }

                list.add(minValue);
                list.add(maxValue);
            }
            map.put(key, list);

            System.out.println(map);
        }


        return map;


    }

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

        System.out.println(Wayfair1_1.getUserAccessTimes(logs1));
    }
}
