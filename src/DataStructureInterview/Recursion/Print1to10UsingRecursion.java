package DataStructureInterview.Recursion;

public class Print1to10UsingRecursion {

    public static void main(String[] args) {
        increaseByOne(1);

    }

   public static void increaseByOne(int n)
    {
        if(n<=10) {
            System.out.println("finished "+n);
            increaseByOne(n + 1);

           // System.out.println("finished "+n);
        }
    }
}
