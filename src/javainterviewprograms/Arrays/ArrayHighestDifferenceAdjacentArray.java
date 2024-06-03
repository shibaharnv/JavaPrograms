package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArrayHighestDifferenceAdjacentArray {

    public static void main(String[] args) {

        int[] a={1,4,8,15,17}; //3,4,7,2

        int diff=0;

        TreeSet ts= new TreeSet();
        List al= new ArrayList();

        for(int i=0;i<a.length-1;i++)

        {
            if(a[i+1]-a[i]>diff)
            {
                al.clear();
                diff=a[i+1]-a[i];
                al.add(a[i+1]);
                al.add(a[i]);

            }
        }

        System.out.println(diff);

        System.out.println(al);


//        for(int i=0;i<a.length-1;i++)
//        {
//            diff=a[i+1]-a[i];
//
//            ts.add(diff);
//        }
//
//        System.out.println(ts);
//        System.out.println(ts.last());
    }
}
