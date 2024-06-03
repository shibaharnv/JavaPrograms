package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysZeroEnd {

    public static void main(String[] args)
    {
        int[] a ={ 0,4,5,3,0,6,0};
        Integer[] integerArray= new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);
        Arrays.sort(integerArray);


        ArrayList al = new ArrayList(Arrays.asList(integerArray));

        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);

//        Collections.reverse(Arrays.asList(al));
//
//        System.out.println(al.get(0));
//        Object[] result= al.toArray();
//        Object[] b = new Object[a.length];
//        int i=0;
//        for(Object c:result)
//        {
//            b[i]=c;
//            i++;
//        }
//        System.out.println(Arrays.toString(b));

    }
}
