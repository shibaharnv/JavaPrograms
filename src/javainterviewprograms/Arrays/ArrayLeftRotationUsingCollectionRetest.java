package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLeftRotationUsingCollectionRetest {

    public static void main(String[] args) {

        int numOfRotations=3;
        int[] a={1,2,3,4};

  //Op [4,1,2,3]
        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList al = new ArrayList(Arrays.asList(integerArray));
        ArrayList newList = new ArrayList();

        for(int i=0;i<numOfRotations;i++)
        {
            newList.add(al.get(i));
        }

        System.out.println(newList);

        al.removeAll(newList);
        System.out.println(al);
        al.addAll(newList);

        System.out.println(al);




    }
}
