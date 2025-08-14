package javainterviewprograms.NlInterviewPreparation.Numbers;

public class CountSumOfDigits {

    public static void main(String[] args) {


        int num=123;
        int rem=0;
        int result=0;
        while (num!=0)
        {
            rem=num%10;
            result=result+rem;
            num=num/10;
        }

        System.out.println(result);
    }
}
