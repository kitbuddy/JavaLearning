package classesMain.DeutcheBank;

import java.util.Arrays;

public class Codility_MaxProductOfThree {


    /*A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:

(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A, returns the value of the maximal product of any triplet.

For example, given array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [3..100,000];
each element of array A is an integer within the range [−1,000..1,000].
Copyright 2009–2025 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.*/
    public static void main(String[] args) {
        int[] arr = {-3,1,2,-2,5,6};
        System.out.println(Codility_MaxProductOfThree.getMaxProduct(arr));
        System.out.println(Codility_MaxProductOfThree.anotherWay(arr));
    }

    private static int getMaxProduct(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int countElements = 3; // last three elements
        int startIndex = Math.max(0, arr.length - countElements);
        int product = 1;
        for (int i = arr.length-1; i>=startIndex ; i--) {
            product *= arr[i];
        }
        return product;
    }

    private static int anotherWay(int[] arr) {

        sortArrayInDecreasingOrder(arr);
        int product = 1;
        for (int i = 0; i<3 ; i++) {
            product *= arr[i];
        }
        int first3IntegerProduct = arr[0] * arr[1] * arr[2];
        product = Math.max(product, first3IntegerProduct);
        return product;
    }

    private static void sortArrayInDecreasingOrder(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while(left < right){

        }

    }

    public static int[] reversingArray(int[] arr) {
//        arr = new int[] {-3,1,2,-2,5,6};;
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
