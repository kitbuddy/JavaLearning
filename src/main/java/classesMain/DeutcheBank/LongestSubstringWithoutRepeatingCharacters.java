package classesMain.DeutcheBank;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";
//        String str = "pwwkew";
//        System.out.println(getLongestSubstringWithoutRepeatingCharacters(str));
        System.out.println(getLongestSubstringWithoutRepeatingCharactersUsingSlidingWindow(str));

    }

    private static int getLongestSubstringWithoutRepeatingCharactersUsingSlidingWindow(String str) {
        Set<Character> substring = new HashSet<>();
//        String longestSubstring = "";
        int maxLength = 0;
        int left = 0;
        int start = 0;

        for (int right =0; right<str.length(); right++) {
            while (substring.contains(str.charAt(right))) {
                substring.remove(str.charAt(left));
                left++;
            }

            substring.add(str.charAt(right));
            // if we want to find the substring then below block is necessary
            // else to find the max uniqueCharacter string above substring.length
            // should work
            if(right - left +1 > maxLength) {
                maxLength = right - left +1;
                start = left;
            }
        }

        System.out.println("String is : " + str.substring(start, start+maxLength));
        return str.substring(start, start+maxLength).length();

    }

//    private static String getLongestSubstringWithoutRepeatingCharacters(String str) {
//
//        String longestSubstring = "";
//        for (int i = 0; i< str.length(); i++){
//            for (int j = i+1; j < str.length(); j++) {
//                String currectString = str.substring(i, j);
//                if(currectString.length() > longestSubstring.length()) {
//                    longestSubstring = currectString;
//                }
//                char nextChar = str.charAt(j);
//                if(currectString.contains(String.valueOf(nextChar))) {
//                    i = j;
//                }
//
//            }
//        }
//        return longestSubstring;
//    }
}
