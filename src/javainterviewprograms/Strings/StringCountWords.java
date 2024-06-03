package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringCountWords {

    public static void main(String[] args)
    {
        String word ="welcome to         java 8 ";
        //{Logic : Get the complete length of the string
        // Loop with the string length
        // write a condition to check if the character is space and confirm if the next character is not empty then increase the count }
        String s="test";
        int wordLength= word.length();

        System.out.println(wordLength);

        Character c;
        int count=1;

        for(int i=0;i<wordLength-1;i++)
        {
          c=  word.charAt(i);
          if(c==' ' && word.charAt(i+1)!=' ')
          {
              count++;
          }
        }

        System.out.println("No of words "+count);


        String val= "test is    good";

        String[] valArray=val.split("\\W+");

        System.out.println("val "+Arrays.toString(valArray));
        System.out.println(valArray.length);

        String result = "hi hello bye";

        String[] resultArray = result.split("\\W+");

        System.out.println(Arrays.toString(resultArray));
        System.out.println(resultArray.length);
    }
}
