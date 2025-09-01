package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysZeroMoveToRightUsingCollection {

    public static void main(String[] args) {

        int[] a={0,1,2,0,0};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        Integer[] integerArray = new Integer[a.length];
        Arrays.setAll(integerArray,i->a[i]);

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integerArray));

        System.out.println(al);

        Collections.reverse(al);

        System.out.println(al);
    }
}
