package classesMain.PracticeMakeTheManPerfect;

import java.util.*;

public class GetNumberOfDuplicatedValues {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,3,5,2,4,2};
        System.out.println(GetNumberOfDuplicatedValues.getValues(arr));
    }

    private static Map<Integer, Integer> getValues(int[] arr) {
        int numberOfDuplicates = 0;

//        Set<Integer> mySet = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        Map<Integer, Integer> myMap = new HashMap<>();
        Map<Integer, Integer> resultMap = new HashMap<>();

        for(int val: arr) {
            myMap.put(val, myMap.getOrDefault(val, 0) +1);
        }

        for (Map.Entry<Integer, Integer> i : myMap.entrySet()) {
            if(i.getValue() > 1) {
                resultMap.put(i.getKey(), i.getValue()-1);
            }
        }


        return resultMap;
    }
}
