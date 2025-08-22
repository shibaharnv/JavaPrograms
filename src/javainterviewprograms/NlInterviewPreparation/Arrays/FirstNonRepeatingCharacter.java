package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        int[] a={1,2,1};

        HashMap<Integer,Integer> hashmap = new LinkedHashMap<>();

        int count =0;

        for(int i:a)
        {
            if(!hashmap.containsKey(i))
            {
                hashmap.put(i,1);
            }

            else {
                hashmap.put(i,hashmap.get(i)+1);
            }
        }

        System.out.println(hashmap);

        // whenever the value is 1 get the key
        int value=0;
        for(Map.Entry entry:hashmap.entrySet())
        {
           value= (int) entry.getValue();

           if(value==1)
           {
               System.out.println(entry.getKey());
           }
        }



    }
}
