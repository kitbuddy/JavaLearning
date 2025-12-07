package classesMain;

public class Longest_Balanced_Substring {
    public static void main(String[] args) {
        String s = "0101100111";
        System.out.println(Longest_Balanced_Substring.findTheLongestBalancedSubstring(s));
    }

    public static int findTheLongestBalancedSubstring(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right =0;
        int counter = 0;

        while(right < s.length()) {
            for ( right = 0; right < charArray.length-1; right++) {
                if (charArray[right] == '1' && right !=0) {
                    left = right;
                    right++;
                    left--;
                }
                if (charArray[right] == '1' && charArray[left] == '0') {
                    counter++;
                } else {
                    left = right;
                    counter = Math.min(right, left);
                }
            }
        }
        return counter;
    }
}
