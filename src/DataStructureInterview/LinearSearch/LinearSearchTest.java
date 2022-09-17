package DataStructureInterview.LinearSearch;

public class LinearSearchTest {

    public static void main(String[] args)
    {
        int[] a={4,5,2,7,9};

        int x=14;
        int indexValue=linearSearchMethod(a,x);
        System.out.println("indexValue "+indexValue);

        if(indexValue!=-1)
        {
            System.out.println("Element "+x+" found at index "+indexValue+" ");
        }
        else
        {
            System.out.println("Element not found");
        }
    }

    public static int linearSearchMethod(int[] a,int x)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                return i;
            }
        }

        return -1;

    }
}
