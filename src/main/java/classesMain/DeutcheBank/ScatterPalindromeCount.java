package classesMain.DeutcheBank;

import java.util.HashMap;
import java.util.Map;

public class ScatterPalindromeCount {

    /*Given a string, count how many substrings can be rearranged to form a palindrome.*/


    // A string is a scatter palindrome if,
    // when considering the counts of each unique character within it,
    // at most one character appears an odd number of times.
    // All other characters must appear an even number of times.

    public static void main(String[] args) {
        String s = "aabbccdd";
        System.out.println(ScatterPalindromeCount.checkIfStringIsScatterPalindrome(s));
//        System.out.println(ScatterPalindromeCount.getTotalPalindromeCount(s));
    }
//
//    private static boolean getTotalPalindromeCount(String s) {
//        Map<Character, Integer> scattermap = new HashMap<>();
//
//        for(char c :s.toCharArray()) {
//            scattermap.put(c, scattermap.getOrDefault(c, 0)+1);
//        }
//
//    }

    private static boolean checkIfStringIsScatterPalindrome(String s) {
        Map<Character, Integer> scattermap = new HashMap<>();

        for(char c :s.toCharArray()) {
            scattermap.put(c, scattermap.getOrDefault(c, 0)+1);
        }
        int counter = 0;
        for (int value : scattermap.values()) {
            if(value % 2 != 0) {
                counter ++;
                if(counter > 1) {
                    return false;
                }
            } else {
            }
        }
        return true;
    }
}
