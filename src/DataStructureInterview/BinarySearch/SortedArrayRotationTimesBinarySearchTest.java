package DataStructureInterview.BinarySearch;

public class SortedArrayRotationTimesBinarySearchTest {

    //{Rotated sorted array means we have two sorted arrays-Goal is to find the index of smallest value
    // we can find the mid index value and compare that with the left most item of the array
    // if the mid element value is smaller than left most array value then both are different arrays
    // so we need to search between leftmost value and mid value and ignore the values which are present right side to mid value
    // if the mid value is greater than the left value then it a single array and we need to search on the right side and ignore left side}

    public static void main(String[] args) {
        int[] a = {13,8,2,3,4};

        int leftIndex=0;
        int rightIndex=a.length-1;
        int midIndex;
        int ans = 0;

        // find the smallest number in the circulary sorted array without sorting
        
       // while (leftIndex<=rightIndex)
        {
            midIndex=(leftIndex+rightIndex)/2;
            
            if(a[midIndex]<a[midIndex-1] && a[midIndex]<a[midIndex+1])
            {
                ans=a[midIndex];
            }

        }

        System.out.println("Smallest number in the circular sorted array is  "+ans);



    }
}
