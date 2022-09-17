package DataStructureInterview.Sorting.MergeSort;

import java.util.Arrays;

public class MergeSortFinalStudy {

    public static void main(String[] args) {
        //{Merge sort works in the divide and   rule principle
        // Things to do in merge sort --> split array ,recursion and merging sorted or single elements
        // first step what we need to do is split the array into left and right}

        int[] a={5,9,8};

        //int[] a={9,4,7,1,6,2,8,4};

        //int[] a={6,32,5,3,7,9};
        int[] result =mergeSort(a);

        System.out.println("Merge sort result "+Arrays.toString(result));
    }

    public static int[] mergeSort(int[] arr)
    {
        //in this method we use divide the input array into two leftarray and right array by finding mid
        //Divided array will be sent back to the same method using recursion
        //until we finds the single element and the single element will be sent to the merge technique

        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));


        return merge(left,right);
    }

    public static int[] merge(int[] left,int[] right)
    {
        int i=0,j=0,k=0;
        int[] joined= new int[left.length+ right.length];

        while (i< left.length&&j< right.length) {

            if (left[i] < right[j]) {
                joined[k] = left[i];
                i++;
                k++;
            } else {
                joined[k] = right[j];
                j++;
                k++;
            }
        }

        while (i< left.length)
        {
            joined[k]=left[i];
            k++;
            i++;
        }

        while (j< right.length)
        {
            joined[k]=right[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(joined));
        return joined;

    }
}
