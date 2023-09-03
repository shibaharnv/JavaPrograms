package DataStructureInterview.Stack.Retest;

import java.util.Stack;

import java.util.Stack;

public class RemoveDuplicatesChatGPT{
    public static String removeDuplicates(String input) {
        if (input == null) {
            return null;
        }

        Stack<Character> stack = new Stack<>();

        
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!stack.contains(c)) {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert at the beginning to maintain original order
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abcda";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String without Duplicates: " + result);
    }
}
