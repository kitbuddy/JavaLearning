package classesMain.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parantheses {

    public static void main(String[] args) {
        String str = "(){[}]";
        // without correct order needed in String
//         System.out.println(Valid_Parantheses.isStringValid(str));

         // with correct order needed in string
        System.out.println(Valid_Parantheses.openBracketMustBeCloseByCorrespondingClosingBracketOnly(str));
    }

    private static boolean openBracketMustBeCloseByCorrespondingClosingBracketOnly(String str) {
       Stack<Character> stack = new Stack<>();
       char[] charArray = str.toCharArray();

       for(int i =0; i<charArray.length; i++) {
           char currentCharacter = charArray[i];
           if(currentCharacter == '(' || currentCharacter == '{' || currentCharacter=='[') {
               stack.push(currentCharacter);
           } else {
               if(stack.isEmpty()) {
                   return false;
               }
               char topElement = stack.pop();
               if(currentCharacter == ')' && topElement != '(' ||
                  currentCharacter == '}' && topElement != '{' ||
                  currentCharacter == ']' && topElement != '[' )  {
                   return false;
               }
           }
       }
        return stack.isEmpty();
    }

    private static boolean openBracketHaveACloseBracketTogetherOnly(String str) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();

        for (int i=0 ; i<charArray.length -1; i++ ) {
            if(str.charAt(i) != '(' && str.charAt(i+1) == ')') {
                return false;
            } else if(str.charAt(i) != '[' && str.charAt(i+1) == ']') {
                return false;
            } else if(str.charAt(i) != '{' && str.charAt(i+1) == '}') {
                return false;
            } else {
                return false;
            }

        }
    return str.isEmpty();
    }

    private static boolean isStringValid(String str) {
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if (map.get('(') == map.get(')') && map.get('{') == map.get('}') && map.get('[') == map.get(']')) {
            return true;
        } else {
            return false;
    }
}


//    static boolean isStringValid(String str) {
//        Stack<Character> stringStack = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
//                stringStack.push(str.charAt(i));
//            } else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
//                if (stringStack.isEmpty()) {
//                    return false;
//                }
//                Character topElement = stringStack.peek();
//                if (!isMatchingPair(topElement, str.charAt(i))) {
//                    return false;
//                }
//            }
//        }
//
//        return stringStack.isEmpty();
//    }
//
//    public static boolean isMatchingPair(char topElement, char current) {
//        if ((topElement == '(' && current == ')') || (topElement == '[' && current == ']') || (topElement == '{' && current == '}')) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
