package javainterviewprograms.NlInterviewPreparation.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordsInGivenString {

    public static void main(String[] args) {

        String input="this is is test test";

        String[] stringArray=input.split(" ");

        Set<String> set = new HashSet<>();

        List<String> list = new ArrayList<>();

        String duplicate="";

        for(String word:stringArray)
        {

            if(!set.add(word))
            {

                //duplicate=word;
                list.add(word);
            }
        }

        System.out.println(list);
    }
}
