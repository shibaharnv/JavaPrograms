package DataStructureInterview.Recursion;



public class FactorialRetest {

    public static void main(String[] args) {

        int result=factorial(4);

        System.out.println(result);
    }


    public static int factorial(int n) {

        int i=0;
        if (n==0)
        {
            return 1;
        }

        else
        {
            System.out.println(n);
           return n*factorial(n-1) ;
        }
    }

}
