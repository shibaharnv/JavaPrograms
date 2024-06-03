package DataStructureInterview.Stack.Retest;

import java.util.Stack;

public class BalancedRetestParenthesis {

    //{check if the the parathesis are balanced
    // input="{[}]" output= true
    // input="
    //First check if the string length is not even then it is unbalanced

    public static void main(String[] args) {

        String input="{[}]}";
        if(parathesisCheck(input))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Unbalanced");
        }
    }

    public static boolean parathesisCheck(String input)
    {

        System.out.println(input.length());
        Stack<Character> stack = new Stack<>();
        char[] charArray=input.toCharArray();

        char popValue;

        if (input.length()%2!=0)
        {
            return false;
        }


        for(char c :charArray)
        {

            if(c=='{' || c=='[' || c=='(')
            {
                stack.push(c);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    for(int i=stack.size();i>=0;i--)
                    {
                       popValue= stack.pop();

                       //if(popValue==)

                    }
                }
            }


        }
        return false;

    }

}

