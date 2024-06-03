package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayCommonElementThreeRetest {

    public static void main(String[] args) {
        //{Convert int array to integer array
        // Add that to array list
        // convert array list to set
        // use retain all method}

        int[] a1={1,2,3};
        int[] a2={1,2,3,4};
        int[] a3={1,2,3,4,5};
        Integer[] a1Integer= integerArrayConversion(a1);
        Integer[] a2Integer= integerArrayConversion(a2);
        Integer[] a3Integer= integerArrayConversion(a3);

    //    Set<Integer> commonElements=findCommonElements(a1Integer,a2Integer,a3Integer);

       //System.out.println("common elements" +commonElements);


        ArrayList al1 = new ArrayList(Arrays.asList(a1Integer));
        ArrayList al2 = new ArrayList(Arrays.asList(a2Integer));
        ArrayList al3 = new ArrayList(Arrays.asList(a3Integer));
        ArrayList retain = new ArrayList(Arrays.asList(a3Integer));

        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al3);

        al1.retainAll(al2);
        al1.retainAll(al3);

        System.out.println("diret retain"+al1);

//        al2.retainAll(al1);
//
//        System.out.println("al2"+al2);



    }


//    public static HashSet findCommonElements(Integer[]... arrays)
//    {
//
//        //take first set retain all with rest of the two sets and then add it to result set
//
//        HashSet set1 = new HashSet(Arrays.asList(arrays[0]));
//
//        HashSet resultSet = new HashSet();
//
//
//        for(int i=1;i< arrays.length;i++)
//        {
//            System.out.println("from method "+Arrays.toString(arrays[i]));
//            HashSet set2 = new HashSet(Arrays.asList(arrays[i]));
//            set1.retainAll(set2);
//
//        }
//
//        resultSet.addAll(set1);
//
//        return resultSet;
//
//
//
//    }



    public static Integer[] integerArrayConversion(int[] intArray)
    {

        Integer[] integerArray=new Integer[intArray.length];
        Arrays.setAll(integerArray,i->intArray[i]);

        return integerArray;
    }


}

