package DataStructureInterview.Recursion;

public class Print100to1Recursion {

    public static void main(String[] args) {

        print100to1(1);
    }

    public static void print100to1(int n)

    {
        if(n<=9)
        {
            print100to1(n+1);
        }
        System.out.println(n);

    }
}
