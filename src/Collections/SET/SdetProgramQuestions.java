package Collections.SET;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SdetProgramQuestions {

    public static void main(String[] args)
    {
        //Find the second largest number in array

        int[] a ={2,10,9,7,5};

        Integer[] intarray = new Integer[a.length];

        Arrays.setAll(intarray,i->a[i]);

        TreeSet sobj = new TreeSet(Arrays.asList(intarray));



        System.out.println(sobj);
        System.out.println("Poll first "+sobj.pollFirst());
        System.out.println("Poll last "+sobj.pollLast());
        System.out.println(sobj);
        System.out.println("Second last "+sobj.pollLast());
       // System.out.println(sobj.last());

       //Smallest and largest array


        int[] b ={2,10,9,7,5};

        Integer[] integerarray = new Integer[b.length];

        Arrays.setAll(integerarray,i->a[i]);

        TreeSet ttobj = new TreeSet(Arrays.asList(integerarray));
        System.out.println(ttobj);
        System.out.println("smallest "+ttobj.first());
        System.out.println("largest "+ttobj.last());



    }
}
