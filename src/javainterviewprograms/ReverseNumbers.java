package javainterviewprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseNumbers {


    public static void main(String[] args) {


        int num=12444;
        int x=1/10;

        System.out.println("1/10 value is zero "+x);

        int rev=0;
         while (num!=0)
         {
            rev= (rev*10)+(num%10);

             num=num/10;
         }

        System.out.println("Reverse"+rev);

 // ANother easy approach
        int num2 = 123;
        while (num2!=0)
        {
            int n = num2%10;
            num2 = num2/10;
            System.out.print(n);
        }


        System.out.println();

        // USING STRING BUFFER
        int num3 = 123;
        StringBuffer sb= new StringBuffer(String.valueOf(num3));
        StringBuffer newSb=sb.reverse();
        System.out.println("newsb"+sb);

        //USING STRING BUILDER

        int value= 1234;
        StringBuilder bb= new StringBuilder();
        bb.append(value);
        bb.reverse();

        System.out.println("After reversing  "+bb);
    }
}
