package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class ArrayMinMax {

    public static void main(String[] args) {
        int[] a = {3, 5, 3, 5, 7, 89, 4, 6, 6, 2, 1};

        //{Find minimum and max number in the array
        // 1. Use Set or List}

        Integer[] integerArray = new Integer[a.length];
        Arrays.setAll(integerArray, i -> a[i]);

        TreeSet ts = new TreeSet(Arrays.asList(integerArray));
        ArrayList al = new ArrayList(Arrays.asList(integerArray));
        System.out.println(ts);
        System.out.println("array list" + al);

        Collections.sort(al);
        System.out.println("After sorting" + al);
        System.out.println(al.get(al.size() - 1));
        System.out.println(al.get(0));


        //Other approach

        int[] b = {2, 3, 645, 2, 4, 7, 9, 05};
        int max = b[0];

        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }

        System.out.println(max);
    }
}
