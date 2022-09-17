package javainterviewprograms.NaveenTrickyCodeQuestions;

public class StarPatternprogram3 {

    public static void main(String[] args) {
        int count=1;
        int temp=0;



        for(int i=6;i>0;i--)
        {
            for(int j=i;j>0;j--) {
                System.out.print(" ");
                //System.out.println("*");
            }
            temp=count;
            for(int x=0;x<temp;temp--) {
                System.out.print("*");
            }
            System.out.println("");
            count++;
        }
    }
}
