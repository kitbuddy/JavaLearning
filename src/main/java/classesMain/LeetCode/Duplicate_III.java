package classesMain.LeetCode;

import java.util.HashMap;

public class Duplicate_III {

    /*You are given an integer array nums and two integers indexDiff and valueDiff.
        Find a pair of indices (i, j) such that: i != j,
        abs(i - j) <= indexDiff.
        abs(nums[i] - nums[j]) <= valueDiff, and Return true if such pair exists or false otherwise.*/

    public static boolean containsDuplicateIII(int[] nums, int indexDiff, int valueDiff) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer lastIndex = map.get(nums[i]);
            if (i != lastIndex &&
                    (Math.abs(i-lastIndex) <= indexDiff) &&
                    (Math.abs(nums[i] - nums[lastIndex]) <= valueDiff)) {
                return true;
            } else {
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums =  {1,0,1,1 };
        int indexDiff = 1;
        int valueDiff = 2;
        System.out.println(containsDuplicateIII(nums, indexDiff, valueDiff));
    }
}
