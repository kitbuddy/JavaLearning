package classesMain.PracticeMakeTheManPerfect;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,3,5,2,4,2};
        TwoPointer.understandTwoPointerBackwardsRestrictedEasy(arr);
    }

    private static void understandTwoPointerMovingTogether(int[] arr) {
        int left = 0;
        for (int right = 1; right < arr.length; right++) {
            System.out.printf("left:" + left + "\n");
            System.out.println("right" + right);
            if(arr[left] > arr[right]) {
                System.out.println(arr[left]);
            } else {
                System.out.println(arr[right]);
            }
            left ++;
        }
    }

    private static void understandTwoPointerNSquare(int[] arr) {
        for (int left = 0; left <arr.length-1; left++) {
            for (int right =1; right < arr.length; right ++) {
                System.out.printf("left:" + left + "\n");
//                System.out.println(arr[left]);
                System.out.println("right" + right);
//                System.out.println(arr[right]);
            }
        }
    }

    private static void understandTwoPointerBackwards(int[] arr) {
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));
        for (int left = 0; left < sortedArray.length-1; left++) {
            for (int right = sortedArray.length; right >= 0; right --) {
                System.out.println("{left : " + left +" right : " + right + "}");
            }
        }
    }

    private static void understandTwoPointerBackwardsRestricted(int[] arr) {
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(sortedArray));
        int left = 0;
        int right = arr.length;
//        int left;
//        int right;
        while(left < right) {
            System.out.println("i came out of for loop");
            for (left = 0; left < sortedArray.length - 1; left++) {
                for (right = sortedArray.length; right >= 0; right--) {
                    System.out.println("{left : " + left + " right : " + right + "}");
                }
            }
        }
    }

    private static void understandTwoPointerBackwardsRestrictedWithWhileLoop(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            System.out.println("{left : " + left + " right : " + right + "}");
            left++;
            right--;
        }
    }

    private static void understandTwoPointerBackwardsRestrictedEasy(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        for (left = 0; left < arr.length -1; left ++) {
            while (left < right) {
                System.out.println("{left : " + left + " right : " + right + "}");
                right --;
                break;
            }
        }
    }
    private static void understandTwoPointerBackwardsRestrictedWith2ForLoops(int[] arr) {

        for (int left = 0; left < arr.length -1; left ++) {
            for (int right = arr.length-1; right >= 0; right --) {
                while ( left < right) {
                    System.out.println("{left : " + left + " right : " + right + "}");
                    break;
                }
            }
        }
    }

}
