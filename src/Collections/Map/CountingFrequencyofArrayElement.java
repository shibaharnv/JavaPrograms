package Collections.Map;

import java.util.HashMap;
import java.util.Set;

public class CountingFrequencyofArrayElement {

    //{Count the frequency of the array elemnt if the count is greater than 2 fin the number of elements
    // Input Array
    // Output: integer  or int count no of occurence of array count greater than 2
    // }


    public static void main(String[] args) {

        int[] a={1,2,3,3,3,4,4,4,4,4};
        countFrequency(a);

    }

    private static void countFrequency(int[] a)
    {
        //Using hashmap store the key and value count then get the values if value is greater than 2 count it


        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();

        for(int k:a)
        {

            if(!hm.containsKey(k))
            {
                hm.put(k,1);
            }
            else
            {
                hm.put(k,hm.get(k)+1);
            }
//          if(hm.isEmpty())
//          {
//              hm.put(k,1);
//          }
//          else {
//              if(hm.containsKey(k))
//              {
//                  hm.put(k,hm.get(k)+1);
//              }
//              else{
//                  hm.put(k,hm.get(k)+1);
//              }
//          }
        }

        int count=0;

        System.out.println(hm);

       Set keyset=hm.keySet();

       for(Object x:keyset)
       {
           int y=(int) x;

           int value= hm.get(y);

           if(value>2)
           {
               count++;
               System.out.println(y);
           }

       }

        System.out.println(count);




    }

}
