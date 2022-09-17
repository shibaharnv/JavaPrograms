package javainterviewprograms.NaveenTrickyCodeQuestions;

public class MinNumberUsingWhileLoop {

    public static void main(String[] args) {
        minNumber(4,5);
    }

    public  static void minNumber(int a,int b)
    {
        int max=0;
        while (a>0 &&b>0)
        {
            a--;
            b--;
            max++;
        }

        System.out.println(max);

    }
}
