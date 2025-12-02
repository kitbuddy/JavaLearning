package classesMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substring_with_concatenation_of_all_words {

    public static void main(String[] args) {
//        String s = "barfoothefoobarman";
//        String[] words =  {"foo","bar"};

        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};
//
//        String s = "barfoofoobarthefoobarman";
//        String[] words = {"bar","foo","the"};

//        String s = "wordgoodgoodgoodbestword";
//        String[] words = {"word","good","best","good"};
        System.out.println(Substring_with_concatenation_of_all_words.getStartingIndicesArray(s, words));
    }

    private static List getStartingIndicesArray(String s, String[] words) {

        List<Integer> result = new ArrayList<>();
        int L = 0;
        List<String> CollectionString = getAllStringCreated(words);

        HashMap<String, Integer> map = new HashMap<>();
        int lengthOfAllWordsInArray = 0;

        for(String smallString: words) {
            L = smallString.length();
            lengthOfAllWordsInArray += smallString.length();
            map.put(smallString, map.getOrDefault(smallString, 0) +1);
        }

//        System.out.println(map);

        String word = "";
        Map<String, Integer> newMap = new HashMap<>();
        for(int i = 0; i< s.length() -lengthOfAllWordsInArray-1; i++) {
//            for (int j = i+lengthOfAllWordsInArray; j<= s.length()-1; j++) {
            String substring = s.substring(i, i + lengthOfAllWordsInArray);
            System.out.println(word);

            Map<String, Integer> currentMap = new HashMap<>();

            boolean isValid = true;


            // Break the substring into chunks of length L
            for (int j = 0; j < substring.length(); j += L) {
                String chunk = substring.substring(j, j + L);

                // Check if chunk is a valid word
                if (!map.containsKey(chunk)) {
                    isValid = false;
                    break;
                }

                currentMap.put(chunk, currentMap.getOrDefault(chunk, 0) + 1);

                // Check if the frequency of the chunk exceeds the expected frequency
                if (currentMap.get(chunk) > map.get(chunk)) {
                    isValid = false;
                    break;
                }
            }
            // If the substring is valid, add its starting index to the result

            if (isValid) {
                result.add(i);
            }
        }

//            newMap.put(word, map.getOrDefault(word, 0) +1);

//        }

        System.out.println("newMap");

        return result;

    }

    private static List<String> getAllStringCreated(String[] words) {

        List<String> list = new ArrayList<>();

        return list;
    }
}
