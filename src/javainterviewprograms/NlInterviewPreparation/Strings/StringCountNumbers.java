package javainterviewprograms.NlInterviewPreparation.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCountNumbers {

    //{I/P: aabcccccaaa
    // O/P: a2b1c5a3
    //I/P :aabaaa
    //output:a2b1a3
    //I/P :abc
    //o/p :a1b1c1
    // //Number is placed whenever there is new character
    // }

    public static void main(String[] args) {


        String input="aabca";

        stringCompressor(input);




    }

    public static void stringCompressor(String inputString)
    {

        HashMap<Character,Integer> hashmap= new LinkedHashMap<>();

        char[] charArray=inputString.toCharArray();

        for(char c:charArray)
        {
            if(!hashmap.containsKey(c))
            {
                hashmap.put(c,1);
            }
            else
            {
                hashmap.put(c,hashmap.get(c)+1);
            }
        }

        System.out.println(hashmap.entrySet());

        String result="";

        for(Map.Entry entry: hashmap.entrySet())
        {
            Object obj=entry.getKey();

            Object valueObj=entry.getValue();

           String charObj= obj.toString();

           String intValueObj= valueObj.toString();

          result= result +charObj+intValueObj;


        }

        System.out.println(result);

    }
}
