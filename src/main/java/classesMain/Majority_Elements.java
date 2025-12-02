package classesMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority_Elements {

    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        int threshold = nums.length/3;
        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {

            if(mapElement.getValue() > threshold) {
                list.add(mapElement.getKey());
            }
        }

//        map.forEach((key,value) -> {
//            if(value > threshold) {
//                list.add(key);
//            }
//        });
        return list;

    }

    public static void main(String[] args) {
        Majority_Elements majorityElements = new Majority_Elements();
        int[] nums =  {3,2,3 };
        System.out.println( majorityElements.majorityElement(nums) );
    }
}
