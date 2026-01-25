package classesMain.PracticeMakeTheManPerfect;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

        public static int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int maxLength = 0;
            int left =0;
            int start = 0;

            for(int right = 0; right < s.length(); right ++) {

                while(set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));

                if(right - left + 1 > maxLength) {
                    maxLength  = right - left +1;
                    start = left;
                }
            }
            System.out.println(s.substring(start, start + maxLength));
            return s.substring(start, start+maxLength).length();
        }
}
