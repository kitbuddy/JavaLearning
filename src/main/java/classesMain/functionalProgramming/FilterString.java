package classesMain.functionalProgramming;

import java.util.ArrayList;

public class FilterString {

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "elderberry"};
        ArrayList<String> arrList = new ArrayList<>();
        for (String str : arr) {
            arrList.add(str);
        }
//        ArrayList<String> arrList = new ArrayList<>();
//        for (String str : arr) {
//            arrList.add(str);
//        }
//        String[] filteredArr = filterStringsStartWith(arr, "a");
//        System.out.println("Filtered strings (start with 'a'): ");
//        for (String str : filteredArr) {
//            System.out.println(str);
//        }
//        // Or
//        ArrayList<String> StringList = filterContainsChar(arrList, 'e');
//        System.out.println("Filtered strings (contains 'e'): ");
//        for (String str : StringList) {
//            System.out.println(str);
//        }
    }
    private static ArrayList<String> filterContainsChar(ArrayList<String> arr, char e) {
        return new ArrayList<>(arr.stream().filter(word -> word.contains(String.valueOf(e))).toList());
    }

    private static String[] filterStringsStartWith(String[] arr, String prefix) {
        return java.util.Arrays.stream(arr)
                .filter(str -> str.startsWith(prefix))
                .toArray(String[]::new);
    }
}
