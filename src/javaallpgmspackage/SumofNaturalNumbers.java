package javaallpgmspackage;

import java.util.Scanner;

public class SumofNaturalNumbers {

    public static void main(String[] args) {

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the number and press enter ");

        int givennumber =sobj.nextInt();
        int sum=0;

        for(int i=1; i<=givennumber;i++)
        {
            sum= sum+i;
        }

        System.out.println("The sum of given natural number "+givennumber+" is "+sum+" ");


    }
}
