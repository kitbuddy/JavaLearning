package classesMain.DeutcheBank;

import java.util.HashMap;
import java.util.Map;

public class MInimum_Window {

    // Given an array, return minimum window size
    // containing all distinct values in the array.

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(MInimum_Window.getWindow(s, t));
    }

    private static String getWindow(String s, String t) {
        if(s == null || t == null || s.length() < t.length()) {
            return "";
        }
        int pointerA = 0;
        int pointerB = pointerA + 1;
        int longestWindow = 1;

        while(pointerB < s.length()) {
            String currentSubString = s.substring(pointerA, pointerB);
            if (checkIfAllCharsDifferent(currentSubString, t)) {
                longestWindow = Math.min(longestWindow, pointerB - pointerA);
                pointerB++;
            } else {
//                pointerA++;
            }

        }
        return s.substring(pointerA, pointerB);
    }

    private static boolean checkIfAllCharsDifferent(String s, String t) {
        Map<Character, Integer> myMap = new HashMap<>();
        Map<Character, Integer> requiredMap = new HashMap<>();

        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            myMap.put(c, myMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            requiredMap.put(c, requiredMap.getOrDefault(c, 0) + 1);
            if(myMap.containsKey(c) && requiredMap.containsKey(c)) {

                if (myMap.get(c) < requiredMap.get(c)) {
                    return false;
                }
            }
        }

        for (int val : myMap.keySet()) {
            if(myMap.getOrDefault(val, 0) < requiredMap.get(val) ) {
                return false;
            }
        }
        return true;
    }
}
