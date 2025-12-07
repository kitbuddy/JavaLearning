package classesMain.DeutcheBank;

import java.util.HashMap;
import java.util.Map;

public class Deautche_bank_2 {

    // You are given an array of integers. Your task is to create pairs of them,
    // such that every created pair consists of equal numbers. Each array element may belong to one pair only.

    public static void main(String[] args) {



        // int[] arr = {1,2,2,1, 7};
         int[] arr =  {7,7,7};
        System.out.println(Deautche_bank_2.isEqualPairsAvailable(arr));
    }

    private static boolean isEqualPairsAvailable(int[] arr) {

        boolean res = false;
        if(arr.length % 2 !=  0) {
            res =  false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: arr) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        System.out.println(map.values());

        for( int val: map.values()) {
            if(val % 2 == 0) {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }
}
