package DataStructureInterview.BinarySearch;

public class BinarySearchIndexMethod {

    public static void main(String[] args)
    {

        int[] a={2, 3, 5, 7, 8, 10, 12, 15, 18, 20};
        BinarySearchIndexMethod obj = new BinarySearchIndexMethod();
        int answer=3;
        int index =obj.binarySearchIndex(a,answer);
        if(index==-1)
        {
            System.out.println("Element not found");
        }



    }


    public int binarySearchIndex(int[] myArr, int target)
    {
        int firstIndex=0;
        int lastIndex=myArr.length-1;
        int midPointIndex;

        while (firstIndex<=lastIndex)
        {
            midPointIndex=(firstIndex+lastIndex)/2;

            if (target==myArr[midPointIndex])
            {
                System.out.println("Number "+target+" found at Index "+midPointIndex);
                return midPointIndex;
            }

            else if(target>myArr[midPointIndex])
            {
                firstIndex=midPointIndex+1;
            }

            else if(target<myArr[midPointIndex])
            {
                lastIndex=midPointIndex-1;
            }
        }

        return -1;
    }

}
