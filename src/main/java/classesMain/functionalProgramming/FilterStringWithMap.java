package classesMain.functionalProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterStringWithMap {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("tab");
        words.add("tablet");
        words.add("bault");

        System.out.println(filterStringsWhichContainsReferenceWordCharacters2(words, "batt"));
    }

    private static List<String> filterStringsWhichContainsReferenceWordCharacters2(
            ArrayList<String> arrList,
            String referenceWord
    ) {
        Map<Character, Integer> referenceMap = getCharacterCountMap(referenceWord);

        return arrList.stream()
                .filter(word -> hasRequiredCharacterCounts(word, referenceMap))
                .collect(Collectors.toList());
    }

    private static boolean hasRequiredCharacterCounts(
            String word,
            Map<Character, Integer> referenceMap
    ) {
        Map<Character, Integer> wordMap = getCharacterCountMap(word);

        for (Map.Entry<Character, Integer> entry : referenceMap.entrySet()) {
            char character = entry.getKey();
            int requiredCount = entry.getValue();

            if (wordMap.getOrDefault(character, 0) < requiredCount) {
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> getCharacterCountMap(String word) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
}
