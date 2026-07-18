package classesMain.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] filteredArr = filterEvenNumbers(arr);
        System.out.println(Arrays.toString(filteredArr));

    }

    private static int[] filterEvenNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Filtered even numbers: ");
        for (int num : arr) {
            if(num%2==0) {
               list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
