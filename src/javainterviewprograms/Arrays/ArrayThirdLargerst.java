package javainterviewprograms.Arrays;

import java.util.*;

public class ArrayThirdLargerst {

    public static void main(String[] args) {

        int[] a={1,7,3,6,8,9};

        int ans=thirdLargestNumber(a);

        System.out.println(ans);

    }

    private static int thirdLargestNumber(int[] inputArray)
    {
        int result=0;
        Integer[] integerArray = new Integer[inputArray.length];

        Arrays.setAll(integerArray,i->inputArray[i]);

        ArrayList<Integer>  al = new ArrayList<>(Arrays.asList(integerArray));

        Collections.sort(al);

        System.out.println(al);

        result=al.get(2);

        return result;




    }
}
