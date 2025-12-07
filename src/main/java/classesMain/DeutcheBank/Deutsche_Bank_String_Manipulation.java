package classesMain.DeutcheBank;

public class Deutsche_Bank_String_Manipulation {
     // Given two strings A and B, return true if B can be
     // formed by shifting characters of A to the right any number of times.
     // String Manipulation, HashMap

    // this can be easily found out if we add String to itself like
    // abcde + abcde = abcdeabcde, this has aal possible string for any rotation
    // so if final string is present in abcdeabcde then new string is formed by
    // rotation of string.

    // Hashmap can only be used to get frequency of characters but not positions.

    public static void main(String[] args) {
        String s = "abcde";
        String manipulatedstring = "bcdea";
        int ShiftCount = 3;
        System.out.println(Deutsche_Bank_String_Manipulation.getShiftedString(s, manipulatedstring));
        System.out.println(Deutsche_Bank_String_Manipulation.getShiftedString(s, manipulatedstring, ShiftCount));
    }

    private static boolean getShiftedString(String s, String manipulatedstring, int shiftCount) {
        int length = s.length();
        int positions = shiftCount % length;
        char[] newCharArray = new char[length];
        for(int i =0; i<length; i++) {
            int newPosition = (i+positions ) % length;
            newCharArray[newPosition] = s.charAt(i);
        }

        return new String(newCharArray).equals(manipulatedstring);
    }

    // using Hashmap
    private static boolean getShiftedString(String s, String manipulatedstring) {
        String newString = s + s;
        return newString.contains(manipulatedstring);
    }














//    private static String getStringShifted(String s, int shiftCount) {
//        char[] charArray = s.toCharArray();
//        char[] newArray = new char[s.length()];
//while(shiftCount == 0) {
//    for (int i = 0; i < shiftCount; i++) {
//        newArray[i] = charArray[i + 1];
//    }
//    newArray[0] = charArray[charArray.length - 1];
//    shiftCount--;
//}
//        System.out.println(newArray);
//        return Arrays.toString(newArray);

//        return null;
//    }
}
