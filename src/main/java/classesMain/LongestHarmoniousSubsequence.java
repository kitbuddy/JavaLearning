package classesMain;

import java.util.*;

public class LongestHarmoniousSubsequence {
/*We define a harmonious array as an array where the
 difference between its maximum value and its minimum value is exactly 1.*/
    public static void main(String[] args) {
        int[] nums =  {1,3,2,2,5,2,3,7};
        System.out.println( LongestHarmoniousSubsequence.findLongestHarmoniousSubsequence(nums));

    }

    private static Integer  findLongestHarmoniousSubsequence(int[] nums) {
        int longestHarmoniousLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }


        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();

            }
        }

        System.out.println(map.get(maxFrequency));
//        int currentLongestLength = 0;
//        if(map.containsKey(map.get(map.get(maxFrequency)) - 1)) {
//            currentLongestLength = map.get(map.get(maxFrequency)) + (map.get(map.get(maxFrequency -1)) );
//        } else if(map.containsKey(map.get(map.get(maxFrequency) + 1))) {
//            currentLongestLength =map.get( map.get(maxFrequency)) + (map.get(map.get(maxFrequency +1 )));
//        }
//        longestHarmoniousLength = Math.max(longestHarmoniousLength, currentLongestLength);

        for (int key: map.keySet()) {
            if (map.containsKey(key + 1)) {
                int currentLength = map.get(key) + map.get(key + 1);
                longestHarmoniousLength = Math.max(longestHarmoniousLength, currentLength);
            }
        }
        System.out.printf("longestHarmoniousLength: ", longestHarmoniousLength);
        return longestHarmoniousLength;
    }
}
