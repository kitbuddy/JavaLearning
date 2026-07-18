package classesMain.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class updateCharacters {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        List<String> arr2 = Arrays.asList("ankit", "test", "ball", "cat", "dog");
//        System.out.println(findMissingNumber(arr));
        updateCharacters.updateValueCharacter3(arr2);
    }

    private static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = (n + 1) * (n + 2) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    private static void testITRunner(List<String> arr2) {
        String value = arr2.stream()
                .filter(v -> v.startsWith("b"))
                .findFirst().orElse(null);
        System.out.println(value);
    }

    private static void updateValue(List<String> arr2) {

        for(String s : arr2) {
            if(s.startsWith("a")) {
                arr2.set(arr2.indexOf(s), "X");
            }
        }
        System.out.println(arr2);
    }

    private static void updateValueCharacter(List<String> arr2) {

        for(String s : arr2) {
            if(s.contains("a")) {
                int index = arr2.indexOf(s);
                String updatedString = s.replace('a', 'X');
                arr2.set(index, updatedString);
            }
        }
        System.out.println(arr2);
    }

    private static void updateValueCharacter2(List<String> arr2) {
        List<String> updatedList = arr2.stream()
                .map(value -> value.replace('a', 'X'))
                .toList();

        System.out.println(updatedList);
    }

    private static void updateValueCharacter3(List<String> arr2) {
      List<String> myUpdatedList = arr2.stream()
              .filter(val -> val.contains("a")).toList();

        System.out.println(myUpdatedList);
    }
}
