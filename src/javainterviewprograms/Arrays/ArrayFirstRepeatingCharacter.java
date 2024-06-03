package javainterviewprograms.Arrays;

import java.util.*;

public class ArrayFirstRepeatingCharacter {

    //{Input is int array output is a integer
    // Convert the given int array to arraylist with wrapper class
    // get the first element from the list and remove the first element and check if the rest of the list contains the element is yes then return the element
    // move the i value}


    public static void main(String[] args)
    {
        int[] a ={6,7,6,5,7};



        firstRepeatingCharacter(a);


    }



    public static void firstRepeatingCharacter(int[] a)
    {
        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        Set<Integer> set = new HashSet<>();

        for(int value:a)
        {
            if(!set.add(value))
            {

                System.out.println("Repeating vlaue is" +value);
            }
        }

        List<Integer>  al = new ArrayList<>(Arrays.asList(integerArray));

        System.out.println(al);


        Iterator itr=al.iterator();

//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//
//            System.out.println("before removing "+al);
//            itr.remove();
//
//            System.out.println("after removing "+al);
//
//            if(al.contains(itr))
//            {
//                System.out.println("first repeating element is "+itr);
//            }
//        }
       // System.out.println(al);

        int element=0;

//        for(int i=0;i<a.length;i++)
//        {
//            element=al.get(i);
//
//            al.remove(element);
//        }


    }


}
