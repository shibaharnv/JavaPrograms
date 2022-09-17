package javainterviewprograms;

import java.util.HashMap;

public class CharacterCounting {

    public static void main(String[] args)
    {
        String word= "shibahara";

       String wordReplace=word.replaceAll("a","");

       int aCount = (word.length())-(wordReplace.length());

        System.out.println("aCount"+aCount);
        char d='a';
       int count= word.replaceAll("[^"+d+"]","").length();
        System.out.println("count"+count);

        char[] charWordArray=word.toCharArray();

        HashMap hm= new HashMap();

        for(char c:charWordArray)
        {
            Character ch= (Character) c;
            String sh =ch.toString();
           //int replaceCount= word.replaceAll(sh,"").length();
           int replaceCount=word.replaceAll("[^"+c+"]","").length();
           int wordCount=word.length();
            //hm.put(c,wordCount-replaceCount);
            hm.put(c,replaceCount);
        }

        System.out.println(hm);
    }
}
