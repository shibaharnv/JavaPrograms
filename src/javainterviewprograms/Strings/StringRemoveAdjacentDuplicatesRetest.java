package javainterviewprograms.Strings;

import java.util.Stack;

public class StringRemoveAdjacentDuplicatesRetest {

    public static void main(String[] args)
    {
        String word="caaabbbc";
        //{Input is String :Output is also String
        // Convert the string to character array
        // Iterate through the char array Using Stack class and push and pop methods
        // Take the first character if it is not present inside the stack push it else pop it}

        char[] wordcharArray=word.toCharArray();

        Stack stackobj = new Stack();

        for(int i =0;i<wordcharArray.length;i++)
        {
            char c=wordcharArray[i];

            if(stackobj.empty())
            {
                stackobj.push(c);
            }
            else {

                Object peekValue = stackobj.peek();

                if (peekValue.equals(c)) {
                    stackobj.pop();
                } else {
                    stackobj.push(c);
                }
            }

        }

        System.out.println(stackobj.toString());

    }
}
