package DataStructureInterview.Sorting.MergeSort;

import java.util.Arrays;

public class MergeSortFinalRetest {

    public static void main(String[] args) {
        //{Logic : MErge sort divide the array and merge techinique
        // Merge method should be seperate and it will accept single element or sorted array for merging
        // Arrays.copyrange method we need to use
        // Merge sort method input is array and merge method input is single element or sorted array
        // recursion we need to use and return statements aswell
        // finding mid value}

        //int[] a={5,4,7,1};

        int[] a={645,323,546,3,12,9};

        int[] result =mergeSort(a);

        System.out.println(Arrays.toString(result));
    }



    public static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }

        int mid= arr.length/2;

        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);


    }

    public static int[] merge(int[] left,int[] right)
    {

        int i=0,j=0,k=0;

        int[] joined= new int[left.length+ right.length];

       while (i< left.length && j< right.length) {
           if (left[i] < right[j]) {
               joined[k] = left[i];
               k++;
               i++;
           } else {
               joined[k] = right[j];
               k++;
               j++;
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


       return joined;

    }
}
