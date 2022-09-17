package DataStructureInterview.Sorting.MergeSort;

import java.util.Arrays;

public class SplitArrayMethodWithParameter {

    public static void main(String[] args)
    {

        int[] a={5,4,7,1};

       int[] resultArr= splitArray(a);

        System.out.println(Arrays.toString(resultArr));
    }


    public static int[] splitArray(int[] arr)
    {

        if(arr.length==1)
        {
            return arr;
        }
        int mid= (arr.length)/2;

        int[] left= splitArray(Arrays.copyOfRange(arr,0,mid));
        int[] right= splitArray(Arrays.copyOfRange(arr,mid,arr.length));

        return left;
    }
}
