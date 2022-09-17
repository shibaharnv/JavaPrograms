package DataStructureInterview.BinarySearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedArrayRotationTimes {
;

    //{Sorted array =Anti clockwise rotation - moving elements to the right
    // Sorted array =Clockwise rotation -Moving elements to the left
    // in order to find out the number of times the sorted array is rotated we need to find the index position of smallest number
    // Input :rotated array
    // output :index value integer
    // find the smallest number in the rotated array
    // sort the array and store it in a different array and smallest element should be the first element of the sorted array that can be saved.
    // in the actual array find out the index of the smallest number through linear search or binary search }

    public static void main(String[] args)
    {
        int[] inputArray={5,8,11,12,3};

        int outputIndex;

        Integer[] inputIntegerArray= new Integer[inputArray.length];

        Arrays.setAll(inputIntegerArray,i->inputArray[i]);

        SortedSet ssobj=new TreeSet(Arrays.asList(inputIntegerArray));

        System.out.println(ssobj);

        Object firstElementObject=ssobj.first();

        int firstElement= (int) firstElementObject;

        System.out.println("firstElement "+firstElement);

        for(int i=0; i<inputArray.length;i++)
        {
            if(inputArray[i]==firstElement)
            {
                System.out.println("Sorted array is rotated "+i+" times");
            }
        }



    }

}
