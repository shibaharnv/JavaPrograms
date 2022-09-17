package javainterviewprograms.NaveenTrickyCodeQuestions;

public class Intaintb256 {

    public static void main(String[] args)
    {
        //{Expected output is int a1,int a2 ,int a3 }

        int num=1;
        System.out.println("int a" +num);

        for(int i=1;i<=255;i++)
        {
            System.out.print("int a"+i);
            if(i!=255) {
                System.out.print(" ,");
            }
        }
    }
}
