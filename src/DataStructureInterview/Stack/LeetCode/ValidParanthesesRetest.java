package DataStructureInterview.Stack.LeetCode;

import java.util.Stack;

public class ValidParanthesesRetest {



    //Alogrithm
    //{1.Check if the length of the string is odd or even if it is odd then parentheses is not balanced
    // 2.Stack is the linear data structure that is LIFO -Last in first out
    // 3.Push the character one by one into the stack
    // 4.push the first bracket and when we push the second bracket check if the simlar type bracket is already present in the
    // stack .. if it is opening and closing bracket then pop the elements
    // 5. finally if the stack is empty then the input string is valid paranthesis}

    boolean paranthesisCheck(String inputString)
    {
        int stringLength=inputString.length();

        Stack<Character> sobj = new Stack<Character>();

        if(stringLength%2!=0)
        {
            System.out.println("Given String "+inputString+" is not a valid paranthesis");
            return false;
        }
        else
        {

            for(int i=0; i<stringLength;i++)
            {
                char firstchar=inputString.charAt(i);

                // Push the opening braces
                if(firstchar=='{'||firstchar=='('||firstchar=='[')
                {
                    sobj.push(inputString.charAt(i));
                }

                for(int j=1; j<stringLength;j++)
                {

                    char secondChar=inputString.charAt(j);
                    if(secondChar=='}')
                    {
                        sobj.pop();
                    }
                    if(sobj.isEmpty())
                    {
                        break;
                    }
                }

            }
         return true;
        }

    }


    public static void main(String[] args)
    {
        String inputBrackets ="{}";
        ValidParanthesesRetest obj = new ValidParanthesesRetest();
        boolean myResult =obj.paranthesisCheck(inputBrackets);
        if(myResult)
        {
            System.out.println("Valid parenthesis");
        }

        else
        {
            System.out.println("NOT Valid parenthesis");
        }
    }

}
