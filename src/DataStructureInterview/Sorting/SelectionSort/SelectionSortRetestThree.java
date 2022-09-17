package DataStructureInterview.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortRetestThree {


    public static void main(String[] args) {
        //{Selection sort:
        //
        // i/p unsorted array and output is sorted array
        // first assume the first element in the array as min
        // only index pointer needs to move and finally swap
        // big o (n2)}


        int[] a ={5,2,1,10,55,77};

        int minIndex = 0;
        int jvalue=0;
        int itemp=0;

        int count=0;

        for(int i=0;i<a.length;i++)
        {
           minIndex=i;

           for(int j=i+1;j< a.length;j++)
           {
               //Assigning minIndex
               if(a[j]<a[minIndex])
               {
                   jvalue=j;
                   minIndex=j;
                   count++;
               }
           }
           if(count>0) {
               //swapping min and a[j values]
               itemp = a[i];
               a[i] = a[minIndex];
               a[jvalue] = itemp;
               count=0;
           }
        }


        System.out.println(Arrays.toString(a));
    }
}
