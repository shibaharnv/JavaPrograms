package DataStructureInterview.Sorting.QuickSort;

import java.util.Arrays;

public class PivotMovingValuesLeftRight {

    public static void main(String[] args) {

        int[] a = {4, 6, 7, 1, 9};
        //{This program is to find the pivot and move the small elements to left
        // bigger elements to the right of pivot
        // in this case mid point is pivot
        //first step find the mid point
        // retrieve the mid point value and store it variable
        //
        // When we have sucessfully moved the smallest element to the left and biggest elements to the right then the
        // pivot is in right position }

        int midIndex = a.length / 2;
        System.out.println("midIndex " + midIndex);

        int[] b = new int[a.length];
        int j = 1, k = 0;


        for (int i = 0; i < a.length; i++) {

            while (a[i]<a[midIndex])
            {
                b[k]=a[i];
                k++;
                i++;
            }

//            if(a[i]==a[midIndex])
//            {
//                b[midIndex]=a[i];
//            }
//            if(a[i]<a[midIndex])
//            {
//                b[midIndex-j]=a[i];
//                j++;
//            }
//
//            else if (a[i]>a[midIndex]) {
//                b[midIndex+k]=a[i];
//                k++;
//            }
//        }


            // System.out.println(Arrays.toString(a));

        }

        System.out.println(Arrays.toString(b));
    }
}
