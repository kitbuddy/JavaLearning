package classesMain.PracticeMakeTheManPerfect;

public class MinWindowSize {

    //209. Minimum Size Subarray Sum
    // Given an array of positive integers nums and a positive integer target,
    // return the minimal length of a subarray whose sum is greater than or equal to
    // target. If there is no such subarray, return 0 instead.

    // variable Window size
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(MinWindowSize.getMinWindow(arr, target));
    }

    private static int getMinWindow(int[] nums, int target) {
        int n = nums.length;

        int left =0;
        int min_length = n+1;
        int current_Sum = 0;

        for(int right  = 0 ; right< n; right++) {
            current_Sum += nums[right];
            while (current_Sum >= target) {
                min_length = Math.min(min_length, right - left +1 );
                current_Sum = current_Sum - nums[left];
                left++;
            }
        }
        return min_length;
    }
}
