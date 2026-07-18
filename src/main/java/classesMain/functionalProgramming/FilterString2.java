package classesMain.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString2 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "elderberry"};
        ArrayList<String> arrList = new ArrayList<>();
        for (String str : arr) {
            arrList.add(str);
        }
        ArrayList<String> words = new ArrayList<>(Arrays.asList("tab", "tablet", "bault", "stat"));


        String referenceWord = "berry";
        ArrayList<String> stringList = filterStringsWhichContainsReferenceWordCharacters(arrList, referenceWord);
        System.out.println("Filtered strings (contains characters from '" + referenceWord + "'): ");

        System.out.println(stringList);  // [elderberry]
        List<String> stringList2 = filterStringsWhichContainsReferenceWordCharacters2(words, "bat");
        System.out.println("Filtered strings (contains characters from '" + "bat" + "'): ");

        System.out.println(stringList2);  // [tab, tablet, bault]
    }

    private static List<String> filterStringsWhichContainsReferenceWordCharacters2(ArrayList<String> arrList, String referenceWord) {
       ArrayList<String> words = new ArrayList<>();
       List<String> filtered = arrList.stream()
                .filter(word -> referenceWord.chars()
                        .allMatch(c -> word.contains(String.valueOf((char) c))))
                .collect(Collectors.toList());
        System.out.println(filtered);  // [tab, tablet, bault]
        return filtered;
    }

    private static ArrayList<String> filterStringsWhichContainsReferenceWordCharacters(ArrayList<String> arrList, String referenceWord) {
        return new ArrayList<>(arrList.stream()
                .filter(word -> containsAllCharacters(word, referenceWord)).toList());
    }

    private static boolean containsAllCharacters(String word, String referenceWord) {
        for (char c : referenceWord.toCharArray()) {
            if (!word.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
