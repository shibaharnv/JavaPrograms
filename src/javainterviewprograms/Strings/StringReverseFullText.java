package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringReverseFullText {


    public static void main(String[] args)
    {
        String word="This is test";

        //Expected output :sihT si tset

        String[] wordArray= word.split(" ");

        for(String s:wordArray)
        {
            System.out.println("s "+s);
        }

        System.out.println(Arrays.toString(wordArray));
        String reverse = "";


        for(String s :wordArray)
        {
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.reverse());
           reverse= reverse+sb.toString()+" ";
        }

        System.out.println(reverse);



    }
}


