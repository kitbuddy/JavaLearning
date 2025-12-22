package classesMain.DeutcheBank;

public class GetLongestBinaryGapLikeCodility {
    public static void main(String[] args) {
        System.out.println(GetLongestBinaryGapLikeCodility.getlongestZeroString(9));
    }

    private static int getlongestZeroString(int num) {

        char[] charArray = Integer.toBinaryString(num).toCharArray();
        int maxLength = 0;
        int counter = 0;
        boolean started = false;
        for(int i = 0; i<charArray.length; i++) {
            if(charArray[i] == '1') {
                if(started) {
                    maxLength = Math.max(maxLength, counter);
                }
                started = true;
                counter = 0;
            } else if(started){
                counter++;
            }
        }
        return maxLength;
    }
}
