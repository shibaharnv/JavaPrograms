package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args) {

        String s1= "army";
        String s2="mary";

        //{Check if both the strings are anagram
        // Logic is whatever character present in the string should be present in the another string
        // 1. change one string to char array
        // 2. loop through the char array and check if the character is present inside the string}


        char[] s1Array=s1.toCharArray();
        char[] s2Array= s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);


        if(Arrays.equals(s1Array,s2Array))
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are NOt anagram");
        }

    }
}
