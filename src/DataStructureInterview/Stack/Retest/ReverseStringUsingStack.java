package DataStructureInterview.Stack.Retest;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String inputString ="abcd";

        String reverseString="";

        char popValue;
        System.out.println();

        int stringLength=inputString.length();
        System.out.println(stringLength);

        for(int i=0;i<stringLength;i++)
        {
            stack.push(inputString.charAt(i));
            System.out.println("After Pushing"+stack);
        }

        for(int i=stringLength-1;i>=0;i--)
        {
            popValue=stack.pop();
            reverseString=reverseString+popValue;
        }

        System.out.println("After reeverse "+reverseString);
    }
}
