package classesMain.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicate {

    public static void main(String[] args) {
//        String s = "onetheless";
        String s = "swiss";
        System.out.println(findFirstDuplicate(s));
        printA.run();
    }

    private static final Runnable printA = () -> {
        System.out.println('a');
    };

    public static int findFirstDuplicate(String s) {
//        int left = 0;
//        char[] charArray = s.toCharArray();
//        Character leftCharacter = charArray[left];
//        for(int right = 1; right< charArray.length -1; right ++) {
//            if(charArray[right] == leftCharacter) {
//                return right;
//            }
//        }
//        return 0;

        /*अगर interviewer पूछे:
            "Why not two pointers?"
            तुम बोल सकते हो:
            Since the string is not sorted and we must check every
            character against future characters, two pointers degrade to O(n²).
            A hashing-based approach gives better time complexity O(n).
        */

        Set<Character> seen = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(seen.contains(current)) {
                return i;
            } else {
                seen.add(s.charAt(i));
            }
        }
        return 0;
    }
}
