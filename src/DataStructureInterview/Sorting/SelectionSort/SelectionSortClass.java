package DataStructureInterview.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortClass {

    //Selection sort big o notation is o(n2)

    //{Input is array which is not sorted
    // Output is sorted array
    // Write a method for selection sort
    // //logic : assume the first value as min
    // Compare the rest of the values with min value
    // if rest of value is less than min then }

    public static void main(String[] args)
    {

        int[] a= {3,1,66,33,99,17};
        System.out.println("Input Array"+Arrays.toString(a));
        int[] resultArray =selectionSortMethod(a);
        System.out.println("Output array"+Arrays.toString(resultArray));
    }

    public static int[] selectionSortMethod(int[] inputArray)
    {
        int min=0;

        int temp=0;



        for(int i=0;i<inputArray.length;i++)
        {
            boolean flag=false;
            min=inputArray[i];

            for(int j=i+1;j<inputArray.length;j++)
            {
                if(inputArray[j]<min)
                {
                    min=inputArray[j];
                    temp=j;
                    flag=true;
                }
            }
            if(flag)
            {
                inputArray[temp]=inputArray[i];
                inputArray[i]=min;}


        }

        return inputArray;

    }
}
