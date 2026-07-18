package classesMain.functionalProgramming;

import java.util.Arrays;

public class SumReduce {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumArray(arr);
        // OR
        int sum2 = reduceNumbers(arr);
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Sum of array elements (functional): " + sum2);
    }

    private static int reduceNumbers(int[] arr) {
        int sum = Arrays.stream(arr).reduce(0, (num1, num2) -> num1 + num2);
        return sum;
    }


    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
