package javainterviewprograms.Strings;

import java.util.*;

public class StringFirstNonRepeatingCharacterRetest2 {

    public static void main(String[] args)
    {
        String word ="abcdab";

        //{first non repeating character
        // Input is String
        // Output is character
        // First take a character check if it is present in the char array
        //map
        //
        // }

        LinkedHashMap<Character,Integer> hm= new LinkedHashMap<>();


        char[] wordCharArray=word.toCharArray();

        for(char c:wordCharArray)
        {
            if(!hm.containsKey(c))
            {
                hm.put(c,1);
            }
            else {
                hm.put(c,hm.get(c)+1);
            }
        }

        System.out.println(hm);

        Set keys=hm.keySet();
        ArrayList al = new ArrayList();

        for(Object k:keys)
        {
            char d = (char) k;

            int valu=hm.get(d);
            if(valu==1)
            {
                System.out.println(d);
                al.add(d);
            }
        }

        System.out.println(al);

        System.out.println(al.get(0));

    }
}
