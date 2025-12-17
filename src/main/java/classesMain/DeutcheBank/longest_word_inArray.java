package classesMain.DeutcheBank;

public class longest_word_inArray {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flightened", "fl"};
        longest_word_inArray longestWordInArray = new longest_word_inArray();
        System.out.println(longestWordInArray.getLongestString(str));
        System.out.println(longestWordInArray.getShortestString(str));
    }

    public String getLongestString(String[] strArray) {
        String longestString = "";

        for (String str: strArray) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }

    public String getShortestString(String[] strArray) {
        String shortestString = strArray[0];

        for (String str: strArray) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
            }
        }
        return shortestString;
    }

}
