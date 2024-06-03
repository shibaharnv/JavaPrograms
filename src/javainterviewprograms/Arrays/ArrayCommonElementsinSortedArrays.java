package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayCommonElementsinSortedArrays {

    public static void main(String[] args) {


        int[] a={1,3,4,6};
        int[] b={1,3,7,8};
        commonArrays(a,b);
    }

    private static void commonArrays(int[] a, int[] b) {

        Integer[] intarr1=new Integer[a.length-1];
        Integer[] intarr2=new Integer[a.length-1];

        Arrays.setAll(intarr1,i->a[i]);
        Arrays.setAll(intarr2,i->b[i]);

        ArrayList al1= new ArrayList(Arrays.asList(intarr1));
        ArrayList al2= new ArrayList(Arrays.asList(intarr2));

        ArrayList com= new ArrayList(al1);

        System.out.println(al1);
        System.out.println(al2);

        com.retainAll(al2);
        System.out.println("retain"+com);



        HashSet<Integer> hs1=new HashSet<>(al1);
        HashSet<Integer> hs2=new HashSet<>(al2);
        HashSet<Integer> hsCombined=new HashSet<>(hs1);
        hsCombined.addAll(hs2);
        System.out.println(hsCombined);

        hsCombined.removeAll(com);
        System.out.println(hsCombined);



    }




}
