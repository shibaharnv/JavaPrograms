package javainterviewprograms;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int sum=0;
        int secSum=0;
        for(int i=0;i<a.length;i++)
        {
         sum= sum+a[i];
        }

        System.out.println("Array sum is  "+sum);

        for(int s:a)
        {
            secSum=secSum+s;
        }

        System.out.println(secSum);



    }
}
