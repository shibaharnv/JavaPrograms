package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLeftRotationUsingCollection {

    public static void main(String[] args) {

        int numOfRotations=3;
        int[] a={1,2,3,4,5};


        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList al = new ArrayList(Arrays.asList(integerArray));


        ArrayList removedNumbersList= new ArrayList();

        System.out.println(al);

        for(int i=0;i<numOfRotations;i++)
        {
            removedNumbersList.add(al.get(i));

        }



        System.out.println("after removing"+al);

        System.out.println("removedNumbersList"+removedNumbersList);


        al.removeAll(removedNumbersList);

        System.out.println("After removall"+al);
        al.addAll(removedNumbersList);
        System.out.println("after add all"+al);


        // two times left shift going to delete the first two elements in the array and add it to last elemet





    }
}
