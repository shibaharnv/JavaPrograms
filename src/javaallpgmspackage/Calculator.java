package javaallpgmspackage;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the two numbers");
        double firstno= sobj.nextDouble();
        double secondno= sobj.nextDouble();
        System.out.println("Enter the operators +,-,*, or /");
        char operator=  sobj.next().charAt(0);

        double result;

        switch (operator) {

            case '+':
                result= firstno +secondno;
                System.out.println("Entered operator is " +operator+" and the result is "+result);
                break;
            case '-':
                result= firstno - secondno;
                System.out.println("Entered operator is " +operator+" and the result is "+result);
                break;
            case '*':
                result= firstno  *secondno;
                System.out.println("Entered  operator is " +operator+" and the result is "+result);
                break;
            case '/':
                result= firstno / secondno;
                System.out.println("Entered operator is " +operator+" and the result is "+result);
                break;

            default:
                System.out.println("Enter a Valid operator");
                break;
        }

    }
}
