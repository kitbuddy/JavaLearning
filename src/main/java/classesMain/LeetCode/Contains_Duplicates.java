package classesMain.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Contains_Duplicates {
    public static boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            // If the number is already in the set, return true (duplicate found)
            if (!hashSet.add(num)) {
                return true;
            }
        }
        // If no duplicates are found, return false
        return false;
    }

    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums) {
        map.put(i, map.getOrDefault(i, 0) +1);
    }
        System.out.println(map);

        return map.values().stream().anyMatch(s -> s>1 );
    }

    public static void main(String[] args) {
        int[] nums = {7,10,5,5,6,6,4,10,5,4,9,4,9,6,5,9,6,3,6,5,6,7,7,4,9,9,10,5,8,1,8,3,2,7,5,10,1,8,5,8,4,3,6,4,9,4,2,8,3,2,2,1,5,6,3,2,6,1,8,6,2,9,1,4,5,10,8,5,10,5,10,1,4,8,3,6,4,10,9,1,1,1,2,2,9,6,6,8,1,9,2,5,5,2,1,8,5,2,3,10};
        Contains_Duplicates containsDuplicates = new Contains_Duplicates();
        System.out.println(containsDuplicates.containsDuplicate(nums));
    }
}
