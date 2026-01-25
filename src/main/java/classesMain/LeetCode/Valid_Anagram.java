package classesMain.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapt = new HashMap<>();

        for (Character c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        for (Character c : t.toCharArray()) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }

        return mapS.equals(mapt);
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        System.out.println( Valid_Anagram.isAnagram(s, t));
        System.out.println( Valid_Anagram.isAnagram2(s, t));
    }
}
