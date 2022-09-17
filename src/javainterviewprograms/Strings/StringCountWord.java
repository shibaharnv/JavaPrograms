package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringCountWord {

    public static void main(String[] args)
    {
        String words ="this is first";

        String[] wordStringArray= words.split("\\W+");
        System.out.println("count "+wordStringArray.length);

        //int test=7*5/7+7;
       //   int test=7*6/7+7;

       int test=6/7;
        System.out.println(test);
    }
}
