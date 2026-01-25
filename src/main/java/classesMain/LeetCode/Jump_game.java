package classesMain.LeetCode;

public class Jump_game {
    class Solution {
        public static boolean canJump(int[] nums) {
            int maxReach = 0;

            for(int i=0; i<nums.length-1; i++) {
//                maxReach = maxReach + nums[i];
                if (maxReach < i) {
                    return false;
                }
                // Update the max reach
                maxReach = Math.max(maxReach, i + nums[i]);

                if (maxReach >= nums.length-1) {
                    return true;
                }
//                } else if (maxReach < nums.length){
//                    i = nums[i];
//
//                }
            }
                return false;

        }
    }
//
//    public static void main(String[] args) {
////        int[] nums = {2, 3, 1, 1, 4};
////        int[] nums = {3,2,1,0,4};
////        int[] nums = {0};
//        int[] nums = {1,2};
//
//        System.out.println(Jump_game.canJump(nums));
//    }
}
