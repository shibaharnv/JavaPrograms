package DataStructureInterview.Stack;

import java.util.Stack;

public class StackInbuiltMethodsUseful {

    public static void main(String[] args) {


        Stack<Character> stack = new Stack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack);
        System.out.println(stack.contains('a'));
        System.out.println(stack.search('b'));//returns the index top position
        System.out.println(stack.empty());//check if it is empty
        System.out.println("first element"+stack.firstElement());
        System.out.println("first element"+stack.lastElement());
        stack.clear();
        System.out.println(stack);
    }
}
