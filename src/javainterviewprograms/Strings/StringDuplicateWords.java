package javainterviewprograms.Strings;

import java.util.Arrays;
import java.util.HashSet;

public class StringDuplicateWords {

    public static void main(String[] args)
    {
        String words="this the the good";

        String[] wordsArray =words.split(" ");

        System.out.println(Arrays.toString(wordsArray));

        HashSet hs= new HashSet();

        String removeWord="";

        for(String s:wordsArray)
        {
            if(!hs.add(s))
            {
                System.out.println("duplicate word is  "+s);
                removeWord=s;
            }
        }

        String newWord =words.replaceAll(removeWord,"");
        System.out.println("Before removing duplicates"+words);
        System.out.println("After removing duplicates"+newWord.trim());
    }
}
