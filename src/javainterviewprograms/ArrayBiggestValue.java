package javainterviewprograms;

import java.util.Arrays;
import java.util.TreeSet;

public class ArrayBiggestValue {

    public static void main(String[] args)
    {
        //WP to find the biggest value in Array

        int[] a={6,4,7,2,99,444,33,8965};

        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        TreeSet ts = new TreeSet(Arrays.asList(integerArray));

        System.out.println("Sorted "+ts);

        System.out.println("biggest value "+ts.last());
    }
}
