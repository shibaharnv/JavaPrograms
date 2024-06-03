package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayTwoNumbersSum {

    public static void main(String[] args) {


        int[] a= {10,5,5,-5,15,-10};

        int target=10;

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {

                if(a[i]+a[j]==target)
                {
                    al.add(a[i]);
                    al.add(a[j]);
                }

            }
        }

        System.out.println(al);
    }
}
