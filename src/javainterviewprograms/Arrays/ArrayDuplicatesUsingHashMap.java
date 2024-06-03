package javainterviewprograms.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicatesUsingHashMap {

    public static void main(String[] args)
    {
        int[] a ={1,2,2,3,3,5};

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int i=1;

        for(int x:a)
        {
            if(!hm.containsKey(x))
            {
                hm.put(x,i);
            }
            else {
                hm.put(x,i+1);
            }

        }


        for(Map.Entry e:hm.entrySet())
        {
            System.out.println("entry key "+e.getKey() +" ENtry value "+e.getValue());

            int val=(int)e.getValue();
            if(val>1)
            {
                System.out.println("Duplicate nos "+e.getKey());
            }

        }
        System.out.println(hm);
    }

}
