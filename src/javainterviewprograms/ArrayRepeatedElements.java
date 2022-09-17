package javainterviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class ArrayRepeatedElements {

    public static void main(String[] args)
    {
        int[] a={2,4,6,7,8,8,4,4};

        //find the repeated elements

        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList al = new ArrayList(Arrays.asList(integerArray));
        ArrayList dupl = new ArrayList();

        TreeSet ts = new TreeSet();

        for(Object s:al)
        {
            if(!ts.add(s))
            {
                dupl.add(s);
            }
        }

        System.out.println(dupl);
        TreeSet ts1 = new TreeSet(dupl);
        System.out.println(ts1);
    }
}
