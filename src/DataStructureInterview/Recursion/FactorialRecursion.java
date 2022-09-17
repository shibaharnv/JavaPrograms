package DataStructureInterview.Recursion;

public class FactorialRecursion {

    //{5!=5*4*3*2*1---->5*4!
    // 4!=4*3*2*1------>4*3!}
    //static int factnum=0;
    public static void main(String[] args) {

        int ans=fact(4);
        System.out.println(ans);


    }

    public static int fact(int n) {

        if(n==0)
        {
            return 1;
        }

    else
        {
            System.out.println(n);
            return n*fact(n-1);

        }


    }
}
