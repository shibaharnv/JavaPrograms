package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] a={1,2,3};
        System.out.println(a.length);

        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integerArray));

        //Arrays.asList(a);
        Collections.reverse(al);

        System.out.println(al);

        int j=0;
        int temp=0;

        // by creating new Array

        int[] b= new int[a.length];

        for(int i=a.length-1;i>=0;i--)
        {

           b[j]= a[i];
           j++;
        }

        System.out.println("b array "+Arrays.toString(b));

        // WIth out creating new Array using pointer

        int start = 0;
        int end = a.length-1;
        System.out.println("a array "+Arrays.toString(a));

        while (start<end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;

            start++;
            end--;
        }


        System.out.println("wihtout new array "+Arrays.toString(a));


    }
}
