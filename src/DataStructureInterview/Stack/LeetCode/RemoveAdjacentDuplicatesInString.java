package DataStructureInterview.Stack.LeetCode;

import java.util.Stack;

public class RemoveAdjacentDuplicatesInString {

    //{ Step 1 :Create a stack of type characters
    // Step 2 : for loop with String length
    // Step 3 : if the stack is empty push the character
    // Step 4 : if the stack is not empty that is in else block peek the value from stack
    // Step 5 : Compare the peek value with stack array value
    // Step 6: if both are same then do pop}

    public static void main(String[] args)
    {
        String value= "azxxzy";
        Stack<Character> result= RemoveAdjacentDuplicates(value);

        String myresult="";
        int top=0;
        while(top<result.size())
        {

          char c=  result.get(top);
          myresult =myresult +c;
          top++;
        }



        System.out.println(myresult);
    }


    public static Stack<Character> RemoveAdjacentDuplicates(String input)
    {
        Stack<Character> stackobj = new Stack<Character>();

        for(int i=0;i<input.length();i++)
        {
           if(stackobj.isEmpty())
           {
               stackobj.push(input.charAt(i));
           }
           else
           {
               char topvalue= stackobj.peek();

               if(topvalue!= input.charAt(i))
               {
                   stackobj.push(input.charAt(i));
               }
               else
               {
                   stackobj.pop();
               }
           }
        }

        return stackobj;

    }
}
