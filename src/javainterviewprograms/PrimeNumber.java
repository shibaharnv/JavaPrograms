package javainterviewprograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int givenNumber=sc.nextInt();
        int remainder;
        boolean flag=false;

        if(givenNumber!=0)
        {
            remainder=givenNumber%2;
            if(remainder!=0)
            {
                flag=true;
            }

        }

        else
        {
            System.out.println("Given number"+givenNumber+ "is Zero");
        }

        if(flag)
        {
            System.out.println("Given number "+givenNumber+ "is prime");
        }
        else
        {
            System.out.println("Given number "+givenNumber+ "is not prime");
        }
    }
}
