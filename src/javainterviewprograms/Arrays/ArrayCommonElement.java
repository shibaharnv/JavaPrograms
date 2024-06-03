package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCommonElement {

    public static void main(String[] args) {


        int[] a={1,2,3,4};

        int[] b= {1,2,3};

        int alength= a.length;

        int blengh=b.length;

        System.out.println(alength);




        Integer[] integerArray1= new Integer[a.length];
        Integer[] integerArray2= new Integer[b.length];
        Arrays.setAll(integerArray1,i->a[i]);
        Arrays.setAll(integerArray2,i->b[i]);

        ArrayList al1= new ArrayList(Arrays.asList(integerArray1));
        ArrayList al2= new ArrayList(Arrays.asList(integerArray2));

        System.out.println(al1.retainAll(al2));
        System.out.println("retain "+al1);

        ArrayList al3= new ArrayList();


        if(alength>blengh)
        {   al3=al1;
            al1.removeAll(al2);
            System.out.println("al1" +al1);
            System.out.println("Duplicate element removal" +al3.removeAll(al1));
            System.out.println("Duplicate element" +al3);
        }

        else
        {

            al3.addAll(al2);
            System.out.println("al3"+al3);
            al2.removeAll(al1);
            System.out.println("al2 "+al2);
            System.out.println("al3"+al3);
            System.out.println("Duplicate element removal" +al3.removeAll(al2));
            System.out.println("Duplicate element" +al3);

        }

//        System.out.println(al2.removeAll(al1));
//
//        System.out.println(al2);
    }
}
