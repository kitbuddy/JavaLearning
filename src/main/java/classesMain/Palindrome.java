package classesMain;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome(1231));
    }
    public static boolean isPalindrome(int x) {
        String xValue = String.valueOf(x);
        int length = xValue.length();

        for(int i=0; i<length/2; i++) {
            if(xValue.charAt(i) != xValue.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }
}
