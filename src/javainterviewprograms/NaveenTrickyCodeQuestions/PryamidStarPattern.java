package javainterviewprograms.NaveenTrickyCodeQuestions;

public class PryamidStarPattern {


    public static void main(String[] args) {

        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<i;k++)
            {
                if(i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("*");
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }
}
