package DataStructureInterview.Stack.Retest;

import java.util.Stack;

public class RemoveDuplicateStringStack {

    public static void main(String[] args) {

        String input="abcda";

        Stack<Character>   stack = new Stack<>();

        //String resultString = "";
        StringBuilder resultString = new StringBuilder();

        char[] charArray= input.toCharArray();

        for(char c:charArray) {

            if(!stack.contains(c))
            {
                stack.push(c);
                //resultString=resultString+c;
                resultString.append(c);
            }

        }

        System.out.println(resultString.toString());

    }
}
