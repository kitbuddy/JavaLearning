package classesMain.DeutcheBank;

import java.util.Arrays;

public class Codility_RotateArray_Right {
    /*An array A consisting of N integers is given.
    Rotation of the array means that each element is shifted right by one index,
    and the last element of the array is moved to the first place.
    For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
    (elements are shifted right by one index and 6 is moved to the first place).
    The goal is to rotate array A K times; that is, each element of A will be shifted
    to the right K times.

    Write a function:

    class Solution { public int[] solution(int[] A, int K); }

*/
    public static void main(String[] args) {
        int stepsToRotate = 1;
        int[] arr =  {3, 8, 9, 7, 6};
        System.out.println(Codility_RotateArray_Right.rotateRight(arr, stepsToRotate));
    }

    private static String rotateRight(int[] arr, int stepsToRotate) {
        int length = arr.length;
        stepsToRotate %= length;
        reverse(arr, 0, length - 1);
        reverse(arr, 0, stepsToRotate - 1);
        reverse(arr, stepsToRotate, length - 1);
        return Arrays.toString(arr);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
