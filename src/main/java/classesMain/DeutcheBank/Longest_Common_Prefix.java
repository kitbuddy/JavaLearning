package classesMain.DeutcheBank;

import java.util.HashMap;
import java.util.Map;

public class Longest_Common_Prefix {

    // 14. Longest Common Prefix
    //Easy
    //Topics
    //premium lock icon
    //Companies
    //Write a function to find the longest common prefix string amongst an array of strings.
    //
    //If there is no common prefix, return an empty string "".
    //
    //
    //
    //Example 1:
    //
    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    //Example 2:
    //
    //Input: strs = ["dog","racecar","car"]
    //Output: ""
    //Explanation: There is no common prefix among the input strings.
    //

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(Longest_Common_Prefix.findLongestPrefix(strs));
    }

    private static String findLongestPrefix(String[] strArray) {
        if (strArray == null || strArray.length == 0) {
            return "";
        }

        String prefix = strArray[0];
        // indexOf() returns 0 if the prefix is found at the beginning
        for (int i = 1; i < strArray.length; i++) {
            String currentStr = strArray[i];

            // Check if the current prefix is a prefix of the current string
            // indexOf() returns 0 if the prefix is found at the beginning
            while (currentStr.indexOf(prefix) != 0) {
                // If not, shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, there is no common prefix among all strings
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

//    private static String getShortestString(String[] strs) {
//        longest_word_inArray shortestString = new longest_word_inArray();
//        return shortestString.getShortestString(strs);
//    }
        return prefix;
    }
}
