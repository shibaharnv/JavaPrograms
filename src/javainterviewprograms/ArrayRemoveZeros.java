package javainterviewprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRemoveZeros {

    public static void main(String[] args)
    {
        int[] a ={1,0,3,0,7,0,54,0};
        //{input array
        // output array without zeros
        // convert array to list using Arrays.asList
        // Iterator list}
        Integer[] integerArray = new Integer[a.length];
        Arrays.setAll(integerArray,i->a[i]);

        ArrayList<Integer> aobj = new ArrayList(Arrays.asList(integerArray));


        System.out.println(aobj);

        for(int i=0;i< aobj.size();i++)
        {
            if(aobj.get(i)==0)
            {
                aobj.remove(i);
            }
        }

        System.out.println("After removing zeros "+aobj);
    }
}
