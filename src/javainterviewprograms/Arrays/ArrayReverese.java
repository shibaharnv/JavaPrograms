package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverese {

    public static void main(String[] args) {


        int[] a={1,2,3,4,5};

        int[] c=new int[a.length];

        Integer[] integerArray= new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));

        Collections.reverse(list);
        System.out.println(list);

        Integer[] b= list.toArray(new Integer[list.size()]);

        System.out.println(Arrays.toString(b));

        int k=0;
        for(int i=a.length-1;i>=0;i--)
        {
            c[i]=a[k];
            k++;
        }

        System.out.println(Arrays.toString(c));
    }
}
