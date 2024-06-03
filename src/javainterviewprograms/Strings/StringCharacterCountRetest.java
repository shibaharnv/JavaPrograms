package javainterviewprograms.Strings;

import java.util.HashMap;
import java.util.TreeMap;

public class StringCharacterCountRetest {

    public static void main(String[] args)
    {
       // String word= "shibahar";
        String word="sszxaa";

       char[] charArray=word.toCharArray();

       TreeMap<Character,Integer> hm = new TreeMap<>();

       for(int i =0;i<word.length();i++)
       {
           char character=charArray[i];

           if(!hm.containsKey(character))
           {
               hm.put(character,1);
           }
           else
           {
               hm.put(character,hm.get(character)+1);
           }



       }

        System.out.println(hm.entrySet());

       //Count duplicates

        System.out.println(hm.values());

        for(Object c:hm.keySet())
        {

            char myChar= (char)c;
           // System.out.println(myChar);

            if(hm.get(myChar)>1)
            {
                System.out.println("this character  " +myChar+ "  is duplicate ");
            }
        }


    }
}
