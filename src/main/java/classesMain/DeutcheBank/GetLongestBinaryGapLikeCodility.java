package classesMain.DeutcheBank;

/**
 * Solution to find the longest binary gap in a positive integer.
 * A binary gap is a sequence of consecutive zeros between two 1's.
 * 
 * Example: For 529 (binary: 1000010001), the longest gap is 4 zeros.
 */
public class GetLongestBinaryGapLikeCodility {

    public static void main(String[] args) {
        System.out.println(getLongestBinaryGap(529)); // Output: 4
    }

    /**
     * Finds the longest binary gap in the binary representation of a number.
     *
     * @param number the positive integer to analyze
     * @return the length of the longest binary gap (0 if no gap exists)
     */
    private static int getLongestBinaryGap(int number) {
        String binaryString = Integer.toBinaryString(number);
        int maxGapLength = 0;
        int currentGapLength = 0;
        boolean hasStarted = false;

        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                if (hasStarted) {
                    maxGapLength = Math.max(maxGapLength, currentGapLength);
                }
                hasStarted = true;
                currentGapLength = 0;
            } else if (hasStarted) {
                currentGapLength++;
            }
        }

        return maxGapLength;
    }
}
