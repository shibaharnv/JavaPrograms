package DataStructureInterview.Stack;

import java.util.Stack;

public class StackSimplePrograms {

    // Reverse string using Stack
    //{1. find the length of the string
    // 2. put a loop using length of the string
    // 3. get the character and push the character one by one in stack
    // 4.pop the character from stack and add that to a empty string
    // 5. Print the value}

    void reverseString(String inputString)
    {
        Stack<Character> sobj= new Stack<Character>();
        int stringLength=inputString.length();

        String reversedString="";

        for(int i=0;i<stringLength;i++)
        {
            sobj.push(inputString.charAt(i));
        }

        while (!sobj.isEmpty())
        {
            reversedString= reversedString+sobj.pop();
        }


//        for(int j=0;j<stringLength;j++)
//        {
//            reversedString=reversedString + sobj.pop();
//        }

        System.out.println("Reversed string is "+reversedString);

    }

    public static void main(String[] args)
    {
        String myString="shibahar";
        StackSimplePrograms stackobj = new StackSimplePrograms();
        stackobj.reverseString(myString);

        }


    }

