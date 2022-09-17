package DataStructureInterview.BinarySearch;

public class BinarySearchWithIndex {

    //{Check the element if it is present in a sorted array using binary search and return the index}

    public static void main(String[] args)
    {

        int[] a={3,5,6,8,9,10};
        // check if 9 is present and return the index

        int target=11;

        int firstIndex=0;
        int lastIndex=a.length-1;

        int midPoint;

        while (firstIndex<=lastIndex)
        {
            midPoint=(firstIndex+lastIndex)/2;

            if(target==a[midPoint])
            {
                System.out.println("Number found "+a[midPoint]);
                break;
            }

            else if(target>a[midPoint])
            {
                firstIndex=midPoint+1;
            }
            else if(target<a[midPoint])
            {
                lastIndex=midPoint-1;
            }
        }
        if(firstIndex>lastIndex)
        {
            System.out.println("Number not found");
        }




    }
}
