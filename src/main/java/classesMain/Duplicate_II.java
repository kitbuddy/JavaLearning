package classesMain;

import java.util.Arrays;
import java.util.HashMap;

public class Duplicate_II {

    /*Given an integer array nums and an integer k, return true
    if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.*/

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                Integer lastIndex = map.get(nums[i]);
                if(i - lastIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

}
