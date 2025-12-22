package classesMain;

import java.util.Stack;

public class newStack {

        public static void main(String[] args) {
            String str = "{(})";
            System.out.println(newStack.isStringValid(str)); // Output: false
        }

        private static boolean isStringValid(String str) {
            Stack<Character> stack = new Stack<>();

            // Iterate through every character in the string
            for (int i = 0; i < str.length(); i++) {
                char current = str.charAt(i);

                // If it's an opening bracket, push it onto the stack
                if (current == '(' || current == '{' || current == '[') {
                    stack.push(current);
                }
                // If it's a closing bracket, check the stack
                else if (current == ')' || current == '}' || current == ']') {
                    // If the stack is empty or the top doesn't match, return false
                    char top = stack.pop();
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (!isMatchingPair(top, current)) {
                        return false;
                    }
                }
            }

            // If the stack is empty, all parentheses were matched
            return stack.isEmpty();
        }

        // Helper method to check if two characters are matching brackets
        private static boolean isMatchingPair(char open, char close) {
            return (open == '(' && close == ')') ||
                    (open == '{' && close == '}') ||
                    (open == '[' && close == ']');
        }
}
