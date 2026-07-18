package classesMain.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        int[] squaredArr = squareArray(arr);
        System.out.print("Squared array elements: ");
        for (int num : squaredArr) {
            System.out.print(num + " ");
        }

        // OR
        List<Integer> squaredArr2 = squareArrayFunctional(arr);
        System.out.print("\nSquared array elements (functional): ");
        for (int num : squaredArr2) {
            System.out.print(num + " ");
        }
    }
        private static int[] squareArray (List < Integer > arr) {
            List<Integer> squaredList = new ArrayList<>();
            for (int num : arr) {
                squaredList.add(num * num);
            }
            return squaredList.stream().mapToInt(Integer::intValue).toArray();
        }

    private static List<Integer> squareArrayFunctional(List<Integer> arr) {
//        return arr.stream().map(num -> num * num).toList();

        return arr.stream().distinct().sorted().map(e -> e * e ).toList();
    }
}