package DataStructureInterview.Stack;

import java.util.Stack;

public class ValidParenthesesTestUsingStack {



            // {Write a function to Validate if we have both the open and closed paranthesis
    //          function input accept String
    //          Need to split that into chars
    //          add all the characters in the string to char array
    //          if stack maxsizelength-1 is odd then return false
    //
    //          Step 1: Create a Stack of size equal to the length of the string
    //          Step 2: Create a for loop with string length
    //          Step 3: Take the first bracket
    //          Step 4: Write the condition to check if it is starting bracket
    //          step 5: if it is starting bracket then push to stack
    //          step 6: if it is not starting bracket that is in else block pop the first element in the stack
    //          step 7: pop the first element from the stack
    //          step 8: Compare with the i value and value from stack
    //          step 9: remove the value }


    public static void main(String[] args)
    {
            String bracket ="{}[]}";

           boolean result = isValid(bracket);

      if(result)
      {
          System.out.println("Given input is having balanced Parantheses");
      }
      else
      {
          System.out.println("Given input is  NOT having balanced Parantheses");
      }

    }


    public static boolean isValid(String s) {
        int maxsize=s.length();

        if(maxsize%2!=0)
        {
            return false;
        }

        else
        {
            Stack<Character> stackobj= new Stack<Character>();

            for(int i=0;i<s.length();i++)
            {
              char c=  s.charAt(i);

              if(c=='{' || c=='[' || c=='(')
              {
                  stackobj.push(c);
              }
              else
              {
                for(int j=0;j<stackobj.size();j++)
                {
                    char popvalue= stackobj.get(j);
                   if(c==']'&& popvalue=='[' || c=='}'&& popvalue=='{' || c==')'&& popvalue=='(')
                   {
                       stackobj.remove(j);
                   }
                }
              }


            }

            if(stackobj.isEmpty())
            {
                return true;
            }



        }
        return false;
    }
}
