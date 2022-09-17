package DataStructureInterview.Sorting.QuickSort;

import java.util.Arrays;

public class PivotMovingGreaterSmallNumbers {

    public static void main(String[] args)
    {

        //{This program is to find the midpoint as pivot and move the small values to the left of the pivot
        // and greater values to the right of the pivot
        // find mid
        // set start and end
        // compare start value with pivot if it is less then increment the start value
        // if the start value is greater then compare the end value with the pivot and see if it is lesser if yes
        // then swap }
        int[] a = {4, 8, 7, 1, 9};

        int startPointer =0;
        int endPointer=a.length-1;

        int midPointer= (startPointer+endPointer)/2;

        System.out.println("midPointer " +midPointer);

        int pivotValue=a[midPointer];

        System.out.println("pivotValue "+pivotValue);
        while (startPointer<=endPointer) {
            while (a[startPointer] < pivotValue) {
                startPointer++;
            }
            while (a[endPointer] > pivotValue) {
                endPointer--;
            }
            System.out.println(a[startPointer]);
            if(startPointer<=endPointer) {
                swap(a, startPointer, endPointer);

                startPointer++;
                endPointer--;

            }
        }

        System.out.println("Output array "+ Arrays.toString(a));

    }


    public static int[] swap(int[] arr,int startIndex,int endIndex)
    {
        int temp=arr[startIndex];
        System.out.println("temp "+temp);
        arr[startIndex]=arr[endIndex];
        arr[endIndex]=temp;


        return arr;
    }

    }

