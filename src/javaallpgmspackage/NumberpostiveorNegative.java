package javaallpgmspackage;

import java.util.Scanner;

public class NumberpostiveorNegative {

    public static void main(String[] args)
    {

        //{Java Program to Check Whether a Number is Positive or Negative
        // if the given number is greater than zero then it is positive
        // double integer will handle both int and floats}

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number here...");
        double num =obj.nextInt();


       //int num =0;
        //double num =0;

        if(num>0)
        {
            System.out.println("Given number "+num+" is a positive number ");
        }
        else if (num==0)
        {
            System.out.println("Given number is zero ");
        }

        else
        {
            System.out.println("Given number "+num+" is a negative number ");
        }

    }
}
