package javainterviewprograms.NlInterviewPreparation.Numbers;

public class Factorial {

    public static void main(String[] args) {

        //{3!=3*2*1}

        int num=5;

        int temp =1;
        for(int i=num;i>0;i--)
        {

            temp=temp*i;
        }
        System.out.println(temp);
    }

}
