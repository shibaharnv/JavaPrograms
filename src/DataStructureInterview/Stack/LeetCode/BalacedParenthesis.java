package DataStructureInterview.Stack.LeetCode;

import java.util.Stack;

public class BalacedParenthesis {
    public static boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true; // An empty string is considered valid.
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket found.
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false; // Mismatched opening and closing brackets.
                }
            }
        }

        // The string is valid if the stack is empty at the end.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
       /// String s1 = "()";
       // String s2 = "()[]{}";
       // String s3 = "(]";
        String s4 = "([)]";
       // String s5 = "{[]}";

        //System.out.println("isValid(\"" + s1 + "\"): " + isValid(s1)); // true
        //System.out.println("isValid(\"" + s2 + "\"): " + isValid(s2)); // true
        //System.out.println("isValid(\"" + s3 + "\"): " + isValid(s3)); // false
        System.out.println("isValid(\"" + s4 + "\"): " + isValid(s4)); // false
      //  System.out.println("isValid(\"" + s5 + "\"): " + isValid(s5)); // true
    }
}
