package javainterviewprograms.NaveenTrickyCodeQuestions;

public class Print100WithoutNumbers {

    public static void main(String[] args)
    {
        //{printing numbers from 1 to 100}



        String single="a";
        int a=single.length();
        String myString="abcdefghij";

        int count=(myString.length()*myString.length());


        System.out.println("a value "+single.length());

        System.out.println("count value "+count);
        for (int i=a;i<=count;i++)
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
