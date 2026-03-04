package classesMain.PracticeMakeTheManPerfect;

import java.util.*;

public class GetSimilarStrings {

    public static void main(String[] args) {
        List<String> s = List.of("swiss", "cross", "miss", "wheels", "silent", "listens");
        String str = "ss";  // Characters to check, including duplicate handling.

        List<String> result = findWordsContainingAllCharsUsingMap(s, str);
        System.out.println("Words that contain all characters of '" + str + "': " + result);
    }

    public static List<String> findWordsContainingAllCharsUsingMap(List<String> s, String str) {
        // Generate character frequency map for `str`
        Map<Character, Integer> targetFrequency = buildFrequencyMap(str);

        List<String> result = new ArrayList<>();

        for (String word : s) {
            // Generate character frequency map for the current word
            Map<Character, Integer> wordFrequency = buildFrequencyMap(word);

            // Check if the word satisfies the character frequency requirements
            if (isValidWord(wordFrequency, targetFrequency)) {
                result.add(word);
            }
        }

        return result;
    }

    // Helper method: Build a frequency map for a string
    private static Map<Character, Integer> buildFrequencyMap(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

    // Helper method: Check if the word frequency map meets/exceeds target frequency map
    private static boolean isValidWord(Map<Character, Integer> wordFrequency, Map<Character, Integer> targetFrequency) {
        for (Map.Entry<Character, Integer> entry : targetFrequency.entrySet()) {
            char c = entry.getKey();
            int requiredCount = entry.getValue();

            // If a character is missing or its count is insufficient, the word is invalid
            if (wordFrequency.getOrDefault(c, 0) < requiredCount) {
                return false;
            }
        }
        return true; // Word contains all required characters with the necessary frequency
    }
}