package classesMain.PracticeMakeTheManPerfect;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class db_2 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};
//        System.out.println(pairQuestion(arr));
        System.out.println(anotherWayToFindPairs(arr));
    }

    private static boolean pairQuestion(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap();
        if(arr.length % 2 != 0) {
            return false;
        }

        for (int i : arr) {
            myMap.put(i, myMap.getOrDefault(i, 0) +1);
        }

//        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
//            return entry.getValue() % 2 == 0;
//        }

        return false;
    }

    public static boolean anotherWayToFindPairs(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (!set.add(i)) {
                set.remove(i);
            }
        }
        return set.isEmpty();
    }
}
