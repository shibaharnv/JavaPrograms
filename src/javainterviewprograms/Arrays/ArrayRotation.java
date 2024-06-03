package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayRotation {

    public static void main(String[] args) {
        //{[10,20 30]===>  [20,30,10]}

        System.out.println("INPUT:{10,20,30,40,50,60}");
//Left
        System.out.println("LEFT ROTATION");
        int[] a={10,20,30,40,50,60};

        int firstvalue=a[0];

        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=firstvalue;

        // i=0 --> [20,20,30]

        System.out.println(Arrays.toString(a));

        //RIGHT ROTATION
        System.out.println("RIGHT ROTATION");
        int[] b={10,20,30,40,50,60};

        //{}
        int lastvalue=b[b.length-1];

        for(int j=b.length-1;j>0;j--)
        {
            b[j]=b[j-1];        //20,
        }

        b[0]=lastvalue;
        System.out.println(Arrays.toString(b));

        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};

        Integer[] integerNumberArray= new Integer[numbers.length];

        Arrays.setAll(integerNumberArray,i->numbers[i]);

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integerNumberArray));

        Collections.sort(al);
        System.out.println(al);
//        Arrays.parallelSort(numbers);
//
//
//        System.out.println(Arrays.toString(numbers));
    }
}
