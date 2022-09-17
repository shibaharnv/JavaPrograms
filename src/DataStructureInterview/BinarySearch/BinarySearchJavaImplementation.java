package DataStructureInterview.BinarySearch;

public class BinarySearchJavaImplementation {

    int[] myArray;

    int firstIndex;
    int lastIndex;
    int midIndex;

    public BinarySearchJavaImplementation(int[] arr)
    {
        this.firstIndex=0;
        this.lastIndex=arr.length-1;
        this.myArray =new int[arr.length-1];
    }

    int binarySearch(int x, int[] givenArray)
    {

        while (firstIndex<=lastIndex)
        {
            midIndex=(firstIndex+lastIndex)/(2);

            if(givenArray[midIndex]==x)
            {
                System.out.println("Value found at index"+midIndex);
                return midIndex;
            }

            if(givenArray[midIndex]>x)
            {
                lastIndex=midIndex-1;
            }
            else
            {
                firstIndex=midIndex+1;
            }

        }
        return -1;
    }


    public static void main(String[] args)
    {

        int[] testArrray={10,20,30,40,50,60};
        BinarySearchJavaImplementation obj = new BinarySearchJavaImplementation(testArrray);
        obj.binarySearch(60,testArrray);
    }


}
