package javainterviewprograms.NaveenTrickyCodeQuestions;

public class BiggestNumberUsingWhileLoop {

    public static void main(String[] args) {
        int a=5,b=10;
        int atemp=a;
        int btemp=b;
        int max=0;
        while (a>0 ||b>0)
        {   max++;
            a--;
            b--;
        }

        if(max==atemp)
        {
            System.out.println(" a is bigger");
        }
        else if(max==btemp)
        {
            System.out.println("b is bigger");
        }

    }
}
