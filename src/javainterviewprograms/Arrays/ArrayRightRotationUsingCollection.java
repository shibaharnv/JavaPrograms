package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayRightRotationUsingCollection {

    public static void main(String[] args) {

        int numOfRotations=2;
        int[] a={1,2,3,4};

//  //Op [3,4,1,2]
        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList al = new ArrayList(Arrays.asList(integerArray));
//        ArrayList newList = new ArrayList();
//
//        for(int i=a.length-1;i>=numOfRotations;i--)
//        {
//            newList.add(al.get(i));
//        }
//
//        System.out.println(newList);
//
//        Collections.reverse(newList);
//
//        System.out.println(newList);
//
//        al.removeAll(newList);
//
//        System.out.println(al);
//        newList.add(al);
//        System.out.println(newList);

        Collections.rotate(al,2);
        System.out.println(al);
//        List<List<Integer>> lists= new ArrayList<>(newList);
//
//        for(List<Integer> myList:lists)
//        {
//            System.out.println(myList);
//        }

//        al.removeAll(newList);
//        System.out.println(al);
//        al.addAll(newList);
//
//        System.out.println(al);




    }
}
