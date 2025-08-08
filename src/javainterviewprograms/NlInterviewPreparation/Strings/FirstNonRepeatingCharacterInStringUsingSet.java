package javainterviewprograms.NlInterviewPreparation.Strings;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacterInStringUsingSet {

    //{Input : String -Output : character
    // count each character using hashmap
    // String to char array
    // Set no duplicates
    // Have two sets one set add all unique characters
    // Other set add all duplicate characters}

    public static void main(String[] args) {
        String input="shibahar";

        char[] charArray= input.toCharArray();

        Set<Character> seenOnceSet= new LinkedHashSet<>();
        Set<Character> repeatedSet= new LinkedHashSet<>();

        for(char c:charArray)
        {
            if(seenOnceSet.contains(c))
            {
                repeatedSet.add(c);
            }
            else
            {
                seenOnceSet.add(c);
            }
        }

        System.out.println(seenOnceSet);
        System.out.println(repeatedSet);

        for(char c:charArray)
        {
            if(seenOnceSet.contains(c) && !repeatedSet.contains(c))
            {
                System.out.println(c);
                break;
            }
        }




    }





}
