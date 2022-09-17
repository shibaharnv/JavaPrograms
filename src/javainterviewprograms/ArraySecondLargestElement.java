package javainterviewprograms;

import java.util.Arrays;
import java.util.TreeSet;

public class ArraySecondLargestElement {

    public static void main(String[] args) {
        int[] a={3,2,6,4,9,10};

        Integer[] integerArray= new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        TreeSet ts = new TreeSet(Arrays.asList(integerArray));

        System.out.println(ts);
        ts.pollLast();
        Object second = ts.pollLast();
        System.out.println(second.toString());


    }
}
