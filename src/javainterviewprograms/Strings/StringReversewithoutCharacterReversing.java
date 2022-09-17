package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringReversewithoutCharacterReversing {

    public static void main(String[] args)
    {
        //{Consider a string “Hello Good Morning” it should print the sentence in reverse order output should be “Morning Good Hello”}

        String word ="Hello Good Morning";

        String[] wordStringArray=word.split(" ");

        System.out.println(Arrays.toString(wordStringArray));

        StringBuffer sb = new StringBuffer(Arrays.toString(wordStringArray));

        System.out.println(sb);

   /*     for(String s :wordStringArray)
        {
            System.out.println(s);
        }*/
        StringBuffer sb1= new StringBuffer();
        for(int i= wordStringArray.length-1;i>=0;i--)
        {
       sb1.append(wordStringArray[i]).append(" ");

        }

        System.out.println("Reformact "+sb1);
    }
}
