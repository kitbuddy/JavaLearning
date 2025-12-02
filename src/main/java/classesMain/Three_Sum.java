package classesMain;

import java.util.*;


public class Three_Sum {



    // Given an integer array nums, return all the triplets
    // [nums[i], nums[j], nums[k]]
    // such that i != j, i != k, and j != k,
    // and nums[i] + nums[j] + nums[k] == 0.
    //Notice that the solution set must not contain duplicate triplets.
    //Example 1:
    //Input: nums = [-1,0,1,2,-1,-4]
    //Input: nums = [-4, -1, -1, 0, 1, 2]
    //Output: [[-1,-1,2],[-1,0,1]]
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(Three_Sum.findTriplets(nums));
    }

    private static Set<List<Integer>> findTriplets(int[] nums) {
        int j;
        int k;
        Set<List<Integer>> finalResult = new HashSet<>();
        List<Integer> initialList = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(String.format(Arrays.toString(nums)));
        for (int i =0; i<nums.length-1; i++) {
            j = i+1;
            k = nums.length-1;
            int sum = nums[i] + nums[j] + nums[k];

            if(i !=j && i != k && j != k ) {
                if(sum == 0) {
                    initialList = new ArrayList<>();

                    initialList.add(nums[i]);
                    initialList.add(nums[j]);
                    initialList.add(nums[k]);
                    j++;
                    k--;

                } else if(sum > 0) {
                    k--;
                } else  {
                    j++;
                }
            }
        }
        finalResult.add(initialList);
//        initialList = new ArrayList<>();



        return  finalResult;

    }
}

   /*
  Set<List<Integer>> finalResult = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    finalResult.add(triplet);

                    // Move both pointers and skip duplicates
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return finalResult;          */