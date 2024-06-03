package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class ArraySorting {

    public static void main(String[] args)
    {
        int[] a = {3,6,3,89,05,23};

        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        TreeSet ts = new TreeSet(Arrays.asList(integerArray));

        System.out.println(ts);
    }
}
