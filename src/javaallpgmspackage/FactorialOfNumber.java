package javaallpgmspackage;

import java.util.Scanner;

public class FactorialOfNumber {


    public static void main(String[] args)
    {

        // Factorial of zero is one

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number here and press enter");
        int givennumber =sobj.nextInt();
        int i=1;
        int output=1;


        while(i<=givennumber)
        {
            output = output*i;
            i++;
        }

        System.out.println("The factorial of " +givennumber+" is " +output+"");
    }
}
