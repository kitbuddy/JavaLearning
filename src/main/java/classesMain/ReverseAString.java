package classesMain;

public class ReverseAString {

    public static void main(String[] args) {
        ReverseAString.reverse("ABCDE");
    }

    private static void reverse(String myString) {
        char[] charArray = myString.toCharArray();
        for (int i = 0; i <myString.length()/2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 -i];
            charArray[charArray.length - 1 -i] = temp;
        }


        System.out.println(charArray);
    }
}
