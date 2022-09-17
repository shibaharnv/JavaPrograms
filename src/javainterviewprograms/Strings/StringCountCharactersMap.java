package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class StringCountCharactersMap {


    public static void main(String[] args)
    {
        String word ="swiss";

        char[] wordCharArray=word.toCharArray();

        HashMap<Character,Integer> hm= new HashMap<Character,Integer>();

        ArrayList al = new ArrayList();

        int count=1;
       for(char c:wordCharArray)
       {

           if(hm.containsKey(c))
           {
               count=count+1;
               hm.put(c,count);
               System.out.println(hm);
           }
           else
           {
               hm.put(c,count);
               System.out.println(hm);
           }

       }

        System.out.println(hm);


    }

}
