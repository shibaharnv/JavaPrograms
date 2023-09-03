package DataStructureInterview.Stack.Retest;

import java.util.Stack;

public class RemoveAdjacentDuplicatesRetest {

    public static void main(String[] args) {
        //

        String input="abbaca";//ca
        StringBuilder result=removeAdjacentDuplicates(input);
        System.out.println(result);

        //{Logic : Input is string
        // convert to char array and create for each loop
        // inside for each loop take first character and if the stack is empty push it directly
        // if the stack is not empty peek the value and compare if it is matching if yes then pop it
        // if the value is not matching then push it}
    }

    public static StringBuilder removeAdjacentDuplicates(String input)
    {

        String output=input;

        Stack<Character>  stack= new Stack<>();
        char[] charArray= output.toCharArray();

        char peekCharacter;

        for(char c:charArray)
        {
            if(stack.isEmpty())
            {
                stack.push(c);
            }
            else
            {
                peekCharacter=stack.peek();
                if(peekCharacter==c)
                {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }

            }
        }


        StringBuilder sb = new StringBuilder();

        for(char c:stack)
        {
            sb.append(c);
        }



        return sb;
    }
}
