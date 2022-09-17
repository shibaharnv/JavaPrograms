package javainterviewprograms.Strings;

import java.util.Stack;

public class StringFirstNonRepeatingCharacter {

    public static void main(String[] args)
    {
        String word ="swiss";

        //{first non repeating character
        // Input is String
        // Output is character
        // First take a character check if it is present in the char array
        // second take the next character and check if it is present
        // Stack - if the stack is empty then insert the character
        // Take the next character and check if the stack contains that character if yes remove the character inside the stack
        // if no push that character
        // ONe stack Object with all the characters
        // Another stack object is to push the characters that are unique
        // }


        char[] wordCharArray=word.toCharArray();

        Stack stackbaseObj = new Stack();


        for(char d:wordCharArray)
        {
            stackbaseObj.push(d);
        }

        System.out.println("stackbaseObj "+stackbaseObj);


        Stack stackobj = new Stack();


        for(int i=0;i< wordCharArray.length;i++)
        {
            //if()
        }


//
//        Stack stackobj = new Stack();
//
//
//        for(int i=0;i< wordCharArray.length;i++)
//        {
//            if(stackobj.isEmpty())
//            {
//                stackobj.push(wordCharArray[i]);
//            }
//
//            else if(stackobj.contains(wordCharArray[i]))
//            {
//                stackobj.pop();
//            }
//
//            else
//            {
//                stackobj.push(wordCharArray[i]);
//            }
//
//
//        }
    }
}
