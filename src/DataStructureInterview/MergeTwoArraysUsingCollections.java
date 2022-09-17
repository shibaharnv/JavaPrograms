package DataStructureInterview;

import javaallpgmspackage.Arraylist;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArraysUsingCollections {

    public static void main(String[] args) {
 /*       char a[] ={'c','d','e'};
        char b[] ={'a','b','c'};

        List  list = new ArrayList(Arrays.asList(a));

        list.addAll(Arrays.asList(b));

        System.out.println("list print"+list.get(1));

        Object[] c =list.toArray();
        System.out.println(Arrays.toString(c));*/
//
//        String a[] = { "A", "E", "I" };
//        String b[] = { "O", "U" };
        char a[] ={'c','d','e'};
        char b[] ={'a','b','c'};

        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();

        System.out.println(Arrays.stream(c).toArray());
        System.out.println(Arrays.toString(c));

    }
}
