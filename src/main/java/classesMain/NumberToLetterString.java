package classesMain;

import java.util.Arrays;

public class NumberToLetterString {
    // return
    public static void main(String[] args) {

        System.out.println(NumberToLetterString.getLetterForNumber(8));
    }

    public static String getLetterForNumber(int n) {
        StringBuilder result = new StringBuilder();
        if(n < 0) {
            result = new StringBuilder();
        }
        while (n>0) {
            n--;
            int remainder = n % 26;
            char c = (char) ('A' + remainder);
            result.append(c);
        }

        return reverseString(result.toString());
    }

    public static String reverseString(String a) {
        String result = "";
        char[] resultChar = a.toCharArray();
        for(int i =0; i < resultChar.length/2; i++) {
            char temp = resultChar[i];
            resultChar[i] = resultChar[ resultChar.length-1 -i];
            resultChar[ resultChar.length-1 -i] = temp;
        }
        result = Arrays.toString(resultChar);
        return result;
    }
}
