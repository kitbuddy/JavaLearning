package classesMain.PracticeMakeTheManPerfect;

import java.util.HashSet;
import java.util.Set;

public class practice2pointer {

    public static void main(String[] args) {
        // find minimum substring with unique character
        String word = "letsStory"  ;

        practice2pointer.getMinimumSubstringWithoutRepeatingCharacters(word);
    }

    private static void getMinimumSubstringWithoutRepeatingCharacters(String word) {

        char[] charArray = word.toCharArray();
        Set<Character> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < charArray.length; right ++) {
           if(!set.contains(charArray[right])) {
               set.add(charArray[right]);
           } else {
               left++;
           }


        }
    }
}
