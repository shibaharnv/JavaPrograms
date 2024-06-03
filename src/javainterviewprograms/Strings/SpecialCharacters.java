package javainterviewprograms.Strings;

import java.util.Arrays;

public class SpecialCharacters
{

    public static void main(String[] args) {

        //Write code to convert a string to lowercase and remove spaces and special characters.
        String word= "dasdsa $@#$@#$";

word.replaceAll("[^a-z]","");

        word=word.replace(" ","");

        System.out.println(word);


        word=word.replaceAll("[^a-z]","");


        System.out.println(word.toUpperCase());





    }
}
