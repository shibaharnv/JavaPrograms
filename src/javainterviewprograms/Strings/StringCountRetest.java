package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringCountRetest {

    public static void main(String[] args) {

        String test= "4234234fsdfsdfsdf#@$@#$@#$@#";

        test=test.replaceAll("[^0-9][^a-z][^A-Z]","");
        System.out.println(test);


        String words = "welcome to         java 8 ";

        // Split the string by whitespace
        String[] wordArray = words.trim().split("\\s+");


        System.out.println(Arrays.toString(wordArray));

        // Count the number of words
        int wordCount = wordArray.length;

        System.out.println("Number of words: " + wordCount);

//        String word ="This is     testing worrld ";
//
//
//        word=word.trim();
//
//        System.out.println("after triming "+word.trim());
//
//        String[] wordArray=word.split("\\s");
//
//        System.out.println(Arrays.toString(wordArray));
//
//        String[] wordArray2 =word.split("\\W");
//
//
//        System.out.println(wordArray.length);
//        System.out.println(Arrays.toString(wordArray));
    }
}
