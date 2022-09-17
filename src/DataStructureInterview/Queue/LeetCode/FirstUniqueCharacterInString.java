package DataStructureInterview.Queue.LeetCode;

import java.util.Queue;
import java.util.Stack;

public class FirstUniqueCharacterInString {

    public static void main(String[] args)
    {
        //{problem statement
        // :Given string find the length
        // find the first non repeating character index and return it .if it doesnot exit return -1
        // With the length of the string define the queue
        // Get the first character of the string and insert to queue
        // insert the second character of the string and check if it is not equal to the character present in the queue
        // and then insert }
        String givenstring = "leet";
        firstUniqueCharacterMethod(givenstring);


    }

    public static void firstUniqueCharacterMethod(String myString)
    {
        Stack<Character> stackobj = new Stack<Character>();
            int top=-1;
            int value=-1;
        for(int i=0;i<myString.length();i++)
        {
           if(stackobj.isEmpty()) {

                top++;
               stackobj.push(myString.charAt(i));
           }
            value++;
           if(stackobj.peek()!=myString.charAt(i))
           {

               if(myString.length()==value)
               {
                   System.out.println("test");
               }
           }

           else
           {

           }

        }

        System.out.println(stackobj);
    }
}
