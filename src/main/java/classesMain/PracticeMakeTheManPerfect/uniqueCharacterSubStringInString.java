package classesMain.PracticeMakeTheManPerfect;

import java.util.HashSet;
import java.util.Set;

public class uniqueCharacterSubStringInString {

    public static void main(String[] args) {
        String s = "ababdmmrteus";

        System.out.println(uniqueCharacterSubStringInString.getSubStringLength(s));
    }

    private static int getSubStringLength(String s) {

        int left = 0;
        int start = 0;
        int max_length = 0;
        Set<Character> subString = new HashSet<>();
        for (int right =0; right<s.length(); right++) {
            while (subString.contains(s.charAt(right))) {
                subString.remove(s.charAt(left));
                left++;
            }
            subString.add(s.charAt(right));

            if(right - left + 1 > max_length ) {
                max_length = right - left + 1;
                start = left;
            }

        }
        System.out.println(subString); // just for length
        System.out.println(s.substring(start, start + max_length).length());

        // get String
        System.out.println(s.substring(start, start + max_length));
        return subString.size();
    }
}
