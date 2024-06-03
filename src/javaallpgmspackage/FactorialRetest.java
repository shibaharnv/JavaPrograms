package javaallpgmspackage;

import java.util.Scanner;

public class FactorialRetest {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        int value=sobj.nextInt();

        System.out.println(value);

        int sum=1;

        for(int i=value;i>0;i--)
        {
            sum=sum*i;
        }

        System.out.println("factorial"+sum);
    }
}
