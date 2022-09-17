package DataStructureInterview.Recursion;



public class RecursionBasic {

    public static void main(String[] args)

    {

        reducingByOne(3);
    }



    public static void reducingByOne(int n)
    {
        if(n>=1)
        {
            reducingByOne(n-1);
            System.out.println("Inside loop "+n);
        }


        System.out.println("final completed call "+n);
    }
}
