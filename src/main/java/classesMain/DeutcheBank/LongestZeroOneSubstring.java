package classesMain.DeutcheBank;

public class LongestZeroOneSubstring {
    public static int longestSubstring(String s) {
        int left = 0, right = 0;
        int maxLen = 0;
        int countZero = 0, countOne = 0;

        while (right < s.length()) {
            // अगर current character '0' है, तो countZero बढ़ाएं
            if (s.charAt(right) == '0') {
                countZero++;
            } else if (s.charAt(right) == '1') {
                countOne++;
            }

            // जब दोनों की संख्या बराबर हो, तब सबसे लंबी सबस्ट्रिंग को अपडेट करें
            if (countZero == countOne) {
                maxLen = Math.max(maxLen, 2 * countZero);
            } else if (countOne > countZero) {
                // अगर 1 की संख्या ज़्यादा हो जाए, तो left को आगे बढ़ाएं और countZero को कम करें
                while (countZero < countOne && left < right) {
                    if (s.charAt(left) == '0') {
                        countZero--;
                    }
                    left++;
                }
            } else if (countZero > countOne) {
                // अगर 0 की संख्या ज़्यादा हो जाए, तो right को आगे बढ़ाएं और countOne को कम करें
                right++;
            } else {
                right++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "01010011";
        System.out.println("Longest Substring Length: " + longestSubstring(s));
    }
}
