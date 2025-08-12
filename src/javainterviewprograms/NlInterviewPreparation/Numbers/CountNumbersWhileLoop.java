package javainterviewprograms.NlInterviewPreparation.Numbers;

public class CountNumbersWhileLoop {

    public static void main(String[] args) {

        int number =235342;
        int result=countDigits(number);

        System.out.println(result);
    }

    public static int countDigits(int number)
    {

        int count=0;
        while (number!=0)
        {
            number=number/10;
            count++;
        }


        return count;
    }


}
