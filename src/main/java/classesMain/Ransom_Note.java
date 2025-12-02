package classesMain;

import java.util.HashMap;
import java.util.Map;

/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

Input: ransomNote = "baa", magazine = "aab"
Output: true
*/

public class Ransom_Note {

    public static void main(String[] args) {
        Ransom_Note ransomNote = new Ransom_Note();
        System.out.println(ransomNote.canConstruct("baa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {



//
//        int[] count = new int[26];
//
//        // magazine ke characters ki frequency badhao
//        for (char c : magazine.toCharArray()) {
//            count[c - 'a']++;
//        }
//
//        // ransomNote me required characters check karo
//        for (char c : ransomNote.toCharArray()) {
//            count[c - 'a']--;
//            if (count[c - 'a'] < 0) {
//                return false;
//            }
//        }
//
//        return true;


        if (magazine.length() > ransomNote.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int n = magazine.length();
        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
                n--;
            } else {
                return false;
            }

        }
        return  n ==0;
    }
}
