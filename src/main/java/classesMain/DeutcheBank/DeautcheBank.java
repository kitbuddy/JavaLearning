package classesMain.DeutcheBank;

import java.util.HashSet;

public class DeautcheBank {

    String value = "aabbcccaaaccuuu";

    // Find the occurrence of each consecutive aa or aabb
    // https://leetcode.com/problems/longest-substring-without-repeating-characters/


    public int lengthOfLongestSubstring(String s) {

//        char[] charArray = s.toCharArray();
//        StringBuilder longestString = new StringBuilder();
//
//        for (int i = 0; i < charArray.length - 1; i++) {
//            for (int j = 1; j < charArray.length - 2; j++) {
//                longestString.append(charArray[i]);
//                if (longestString.toString().contains(String.valueOf(charArray[j]))) {
////                    i++;
//                    j++;
//                    continue;
//                } else {
//                    if (j + 1 < charArray.length) {
//                        longestString.append(charArray[j + 1]);
//                    }
//                    break;
//                }
//
//
//            }
//        }
//        return longestString.toString();

        int a_pointer = 0;
        int b_pointer = 0;
        int max_length = 0;

        HashSet<Character> hash_set = new HashSet<>();

        while(b_pointer < s.length()) {
            if(!hash_set.contains(s.charAt(b_pointer))) {
                hash_set.add(s.charAt(b_pointer));
                b_pointer++;
                max_length = Math.max(hash_set.size(), max_length);
            } else {
                hash_set.remove(s.charAt(a_pointer));
                a_pointer++;
            }

        }
        return max_length;
    }

    public static void main(String[] args) {
        DeautcheBank test = new DeautcheBank();
        System.out.println(test.lengthOfLongestSubstring("abcabcbb"));
    }

}
