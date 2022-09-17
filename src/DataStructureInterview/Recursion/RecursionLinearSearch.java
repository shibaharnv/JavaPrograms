package DataStructureInterview.Recursion;

public class RecursionLinearSearch {

    public static void main(String[] args)
    {
        //{For loop to recursion:
        // logic : pass the i as a parameter
        // write the if conditions and finally is the conditions are not matching call the method again by incrementing the value}

        int[] a={3,2,7,4,9,10};
        int i=0;
        int x=17;
        System.out.println(linearSearchRecursion(a,i,x));
    }


    public static int linearSearchRecursion(int[] a,int i,int x)
    {
        if(i>a.length-1)
        {
            return -1;
        }
        else if(a[i]==x)
        {
            return i;
        }
        else
        {
            System.out.println("index at :"+i);
            return linearSearchRecursion(a,i+1,x);
        }


    }
}
