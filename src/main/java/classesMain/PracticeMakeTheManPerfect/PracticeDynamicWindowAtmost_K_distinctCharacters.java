package classesMain.PracticeMakeTheManPerfect;

import java.util.HashMap;
import java.util.Map;

public class PracticeDynamicWindowAtmost_K_distinctCharacters {

    public static void main(String[] args) {
        System.out.println(slidingWindow("abcdabcpqrst", 5));
    }

    public static int slidingWindow(String s, int k) {
        int left = 0;
        int result = 0;
        int start = 0;
        int maxLength =0;

        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            // 1️⃣ Expand window (include right)
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            // 2️⃣ Shrink window if condition breaks
            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }

            if(right - left +1 > maxLength) {
                maxLength = right - left+1;
                start = left;
            }
            System.out.println("MaxSubstring : " + s.substring(start, start + maxLength));
            // 3️⃣ Update result
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

}
