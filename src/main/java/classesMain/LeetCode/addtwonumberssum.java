package classesMain.LeetCode;

import java.util.Arrays;

public class addtwonumberssum {

        public int[] twoSum(int[] nums, int target) {

//            nums = new int[]{1, 2, 3, 4};
            int[] result = new int[2];

            for(int i=0; i< nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[i] + nums[j] == target) {
                        result = new int[] {i, j};
                    }
                }
            }
            return result;
        }

    public static void main(String[] args) {
        addtwonumberssum test = new addtwonumberssum();
        Arrays.stream(test.twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
    }
}
