package javainterviewprograms.Preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ArrayCommonElements {

    //{Input two arrays
    // Output one Array
    // find the common elements in the array
    // Convert both the arrays to list and make it as a single list by using add all method
    // put the single list in set so that duplicated will be removed convert the set to list name it as second list
    // find out the difference between two lists}

    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={1,4,5};

        Integer[] aArray= new Integer[a.length];
        Integer[] bArray= new Integer[b.length];

        Arrays.setAll(aArray,i->a[i]);
        Arrays.setAll(bArray,i->b[i]);

        ArrayList al1 = new ArrayList(Arrays.asList(aArray));
        ArrayList al2 = new ArrayList(Arrays.asList(bArray));

        System.out.println(al1);
        System.out.println(al2);

        al1.addAll(al2);

        System.out.println("After adding "+al1);

        TreeSet ts = new TreeSet(al1);
        System.out.println(ts);

        ArrayList newList= new ArrayList(ts);

        System.out.println("New List"+newList);

        //find out the difference between al1 and newlist

        ArrayList finalList= new ArrayList(al1);

        finalList.removeAll(newList);

        System.out.println(al1);
        System.out.println(newList);
        System.out.println(finalList);

        // Common in two sets

        TreeSet ts1= new TreeSet(Arrays.asList(aArray));
        TreeSet ts2= new TreeSet(Arrays.asList(bArray));

        ts1.retainAll(ts2);
        System.out.println(ts1);

        // Common in Two Array lists

        ArrayList arrlist1= new ArrayList();
        arrlist1.add(4);
        arrlist1.add(5);
        arrlist1.add(6);

        ArrayList arrlist2= new ArrayList();

        arrlist2.add(6);
        arrlist2.add(5);
        arrlist2.add(6);

        ArrayList diff = new ArrayList(arrlist1);

        diff.removeAll(arrlist2);
        System.out.println("diff "+diff);

//        arrlist2.retainAll(arrlist1);
//
//        System.out.println("Retain common "+arrlist2);
//
//        ArrayList diff = new ArrayList(arrlist1);
//
//        diff.removeAll(arrlist2);
//        System.out.println("diff "+diff);


    }
}
