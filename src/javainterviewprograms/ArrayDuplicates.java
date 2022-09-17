package javainterviewprograms;

import java.util.*;

public class ArrayDuplicates {
    //{Write code to filter duplicate elements from an array and print as a list?
    // 1.Declare an array
    // 2.find out the duplicate in the array and return the duplicate element
    // 3. Convert array to list
    // 4. Declare a another list and copy these items and put it in set
    // 5.Set to list
    // 6.Compare two array list using for each }
    public static void main(String[] args)
    {
        String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

        // Conversion of array to ArrayList
        // using Arrays.asList
        List al = Arrays.asList(geeks);

        System.out.println(al);

        int[] a={1,2,3,4,4,5};

        Integer[] integerArray= new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList myList1 = new ArrayList(Arrays.asList(integerArray));

        System.out.println("myList1 "+myList1);

        LinkedHashSet lhsobj= new LinkedHashSet(myList1);


        //Set to list

        ArrayList myList2 = new ArrayList(lhsobj);
        System.out.println("myList2" +myList2);

        System.out.println(myList1.removeAll(myList2));
        System.out.println(myList1);



    }

}
