package javainterviewprograms.Strings.LeetCode;

import java.util.*;

public class StringCountDuplicateWordsRetest {

    public static void main(String[] args) {

            String word = "This is java java learning learning program";

            //{Input is String
        // Output is integer
        // store in string array and use split method
        // Using hashmap get the count of each words
        // what ever value is greater than one print the value and key}


        String[] wordStringArray=word.split(" ");

        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        int count =0;

        for(String s:wordStringArray)
        {

            if(!hm.containsKey(s))
            {
                hm.put(s,count+1);
            }

            else
            {
                hm.put(s,hm.get(s)+1);
            }

        }

        System.out.println(hm);

        Set setEntry=hm.entrySet();

        Iterator itr=setEntry.iterator();

        while (itr.hasNext())
        {

            Map.Entry entry=(Map.Entry) itr.next();

           // System.out.println("key "+entry.getKey()+" value"+entry.getValue());

            if((int)entry.getValue()>1)
            {
                System.out.println("duplicate word is "+entry.getKey());
            }
        }





    }
}