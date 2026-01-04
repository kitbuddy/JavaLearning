package classesMain.PracticeMakeTheManPerfect;

import java.util.HashSet;
import java.util.Set;

public class PracticeMaxLengthSubstring {


    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> mySet = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while(mySet.contains(s.charAt(right))) {
                mySet.remove(s.charAt(left));
                left++;
            }
            mySet.add(s.charAt(right));
            if(right - left + 1 > maxLength) {
                maxLength = right -left +1;
                start = left;
            }
        }
        System.out.println(s.substring(start, start+maxLength));
        return s.substring(start, start + maxLength).length();
    }
}
