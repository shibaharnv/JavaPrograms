package DataStructureInterview.Stack;

import java.util.Arrays;
import java.util.Stack;

public class BookingcomQuestionStringRemoval {

    public static void main(String[] args) {

        String inputString=" A#BB#E#F";

        stringRemoval(inputString);
    }

    private static void stringRemoval(String inputString) {

        Stack<Character> stack = new Stack<>();

        char[] charArray= inputString.toCharArray();

        for(char c:charArray)
        {
            if(stack.isEmpty())
            {
                stack.push(c);
            } else if (c=='#') {

                stack.pop();


            }

            else {
                stack.push(c);
            }
        }
        System.out.println(stack);


        StringBuilder sb = new StringBuilder();

        for(char d:stack)
        {
            sb.append(d);
        }

        System.out.println(sb);

    }
}
