package DataStructureInterview.Recursion;

public class Print321Recurion {

    public static void main(String[] args) {


        print321(1);
    }

    public static void print321(int n)
    {
        if(n<=2)
        print321(n+1);
        System.out.println(n);
    }
}
