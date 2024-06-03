package javainterviewprograms.Strings;

import java.util.*;

public class StringLargestSubStringWithOutRepeatingCharacters {

    //{input :abcdaegf  :output:abcd
    // So we need to find the unique largest substring
    //Set is unique values when we add element to set it returns boolean. if we try to add duplicate value to set it returns false
    // take the first character of the string and try to add it in the set
    // whenever it returns false that should be one substring
    // Logic Add chracters to make string until it finds the duplicate to string arraylist
    // //Stack }

    public static void main(String[] args) {

        String input="abae";
        String suStrting=input.substring(0,2);

        System.out.println(suStrting);

        Stack<Character> stack= new Stack<>();

        List<String> myList= new ArrayList<>();

        String tempString="";

       Set<Character> mySet= new LinkedHashSet<>();

       Character peekValue;


       for(int i=0;i<input.length();i++)
       {
           for(int j=i+1;j<input.length();j++)
           {
               if(input.charAt(i)==input.charAt(j))
               {
                  // tempString=input.charAt(i)+input.charAt(j);
               }
           }
       }


        for(int i=0;i<input.length();i++)
        {

            if(stack.isEmpty())
            {
                stack.add(input.charAt(i));
                tempString=tempString+stack.peek();
            }
            else {

                peekValue=stack.peek();
                if(peekValue!=input.charAt(i))
                {
                    stack.push(input.charAt(i));
                    peekValue=stack.peek();
                    tempString=tempString+peekValue;
                }
                else {
                    break;
                }
            }

        }
    }
}
