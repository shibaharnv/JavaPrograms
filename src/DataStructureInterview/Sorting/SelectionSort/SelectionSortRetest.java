package DataStructureInterview.Sorting.SelectionSort;

public class SelectionSortRetest {

    public static void main(String[] args)
    {
        int[] myArray={15,9,4,3};
        //{Input array myarray
        // Assume first value as min
        // Iterate through the array and find the smallest value and swap it to the first elemt
        // take the next element and iterate
        // }
        selectionSort(myArray);

    }


    static void selectionSort(int[] inputArray)
    {
        int min;

        int temp=0;

        for(int i=0;i<inputArray.length;i++)
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


    }

}
