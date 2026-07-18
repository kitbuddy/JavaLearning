package classesMain.DeutcheBank;

import java.util.HashMap;
import java.util.Map;

public class Codility_OddOccurrenceNumberLike {
    public static void main(String[] args) {
        int[] A =  {9, 3, 9, 3, 9, 9};
//        System.out.println(OddOccurrenceNumber.getSingleValueFastUsingMap(A));
        System.out.println(Codility_OddOccurrenceNumberLike.getSingleValueFastUsingXOR(A));
    }

    private static int getSingleValueFastUsingXOR(int[] arr) {
        int result = 0;
        for(int i: arr) {
            result ^= i;
        }
        return result;
    }

    private static int getSingleValueFastUsingMap(int[] arr) {
       int result = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int num: arr) {
            myMap.put(num, myMap.getOrDefault(num, 0)+1);
        }
        System.out.println(myMap);
        for (Map.Entry<Integer, Integer> myValue: myMap.entrySet()){
            if(myValue.getValue() %2 ==1) {
                result = myValue.getKey();
            }
        }
        return result;
    }
}
