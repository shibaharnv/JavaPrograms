package javainterviewprograms.NlInterviewPreparation.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {


        //{The quick brown fox jumps over the lazy dog.
        // //IT contains all the letters from  a to z
        // so indireclty it is 26 unique letters}

        String word="The quick brown fox jumps over the lazy dog.";


        word=word.toLowerCase();
        word=word.replaceAll("[^a-zA-Z]","");

        System.out.println(word);
        System.out.println(word.length());
        char[] charArray=word.toCharArray();

        Character[] characterArray= new Character[charArray.length];

        Set<Character> set = new HashSet<>();

        for(char c:charArray)
        {
            set.add(c);
        }

        if(set.size()==26)
        {
            System.out.println("String is Pangram");

        }
    }
}
