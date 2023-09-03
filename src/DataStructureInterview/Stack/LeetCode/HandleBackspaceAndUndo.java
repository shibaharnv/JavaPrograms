package DataStructureInterview.Stack.LeetCode;

import java.util.Stack;

public class HandleBackspaceAndUndo {
    public static String processString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Stack<Character> stack = new Stack<>();
        Stack<Character> undoStack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '#') {
                // Handle backspace: pop the top character if stack is not empty
                if (!stack.isEmpty()) {
                    undoStack.push(stack.pop());
                }
            } else if (c == '@') {
                // Handle undo: restore the last popped character if the undo stack is not empty
                if (!undoStack.isEmpty()) {
                    stack.push(undoStack.pop());
                }
            } else {
                // Push other characters onto the stack
                stack.push(c);
            }
        }

        // Build the final string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert at the beginning to maintain order
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "A#@BB#E#F";
        String result = processString(input);
        System.out.println("Input: " + input + " => Output: " + result);
    }
}
