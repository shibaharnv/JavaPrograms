package javainterviewprograms.NlInterviewPreparation.Strings;

import java.util.ArrayList;
import java.util.List;

public class FindVowelsCount {

    //{Find vowels  count
    // input String and output integer
    // if input is ab output is 1
    // String to char Array
    // check each char matches a,e,i,o,u
    // increase count}

    public static void main(String[] args) {
        String input="aeiou";
        char[] charArray=input.toCharArray();

        int count=0;

        List<Character> al = new ArrayList<>();

        al.add('a');
        al.add('e');
        al.add('i');
        al.add('o');
        al.add('u');

        int aCount=0;

        for(char c:charArray)
        {
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
            {
                count++;
            }

            if(al.contains(c))
            {
                aCount++;
            }
        }

        System.out.println("Vowel count " +count);
        System.out.println("Vowel count " +aCount);

    }





}
