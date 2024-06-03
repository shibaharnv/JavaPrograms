package javainterviewprograms.Arrays;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        int[] a={4,5,6,7,8};

        //reverse array with another new array

        int k=0;

        int[] b= new int[a.length];

        for (int i= a.length-1;i>=0;i--)
        {
            b[k]=a[i];
            k++;


        }
        System.out.println(Arrays.toString(b));

        //reverse array in the same array

        //Convert array to Arraylist

        //Arrays.asList(a);

        System.out.println(Arrays.asList(a.toString()));
    }
}
