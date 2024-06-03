package javainterviewprograms.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {


    public static void main(String[] args) {
        String s="leetcode";



        HashMap<Character,Integer> hm = new LinkedHashMap<>();



        char[] charArray=s.toCharArray();



        for(char c:charArray)

        {
            if(!hm.containsKey(c))
            {

                hm.put(c,1);
            }

            else
            {
                hm.put(c,hm.get(c)+1);
            }
        }


        System.out.println(hm);
//hm contains all characters and respective count

        char nonRepeatingCharacter = 0;
        for(Map.Entry entry:hm.entrySet())
        {
           // char charc=(char)entry.getKey();

            int value=(int)entry.getValue();
            if(value==1)
            {
                nonRepeatingCharacter=(char)entry.getKey();
                break;
            }
        }

        System.out.println(nonRepeatingCharacter);

    }
}
