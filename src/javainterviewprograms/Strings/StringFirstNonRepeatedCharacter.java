package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class  StringFirstNonRepeatedCharacter {

    public static void main(String[] args)
    {

        String word ="swiss";

        char[] wordCharArray=word.toCharArray();

        Character[] wordcharacterArray=new Character[wordCharArray.length];

        Arrays.setAll(wordcharacterArray,i->wordCharArray[i]);

        ArrayList al = new ArrayList(Arrays.asList(wordcharacterArray));

        for(Object c:al)
        {
            char value =(char) c;
//            if(!al.contains(c))
//            {
//
//            }
            for(int i=1;i<al.size();i++)
            {

            }

        }

        System.out.println(al);

//        for (int i=0;i< wordCharArray.length;i++)
//        {
//            char c =wordCharArray[i];
//
//
//        }

    }
}
