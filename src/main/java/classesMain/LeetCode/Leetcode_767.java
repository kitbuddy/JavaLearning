package classesMain.LeetCode;

public class Leetcode_767 {

    // Rearrange the string so no two adjacent chars are same
    // else return "";

    public static void main(String[] args) {
        String s = "abba";
        System.out.println( Leetcode_767.getRearrangedString(s));
    }

    private static char[] getRearrangedString(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (charArray[i] != charArray[i + 1]) {
                char temp = charArray[i];
                charArray[i] = charArray[i + 1];
                charArray[i + 1] = temp;
            }
        }
        return charArray;
    }
}
