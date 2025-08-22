package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class ReveresArray {

    public static void main(String[] args) {


        int[] a = {7, 10, 4, 3, 20, 15};
         Integer[] integerArray= new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integerArray));

        Collections.reverse(al);

        System.out.println(al);
        Object[] resultArray=al.toArray();

        System.out.println(Arrays.toString(resultArray));



    }
}
