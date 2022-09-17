package DataStructureInterview.Recursion;

public class SumNonNegativeIntegers {

    public static void main(String[] args)
    {
        int sums=0;
        int i=1;
        int total=0;
       int ans= sum(4,i,total);
        System.out.println("ans "+ans);
    }


    //{Converting to recursion
    // logic - pass i as a parameter
    // in order to break the loop set the condition
    // return statements}



    public static int sum(int n,int i,int total)
    {
        if(i>n)

          return 1;
           total=total+i;
           System.out.println(total);

           return sum(n,i+1,total);






    }


//    public static int sum(int n)
//    {
//        int sum=0;
//        for(int i=1;i<=n;i++)
//        {
//            sum=sum+i;
//        }
//
//        return sum;
//    }
}
