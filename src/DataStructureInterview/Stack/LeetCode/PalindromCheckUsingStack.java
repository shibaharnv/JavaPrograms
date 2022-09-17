package DataStructureInterview.Stack.LeetCode;

import java.util.Stack;

public class PalindromCheckUsingStack {

    //{1. Input String
    // 2.Output String
    // 3. first remove all special characters ,punctuation and convert upper case to lower case
    // 4. declare a stack character array
    // 5. push the character one by one using loop based on the string length
    // 6. have a variable for ouptut string and pop the stack and concatante in the string
    // 7. Finally check if the revered string is equal to updated string }

    String updatedString="";

    String resultString="";

     void palindromeCheck(String myStringCheck)
    {
        Stack<Character> sobj = new Stack<Character>();

        for(int i=0;i<myStringCheck.length();i++)
        {
           char c= myStringCheck.charAt(i);
           sobj.push(c);

        }
        System.out.println(sobj.toString());
        int j=0;
        while (j<myStringCheck.length())
        {
            char d= sobj.pop();
            resultString=resultString+d;
            j++;
        }

        System.out.println("Result String  "+resultString);

        if(updatedString.equalsIgnoreCase(resultString))
        {
            System.out.println("Given string is Palindrome");
        }

        else
        {
            System.out.println("Given string is not a palindrome");
        }
    }

     String removePunctuations(String myInput)
    {
        updatedString=myInput;

//        updatedString=updatedString.replaceAll(",","");
//        updatedString=updatedString.replaceAll("!","");
//        updatedString=updatedString.replaceAll(" ","");

        updatedString= updatedString.replaceAll("[^a-zA-Z]","");



        return updatedString ;
    }





    public static void main(String[] args)
    {

        PalindromCheckUsingStack pobj = new PalindromCheckUsingStack();
        String input ="i did,did i!";
        //String input ="madams";

        String stringForCheck=pobj.removePunctuations(input);
        System.out.println("stringForCheck "+stringForCheck);
        pobj.palindromeCheck(stringForCheck);

    }
}
