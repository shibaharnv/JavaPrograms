package DataStructureInterview.Recursion;

public class RecursionBasicTest {

    public static void main(String[] args)
    {

        reduce(10);
    }

    static void reduce(int n)
    {
        if(n>=0)
        {
            reduce(n-1);
        }
        System.out.println(n);
    }
}
