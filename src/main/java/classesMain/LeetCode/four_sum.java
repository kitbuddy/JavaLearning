package classesMain.LeetCode;

import java.util.*;

public class four_sum {

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2 };
        int sum = 0;
        System.out.println(four_sum.searchQuadruplets(nums, sum));
    }


    private static Set<List<Integer>> searchQuadruplets(int[] nums, int sum) {
        Arrays.sort(nums);
        int k =0;
        int l=0;
        Set<List<Integer>> finalSolution = new HashSet<>();
        List<Integer> currentList = new ArrayList<>();
        System.out.println("sorted list");
        System.out.println(String.format(Arrays.toString(nums)));
        // {-2, -1, 0,0,1,2}

        for(int i =0; i<nums.length-3; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
          for (int j = i+1; j< nums.length -2; j++) {
              if(j > i+1 && nums[j] == nums[j-1]) {
                  continue;
              }
              k = j + 1;
              l = nums.length - 1;


              while (k < l) {
                  int currentSum = nums[i] + nums[j] + nums[k] + nums[l];

                  if (currentSum == sum) {
                      currentList = new ArrayList<>();
                      currentList.add(nums[i]);
                      currentList.add(nums[j]);
                      currentList.add(nums[k]);
                      currentList.add(nums[l]);
                      k++;
//                    j++;
                      l--;
                      // skip duplicates
                      while (k < l && nums[k] == nums[k - 1]) k++;
                      while (k < l && nums[l] == nums[l + 1]) l--;
                      finalSolution.add(currentList);

                  } else if (currentSum < 0) {
                      k++;
                  } else  {
                      l--;
                  }
                  System.out.println(nums[i]);
                  System.out.println(nums[j]);
                  System.out.println(nums[k]);
                  System.out.println(nums[l]);
              }
          }
        }
        System.out.println("final Solution");
        return finalSolution;
    }

}
