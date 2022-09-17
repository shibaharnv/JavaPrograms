package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNegativeNumbers {


    public static void main(String[] args) {
        int[] a={-1,2,3,-5,7,-7};

        removeNegativeNumbers(a);
    }

    private static int[] removeNegativeNumbers(int[] inputArray) {


        List<Integer> alist = new ArrayList<Integer>();

        for(int a:inputArray)
        {
            if(a>0)
            {
                alist.add(a);
            }
        }

        System.out.println(alist.toString());

        int[] resultArray= new int[alist.size()];
        Object[] objectArray=alist.toArray();

            for(int i=0;i<objectArray.length;i++)
            {
                resultArray[i]=(int)objectArray[i];
            }

        System.out.println(Arrays.toString(resultArray));

       // Integer[] array = alist.toArray (new Integer[alist.size()]);

        return resultArray;

    }
}
