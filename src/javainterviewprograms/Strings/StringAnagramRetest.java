package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringAnagramRetest {

    public static void main(String[] args) {

        String s1= "army";
        String s2="mary";

        //{Check if both the strings are anagram
        // Logic is whatever character present in the string should be present in the another string
        // 1. change one string to char array
        // 2. loop through the char array and check if the character is present inside the string}


     char[] c1=s1.toCharArray();
     char[] c2=s2.toCharArray();

     Arrays.sort(c1);
     Arrays.sort(c2);

     if(Arrays.equals(c1,c2))
     {
         System.out.println("passed");
     }

     else {
         System.out.println("failed");
     }

    }
}
