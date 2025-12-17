package classesMain.DeutcheBank;

public class Longest_Common_Prefix2 {

    // 14. Longest Common Prefix
    //Easy
    //Topics
    //premium lock icon
    //Companies
    //Write a function to find the longest common prefix string amongst an array of strings.
    //
    //If there is no common prefix, return an empty string "".
    //
    //
    //
    //Example 1:
    //
    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    //Example 2:
    //
    //Input: strs = ["dog","racecar","car"]
    //Output: ""
    //Explanation: There is no common prefix among the input strings.
    //

    public static void main(String[] args) {
//        String[] str =  {"dog","racecar","car" };
        String[] str = {  "flower","flow","flight" };
        System.out.println("Ans: " + Longest_Common_Prefix2.getCommonPrefix(str));
    }

    public static String getCommonPrefix(String[] strArray) {
        String prefix = "";

        if(strArray == null || strArray.length == 0) {
            return "";
        }

        prefix = strArray[0];
        for (int i = 1; i<strArray.length; i++) {
            String currentWord = strArray[i];
            while(currentWord.indexOf(prefix) !=0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
            if(prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }
}
