package classesMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substring_with_concatenation_of_all_words2 {

    public static void main(String[] args) {
//        String s = "barfoothefoobarman";
//        String[] words =  {"foo","bar"};
//
//        String s = "wordgoodgoodgoodbestword";
//        String[] words = {"word", "good", "best", "word"};
//
//        String s = "barfoofoobarthefoobarman";
//        String[] words = {"bar","foo","the"};

        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};
        System.out.println(Substring_with_concatenation_of_all_words2.findSubstring(s, words));
    }

        public static List<Integer> findSubstring(String s, String[] words) {
            List<Integer> result = new ArrayList<>();
            if (s == null || words == null || words.length == 0) return result;

            int eachWordLength = words[0].length();
            int totalLen = words.length * eachWordLength;

            Map<String, Integer> wordMap = new HashMap<>();
            for (String w : words) wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);

            for (int i = 0; i < eachWordLength; i++) {
                int left = i, right = i;
                Map<String, Integer> seen = new HashMap<>();

                while (right + eachWordLength <= s.length()) {
                    String w = s.substring(right, right + eachWordLength);
                    right += eachWordLength;

                    if (!wordMap.containsKey(w)) {
                        seen.clear();
                        left = right;
                    } else {
                        seen.put(w, seen.getOrDefault(w, 0) + 1);

                        while (seen.get(w) > wordMap.get(w)) {
                            String leftWord = s.substring(left, left + eachWordLength);
                            seen.put(leftWord, seen.get(leftWord) - 1);
                            left += eachWordLength;
                        }

                        if (right - left == totalLen) {
                            result.add(left);
                        }
                    }
                }
            }

            return result;
        }
}
