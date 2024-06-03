package javainterviewprograms.Arrays;

import java.util.Arrays;

public class ArrayLeftRotationIndex {

    public static void main(String[] args) {
        int numOfRotations=3;
        int[] a={1,2,3,4,5};

        //{store the first index and last index and always swap it at the beginning of the loop}
        int firstIndex=0;
        int lastIndex=a.length-1;

        int temp=0;
        for(int i=0;i<a.length-1;i++)
        {

            temp=a[lastIndex];
            a[lastIndex]=a[firstIndex];
           // a[firstIndex]=temp;
         //   System.out.println(Arrays.toString(a));
            a[i+1]=a[i];

        }

    }




}
