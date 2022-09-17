package DataStructureInterview.Sorting.MergeSort;

import java.util.Arrays;

public class SplitArrays {

    public static void main(String[] args)
    {
        int[] a={5,3,9,1,4,2};

        //{Split this single array into two arrays by finding the mid point
        // Use Arrays.copyRange function
        // declare first and second array }

        int midPoint=a.length/2;

        System.out.println("midpoint "+midPoint);

        int[] first= Arrays.copyOfRange(a,0,midPoint);

        int[] second =Arrays.copyOfRange(a,midPoint,a.length);

        System.out.println("first"+Arrays.toString(first));
        System.out.println("second"+Arrays.toString(second));

    }
}
