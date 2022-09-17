package javainterviewprograms;

public class RecursionFactorial {

    //{Find the factorial using recursion
    // 4= 4*3*2*1 = 4* 3! ==n*(n-1)!
    //3= 3*2*1}

    public static void main(String[] args)
    {
        int n=4;

        System.out.println(fact(n));

    }

    private static int fact(int n) {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);

    }
}
