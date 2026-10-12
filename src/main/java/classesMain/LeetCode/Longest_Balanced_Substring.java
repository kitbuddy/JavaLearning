package classesMain.LeetCode;

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



public static int findTheLongestBalancedSubstring(String s) {
    int zeros = 0;
    int ones = 0;
    int maxLength = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '0') {
            if (ones > 0) {
                zeros = 0;
                ones = 0;
            }
            zeros++;
        } else if (zeros > 0) {
            ones++;
            maxLength = Math.max(
                maxLength,
                2 * Math.min(zeros, ones)
            );
        }
    }

    return maxLength;
}

