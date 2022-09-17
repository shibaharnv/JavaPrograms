package DataStructureInterview.Sorting.QuickSort;

import java.util.Arrays;

public class FindPivotMoveElementLeftRight {

    public static void main(String[] args) {

       // int[] a={6,9,3,8,2,4,11};
        int[] a = {4, 8, 7, 1, 9};

        //int[] a={5,8,4,3,7,6,2,9,5};

        //{First we need to find out the pivot by calculating mid
        // set firstPointer and lastpointer
        // Our goal is to move the smallest elements to the left of the pivot and the higher elements
        // to the right of the pivot
        // take the first value and check if it is less than pivot if yes then increase the pointer
        // if no go and check the lastvalue if it is greater than pivot if yes decrease the lastpointer
        // if no swap two numbers and increase and decrease the pointer}
        int firstPointer=0;
        int lastPointer=a.length-1;
       int[] result= quickSort(a,firstPointer,lastPointer);
        System.out.println("Result "+Arrays.toString(result));
    }

    public static int[] quickSort(int[] arr,int low,int high) {

        if(low>=high)
            return arr;

        int midPoint= (low+high)/2;
        int pivot =arr[midPoint];
        int start= low;
        int end=high;
        System.out.println("pivot value "+pivot);
        while (start<=end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }
        if(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
