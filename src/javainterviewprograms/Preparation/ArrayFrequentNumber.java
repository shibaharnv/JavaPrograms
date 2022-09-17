package javainterviewprograms.Preparation;

import com.sun.source.tree.Tree;

import java.util.*;

public class ArrayFrequentNumber {

    //{Input is an array
    // We need to find the most frequent number in an array
    // output is an integer
    // find the count of each element in an array
    // Loop through the array content and if we use Hashmap then we can use character and integer
    // Map will contain all the characters and count
    // Entry set }

    public static void main(String[] args) {

        int[] a = {1, 3, 1, 1, 2, 3,3,3,2,2,2};


        HashMap<Integer, Integer> mapObj = new HashMap<Integer, Integer>();
        int count=1;


        for (int i = 0; i < a.length; i++) {

            if (!mapObj.containsKey(a[i])) {
                mapObj.put(a[i], count);
            } else {

                mapObj.put(a[i], mapObj.get(a[i]) + 1);

            }




        }

        System.out.println(mapObj.entrySet());

        Set mySet=mapObj.entrySet();

        System.out.println("myset "+mySet);

        Iterator itr=mySet.iterator();

        TreeSet ts= new TreeSet();

        while (itr.hasNext())
        {
           Map.Entry entr= (Map.Entry) itr.next();

            System.out.println(entr.getKey());
            System.out.println(entr.getValue());
            ts.add(entr.getValue());
        }

        System.out.println("Tree set "+ts);

        int highestValue=(int)ts.last();


        Set mySet2=mapObj.entrySet();

        System.out.println("myset2 "+mySet2);

        Iterator itr2=mySet2.iterator();

        while (itr2.hasNext())
        {
            Map.Entry entr= (Map.Entry) itr2.next();

            if(entr.getValue().equals(highestValue))
            {
                System.out.println("Frequent number is  "+entr.getKey());
            }
        }

        //int[] a = {1, 3, 1, 1, 2, 3};

        Integer[] aIntegerArray= new Integer[a.length];

        Arrays.setAll(aIntegerArray,i->a[i]);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));



    }
}
