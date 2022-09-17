package javainterviewprograms.Strings;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class StringMostRepeatedCharacter {

    public static void main(String[] args)
    {
        String word ="swiiss";

        char[] wordCharArry=word.toCharArray();

        HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
        int count=1;
        for(char c:wordCharArry)
        {
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)+1);
            }
            else
            {
                hm.put(c,count);
            }

        }

        System.out.println(hm);

        for(Map.Entry e :hm.entrySet())
        {
            System.out.println(e.getKey());
        }

        Map.Entry<Character,Integer> maxEntry=null;

        for(Map.Entry<Character,Integer> entry:hm.entrySet())

        {
            if(maxEntry==null||entry.getValue()> maxEntry.getValue())
            {
                maxEntry=entry;
            }

        }

        Object makkey=maxEntry.getKey();
        System.out.println(makkey);





    }
}
