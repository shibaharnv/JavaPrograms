package DataStructureInterview.Recursion;

public class Print1to100RecursionRetest {

    public static void main(String[] args) {

        print1to100(100);
    }

    private static void print1to100(int n) {

        if(n>=1) {
            print1to100(n - 1);

            System.out.println("value "+n);
        }
    }
}
