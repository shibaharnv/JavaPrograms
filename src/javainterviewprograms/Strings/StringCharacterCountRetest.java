package javainterviewprograms.Strings;

import java.util.HashMap;

public class StringCharacterCountRetest {

    public static void main(String[] args)
    {
       // String word= "shibahar";
        String word="ssbbaaa";

        char[] wordCharArray=word.toCharArray();

        HashMap<Character,Integer> hm= new HashMap<>();


        int count=1;

        for(int i=0;i< wordCharArray.length;i++)
        {
            if(!hm.containsKey(wordCharArray[i]))
            {
                hm.put(wordCharArray[i],count);
            }
            else
            {
                hm.put(wordCharArray[i],count+1);
            }
        }

        System.out.println(hm);



    }
}
