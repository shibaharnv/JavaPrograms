package javainterviewprograms;

import java.util.Arrays;
import java.util.TreeSet;

public class LargestNumber {

    public static void main(String[] args)
    {
        int[] a={1,4,2};
        //Find the largest of three numbers

        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        TreeSet sobj = new TreeSet(Arrays.asList(integerArray));

        System.out.println("Set obj "+sobj);

        System.out.println("Largest Number "+sobj.last());

        // Tenary operator

        int b=10; int c= 20; int d=30;

            int largest1=b>c?b:c;

            int largest3=d>largest1?d:largest1;
            //replacing largest 1 value
            int largest2= d>(b>c?b:c)?d:(b>c?b:c);
        System.out.println("largest number is "+largest2);


        }

}
