package classesMain.DeutcheBank;

import java.util.Arrays;

public class SmallestSumGreaterThanTarget {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int T = 90;
        System.out.println(Arrays.toString(SmallestSumGreaterThanTarget.getTwoIntegers(arr, T)));

    }

    private static int[] getTwoIntegers(int[] arr, int value) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int sum = Integer.MAX_VALUE;
        int[] result = new int[]{-1, -1};
        while (left < right) {
            int product = arr[left] * arr[right];
            if (product >= value) {
                int currentSum = arr[left] + arr[right];
                if (currentSum < sum) {
                    sum = currentSum;
                    result = new int[]{arr[left], arr[right]};
                }
                right--;
            } else {
                left++;
            }

        }
        return result;
    }

    public static int[] findMinSumPair(int[] arr, int value) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        int minSum = Integer.MAX_VALUE;
        int[] result = new int[]{-1, -1};

        while (left < right) {

            int product = arr[left] * arr[right];

            if (product >= value) {
                int currentSum = arr[left] + arr[right];

                if (currentSum < minSum) {
                    minSum = currentSum;
                    result = new int[]{arr[left], arr[right]};
                }

                // Try to reduce sum → move RIGHT backward
                right--;

            } else {
                // Product too small → move LEFT forward
                left++;
            }
        }

        return result;
    }

}
