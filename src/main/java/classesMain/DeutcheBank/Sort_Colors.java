package classesMain.DeutcheBank;

import java.util.Arrays;

public class Sort_Colors {

    // Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of
    // the same color are adjacent, with the colors in the order red, white, and blue.
    //We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    //You must solve this problem without using the library's sort function.

    // Solve by using 3 pointers / Dutch flag algorithm created by Dijkstra
    //Example 1:
    //
    //Input: nums = [2,0,2,1,1,0]
    //Output: [0,0,1,1,2,2]
    //Example 2:
    //
    //Input: nums = [2,0,1]
    //Output: [0,1,2]

    public static void main(String[] args) {
        int[] nums =  {2,0,2,1,1,0,2,2,0,};
        System.out.println(Arrays.toString(Sort_Colors.sortColors(nums)));
    }

    private static int[] sortColors(int[] nums) {

//        for(int left = 0; left< nums.length -1; left++) {
//            for (int right = left +1; right < nums.length; right++) {
//                if (nums[left] > nums[right]) {
//                    int temp =  nums[left];
//                    nums[left] = nums[right];
//                    nums[right] = temp;
//                }
//            }
//        }
//        return nums;

        int j = 0;
        int i =0;
        int k = nums.length-1;

        while (i <= k) {
            if(nums[i] == 0) {
                nums = swap(nums, i, j);
                i++;
                j++;
            } else if(nums[i] == 1) {
                i++;
            } else {
               swap(nums, i, k);
               k--;
            }
        }

        return nums;
    }

    private static int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
       return nums;
    }
}
