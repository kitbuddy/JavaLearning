package classesMain;

import java.util.Arrays;
import java.util.List;

public class Two_Sum_II {
// Given a 1-indexed array of integers numbers
// that is already sorted in non-decreasing order,
// find two numbers such that they add up to a specific target number.
// Let these two numbers be numbers[index1] and numbers[index2]
// where 1 <= index1 < index2 <= numbers.length.
//
//Return the indices of the two numbers, index1 and index2,
// added by one as an integer array [index1, index2] of length 2.
//
//The tests are generated such that there is exactly one solution.
// You may not use the same element twice.
//
//Your solution must use only constant extra space.

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Two_Sum_II.getFinalOutputSumValue(nums, target));
    }

    private static List<Integer> getFinalOutputSumValue(int[] nums, int target) {

        int i = 0;
        int j = nums.length -1;
        while(i<j) {
            if(nums[i] + nums[j] > target) {
                j--;
            } else if(nums[i] + nums[j] < target) {
                i++;
            } else {
                return Arrays.asList( i +1, j+1 );
            }
        }
        return  null;
    }
}
