package classesMain.DeutcheBank;

import java.util.Arrays;

public class Codility_RotateArr_Left {

    public static void main(String[] args) {
        int stepsToRotate = 3;
        int[] arr =  {1,2,3,4,5};
        // {4,5,1,2,3}
        System.out.println(Arrays.toString(Codility_RotateArr_Left.rotateLeft(arr, stepsToRotate)));
    }

    private static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr, 0, n-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, k-1);
        return arr;
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
