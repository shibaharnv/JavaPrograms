package DataStructureInterview.Stack.LeetCode;

import java.util.Stack;
import java.util.HashMap;

public class BalancedParenthesisHashmap {
    public static boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true; // An empty string is considered valid.
        }

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
        bracketPairs.put(']', '[');

        for (char c : s.toCharArray()) {
            if (bracketPairs.containsKey(c)) {
                char expectedOpenBracket = bracketPairs.get(c);
                if (stack.isEmpty() || stack.pop() != expectedOpenBracket) {
                    return false; // Mismatched opening and closing brackets.
                }
            } else {
                stack.push(c);
            }
        }

        // The string is valid if the stack is empty at the end.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println("isValid(\"" + s1 + "\"): " + isValid(s1)); // true
        System.out.println("isValid(\"" + s2 + "\"): " + isValid(s2)); // true
        System.out.println("isValid(\"" + s3 + "\"): " + isValid(s3)); // false
        System.out.println("isValid(\"" + s4 + "\"): " + isValid(s4)); // false
        System.out.println("isValid(\"" + s5 + "\"): " + isValid(s5)); // true
    }
}
