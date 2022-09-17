package DataStructureInterview.BinarySearch;

public class FindSmallNumberInCircualrSortedArray {

    //{Find a small number in circularly sorted array
    // Sample array:[8,5,2,3]
    // input : Array
    // output: integer value from array
    // circularly sorted array means two sorted array
    // find the pivot or breaking point between the arrays
    // }



    public static void main(String[] args)
    {
        int[] a ={5,8,2,3};

        int firstIndex=0;
        int lastIndex=a.length-1;
        int midIndex;

        int pivot=0;

        while (firstIndex<=lastIndex)
        {
            midIndex=(firstIndex+lastIndex)/2;

            if(a[midIndex]<a[firstIndex])
            {
                lastIndex=midIndex;
            }

            else if(a[midIndex]>a[firstIndex])
            {
                firstIndex=midIndex;
            }

            else
            {
                pivot=firstIndex;
            }
        }

        System.out.println(pivot);
    }
}
