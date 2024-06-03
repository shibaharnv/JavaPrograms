package javainterviewprograms.Arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        //{}
 //{First non repeating character
        // Input is array and output is an int
        // Duplicate Set that will add element ony by one by iterateing whichever element is not added that is the first repeating int
        // }

        int[] a={1,2,1,3};

        Map<Integer,Integer> map= new LinkedHashMap<>();


        for(int i=0;i<a.length;i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i],1);
            }

            else
            {
                map.put(a[i],map.get(a[i])+1);
            }
        }

        System.out.println("my map "+map);

        int ans=0;
       for(Map.Entry<Integer,Integer> entry:map.entrySet())
       {
           Object countValue=entry.getValue();

           int intValue=(int)countValue;



           if(intValue==1)
           {
               ans=entry.getKey();
               break;
           }
       }

        System.out.println("firstNonRepeatingNumber "+ans);

        firstNonRepeatingNumber(a);




    }

    public static void firstNonRepeatingNumber(int[] a)
    {


        Map<Integer,Integer> map= new LinkedHashMap<>();

        for(int value:a)
        {
            if(!map.containsKey(value))
            {
                map.put(value,1);
            }
            else {
                map.put(value,map.get(value)+1);
            }
        }

        System.out.println(map);


        for(Map.Entry entry:map.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

            Object mapValue=entry.getValue();

            int intMapValue= (int)mapValue;

            if(intMapValue==1)
            {
                System.out.println("first non repeating character" +entry.getKey());

                break;
            }

        }


    }
}
