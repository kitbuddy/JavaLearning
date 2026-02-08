package classesMain.PracticeMakeTheManPerfect;

public class UniqueCharacterSubStringInString2 {
    public static void main(String[] args) {
        System.out.println(UniqueCharacterSubStringInString2.getLongestSubstring("abcabdcbb"));
    }

    private static int getLongestSubstring(String s) {

        if(s.isEmpty()) {return 0;}

        int[] lastSeenIndex = new int[128];
        for(int i =0; i < 128; i++) {
            lastSeenIndex[i] = -1;
        }

        int i =0;
        int maxLen = 1;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if(lastSeenIndex[ch] >= i) {
                i = lastSeenIndex[ch]  + 1;
            }

            lastSeenIndex[ch] = j;
            if((j-i +1) > maxLen) {
                maxLen = j-i+1;
            }
        }

        return maxLen;
    }
}
