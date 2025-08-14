package javainterviewprograms.NlInterviewPreparation.Numbers;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int inputNumber= scanner.nextInt();

       //{ need to check if the given number is prime
        //prime number should be greater than one
        // prime number should not be divided by numbers other than 1 and itself
        // //if 3 is the input number then check if 3 %2 ==0}

        System.out.println(isPrimeNum(inputNumber));


    }

    private static boolean isPrimeNum(int inputNumber) {

        if(inputNumber<1)
        {
            System.out.println(+inputNumber+ " is not a prime number");
        }

        for(int i=2;i<inputNumber;i++)
        {
            if (inputNumber%i==0)
            {
                return false;
            }
        }

        return true;

    }
}
