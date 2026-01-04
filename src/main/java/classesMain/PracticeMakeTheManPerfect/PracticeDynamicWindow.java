package classesMain.PracticeMakeTheManPerfect;

import java.util.HashMap;
import java.util.Map;

public class PracticeDynamicWindow {

    // Longest substring without repeating characters

    public static void main(String[] args) {
        System.out.println(slidingWindow("abcabcdpqrst"));
    }

    public static int slidingWindow(String s) {
        int left = 0;
        int result = 0;
        int maxLength = 0;
        int start = 0;

        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            // 1️⃣ Expand window (include right)
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            while (freq.get(ch) > 1) {
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
                if (freq.get(s.charAt(left)) == 0) {
                    freq.remove(s.charAt(left));
                }
                left++;
            }

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }

            // 3️⃣ Update result
            result = Math.max(result, right - left + 1);
        }
        System.out.println("MaxLength Stubstring :" + s.substring(start, start + maxLength));

        return result;
    }

}


// 2️⃣ Shrink window if condition breaks
/* window is invalid */
//            while ( ) {
//                char leftChar = s.charAt(left);
//                freq.put(leftChar, freq.get(leftChar) - 1);
//
//                if (freq.get(leftChar) == 0) {
//                    freq.remove(leftChar);
//                }
//                left++;
//            }