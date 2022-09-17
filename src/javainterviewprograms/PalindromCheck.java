package javainterviewprograms;

import java.util.Scanner;

public class PalindromCheck {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        String ss= sc.next();
        int number =sc.nextInt();
        int num=number;
        int rev=0;

        while (num!=0)
        {
           rev= (rev*10)+(num%10);

            num=num/10;
        }

        System.out.println(rev);

        if (rev==number)
        {
            System.out.println("Given number"+rev+" is a palindrome");
        }
        else
        {
            System.out.println("Given number"+rev+" is not a palindrome");
        }
    }
}
