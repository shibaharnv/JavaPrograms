package javainterviewprograms.Strings;

import java.util.*;

public class StringFirstNonRepeatingCharacterRetest {

    public static void main(String[] args)
    {
        String word ="abcda";

        //{first non repeating character
        // Input is String
        // Output is character
        // First take a character check if it is present in the char array
        //map
        // }


        char[] wordCharArray=word.toCharArray();

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int count =0;
        for(char c:wordCharArray)
        {
            if(!hm.containsKey(c))
            {
                hm.put(c,count+1);
            }

            else
            {
                hm.put(c,hm.get(c)+1);
            }
        }


        int value=1;
        System.out.println(hm);

        TreeSet ts= new TreeSet();

           Set entry= hm.entrySet();

           Iterator itr=entry.iterator();


           while (itr.hasNext())
           {
              Map.Entry entr= (Map.Entry) itr.next();

              // System.out.println("Key "+entr.getKey() +" Value "+entr.getValue());

               if(entr.getValue().equals(value))
               {
                   Object d=entr.getKey();
                   System.out.println(entr.getKey());
                   char e=(char) d;

                   int indexValue=word.indexOf(e);
                   System.out.println(" key "+e +"Index Value" +indexValue);
                   ts.add(indexValue);
               }
           }
        System.out.println(ts);

           int firstnonRepeatCharacterIndexValue =(int)ts.first();
           char result=word.charAt(firstnonRepeatCharacterIndexValue);

        System.out.println("firstnonRepeatCharacter "+result);

    }
}
