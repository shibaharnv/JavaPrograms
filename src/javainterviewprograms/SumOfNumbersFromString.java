package javainterviewprograms;

import java.util.Arrays;

public class SumOfNumbersFromString {

    public static void main(String[] args) {

        String a="123a";

        int results=0;

        a=a.replaceAll("[(a-z)]","");
        System.out.println(a);


        for(int k=0;k<a.length();k++)
        {
            int z=Character.getNumericValue(a.charAt(k));
            results=results+z;
        }

        System.out.println(results);

        int sum=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)>='0' && a.charAt(i)<='9')
            {
                sum=sum+(a.charAt(i)-'0');
            }
        }

        System.out.println("sum "+sum);




    }
}
