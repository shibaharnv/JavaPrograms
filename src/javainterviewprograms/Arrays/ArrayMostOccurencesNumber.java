package javainterviewprograms.Arrays;

import java.util.*;
import java.util.Collection;

public class ArrayMostOccurencesNumber {

    public static void main(String[] args) {

        //{Using Hashmap capture the key and value key is the array number and value is the count
        // need to find the greatest value from the map
        // after finding the greatest value from the map fetch the corresponding key}

        int[] a= {1,2,3,1,2,1,3};

        HashMap<Integer,Integer> hm = new HashMap<>();


        for(int i =0;i<a.length;i++)
        {
            if(!hm.containsKey(a[i]))
            {
                hm.put(a[i],1);
            }

            else
            {
                hm.put(a[i],hm.get(a[i])+1);
            }
        }

        System.out.println(hm);

        System.out.println(hm.values());

     Collection col= hm.values();

      ArrayList<Integer> al = new ArrayList(col);

      int maxNUmber=Collections.max(al);

        //System.out.println(ts.pollLast());

    for(Map.Entry ev:hm.entrySet())
    {



        int value=(int)ev.getValue();

        if(value==maxNUmber)
        {
            System.out.println(ev.getKey());
        }

    }
    }
}
