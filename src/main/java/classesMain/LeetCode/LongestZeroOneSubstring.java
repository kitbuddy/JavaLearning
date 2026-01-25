package classesMain.LeetCode;

import java.util.HashMap;

public class LongestZeroOneSubstring {
    public static int findLongestBalancedSubstring(String s) {
        // Map to store the first occurrence of each balance
        HashMap<Integer, Integer> balanceMap = new HashMap<>();
        int balance = 0;  // Tracks the difference between 1s and 0s
        int maxLength = 0;

        // Initialize map with balance = 0 at index -1 (base case)
        balanceMap.put(0, -1);

        for (int i = 0; i < s.length(); i++) {
            // Update balance: +1 for '1', -1 for '0'
            if (s.charAt(i) == '1') {
                balance++;
            } else if (s.charAt(i) == '0') {
                balance--;
            }

            // Check if this balance has occurred before
            if (balanceMap.containsKey(balance)) {
                // Calculate the length of the balanced substring
                int previousIndex = balanceMap.get(balance);
                int currentLength = i - previousIndex;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                // First time seeing this balance, store its index
                balanceMap.put(balance, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "00110001111";
        System.out.println("Longest Balanced Substring Length: " + findLongestBalancedSubstring(s));  // Expected Output: 6
    }
}