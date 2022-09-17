package DataStructureInterview.BinarySearch;

public class SortedArrayRotationTimesBinarySearch {

    //{Rotated sorted array means we have two sorted arrays-Goal is to find the index of smallest value
    // we can find the mid index value and compare that with the left most item of the array
    // if the mid element value is smaller than left most array value then both are different arrays
    // so we need to search between leftmost value and mid value and ignore the values which are present right side to mid value
    // if the mid value is greater than the left value then it a single array and we need to search on the right side and ignore left side}

    public static void main(String[] args) {
        int[] inputArray = {5, 8, 11, 12, 3,4};

        int leftIndex=0;
        int rightIndex=inputArray.length-1;
        int midIndex;
        int pivot=-1;

        while (leftIndex<=rightIndex)
        //while (rightIndex-leftIndex>1)
        {
            midIndex=(leftIndex+rightIndex)/2;

            if(inputArray[midIndex]<inputArray[leftIndex])
            {
                rightIndex=midIndex;
            }
            else if (inputArray[midIndex]>inputArray[leftIndex])
            {
                leftIndex=midIndex;
            }
            else
            {
                pivot=leftIndex;
                break;
            }

        }
        System.out.println(pivot);


    }
}
