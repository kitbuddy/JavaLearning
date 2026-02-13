package classesMain.DeutcheBank;

public class LC28FindFirstOccuranceOfString {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(LC28FindFirstOccuranceOfString.getFistOccuranceIndex(haystack, needle));
    }

    private static int getFistOccuranceIndex(String haystack, String needle) {
        if (needle.length() == 1 && haystack.equals(needle)) {
            return 0;
        }


        int needleLength = needle.length();
        for(int right =0; right < haystack.length()-needleLength; right += needleLength) {
            String currentWord = haystack.substring(right, right + needleLength);
            if(currentWord.equals(needle)) {
                return right;
            }
        }
        return -1;
    }
}
