package DataStructureInterview.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortRetestTwo {

    public static void main(String[] args)
    {
        int[] a ={13,9,10,5};
        //{Point to remember here is only the position changes not values}

        int[] resultArray =selectionSorting(a);

        System.out.println(Arrays.toString(resultArray));
    }

    static int[] selectionSorting(int[] inputArray)
    {
        int min;

        int temp;

        for (int i=0;i<inputArray.length;i++)
        {
            min=i;

            for(int j=i+1;j<inputArray.length;j++)
            {

                if(inputArray[j]<inputArray[min])
                {
                    min=j;
                }

            }

            temp=inputArray[i];
            inputArray[i]=inputArray[min];
            inputArray[min]=temp;





        }

        return inputArray;
    }
}
