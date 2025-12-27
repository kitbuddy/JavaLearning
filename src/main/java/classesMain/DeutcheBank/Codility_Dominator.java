package classesMain.DeutcheBank;

import java.util.HashMap;
import java.util.Map;

public class Codility_Dominator {
    public static void main(String[] args) {
        int[] Arr = {3,4,3,2,3,-1, 3,3};
        System.out.println(Codility_Dominator.getDominator(Arr));
    }

//    private static int getDominator(int[] arr) {
//        int result = -1;
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i =0; i<arr.length; i++) {
//            int val = arr[i];
//            map.put(val, map.getOrDefault(val, 0)+1);
//                if (map.get(val) > arr.length / 2) {
//                   result = i;
//                   break;
//                }
//            }
//        return result;
//    }

    private static int getDominator(int[] arr) {
        int result = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (!map.containsKey(val)) {
                map.put(val, 1);
            } else {
                map.put(val, map.get(val) + 1);
            }
            if (map.get(val) > arr.length / 2) {
                result = i;
                break;
            }
        }
        return result;
    }
}
