package javainterviewprograms.Strings;

import jdk.nashorn.api.tree.Tree;

import java.util.Arrays;
import java.util.TreeSet;

public class StringUniqueCharactersIsogramRetest {

    public static void main(String[] args)
    {

        String word= "abcd";

        //{Check if the string contains unique characters
        // Convert string to character array
        // Convert array to list
        // put list in set}

        char[] wordCharArray=word.toCharArray();

        Character[] characterArray = new Character[wordCharArray.length];

        Arrays.setAll(characterArray,i->wordCharArray[i]);

        TreeSet ts = new TreeSet(Arrays.asList(characterArray));

        System.out.println(ts.toString());

        //set length or size

        System.out.println(ts.size());

        //String length

        System.out.println(word.length());

        if(ts.size()!=word.length())
        {
            System.out.println("Given string "+word+ " is NOT Isogram ");
        }

        else
        {
            System.out.println("Given string "+word+ " is  Isogram ");
        }


    }


}
