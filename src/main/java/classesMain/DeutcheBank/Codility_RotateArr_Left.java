package classesMain.DeutcheBank;

import java.util.Arrays;

/**
 * Solution to rotate an array to the left by a given number of steps.
 * Uses the reversal algorithm for O(n) time and O(1) space complexity.
 * 
 * Example: Rotating {3, 8, 9, 7, 6} left by 2 steps gives {9, 7, 6, 3, 8}
 */
public class Codility_RotateArr_Left {

    public static void main(String[] args) {
        int[] array = {3, 8, 9, 7, 6};
        int stepsToRotate = 1;
        System.out.println(Arrays.toString(rotateLeft(array, stepsToRotate)));
    }

    /**
     * Rotates an array to the left by the specified number of steps.
     * 
     * Algorithm: Use three reversals to achieve rotation in O(n) time and O(1) space.
     *
     * @param array the array to rotate
     * @param stepsToRotate the number of positions to rotate left
     * @return the rotated array
     */
    private static int[] rotateLeft(int[] array, int stepsToRotate) {
        if (array == null || array.length == 0) {
            return array;
        }

        int length = array.length;
        stepsToRotate %= length;

        // For LEFT rotation: reverse first k, reverse rest, then reverse all
        reverse(array, 0, stepsToRotate - 1);
        reverse(array, stepsToRotate, length - 1);
        reverse(array, 0, length - 1);

        return array;
    }

    /**
     * Reverses a portion of an array in-place from start to end indices (inclusive).
     *
     * @param array the array to reverse
     * @param start the starting index (inclusive)
     * @param end the ending index (inclusive)
     */
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
