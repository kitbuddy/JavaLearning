package classesMain.LeetCode;

import java.util.*;

public class Wayfair1_1 {

    public static List<String> getUserAccessTimes(String[][] log) {
        List<String> list = new ArrayList<>();
        Map<Object, String[]> map = new HashMap<>();

        for (int i=0; i <  log.length ; i++) {
//            System.out.println(Arrays.stream(log[i]).toList());


            for (int j=0; j < 3; j++) {
//                System.out.println( log[i][j]);

//                map.put(log[i], map.getOrDefault(j,  []));
            }
            i++;
        }


        return list;


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
