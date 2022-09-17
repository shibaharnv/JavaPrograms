package javainterviewprograms;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoNumbers {

    //{Swap two numbers
    //1. Using Temp variable
    // 2. Without using temp variable a+b concept... that is addition substraction -- One of the value should not be zero
    //3. Using multiplication and division-One of the values should not be zero
    // 4.using bitwise XOR
    // 5 Single line swapping without temp variable}

    public static void main(String[] args) {
        //1. Using Temp variable
        int a = 10;
        int b = 20;

        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("value of a " + a + " and b is " + b + "");

        //2. Without temp variable using a+b or adding two variables

        int i = 13;
        int j = 21;
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("value of i " + i + " and j is " + j + "");

        // 3.Using mulitplication and division

        int e=110;
        int f=201;

        e= e*f;
         f= e/f;
         e=e/f;

        System.out.println("value of e " + e + " and f is " + f + "");
         // Using Bitwise XOR operator

        int u=10;
        int v=20;

        u=u^v; //10^20--->30
        v=u^v;//30^20---->10
        u=u^v; //30^10---->20

        System.out.println("value of u " + u + " and f is " + v + "");

        // Single line swapping without temp variable

        int s=10;
        int t=20;

        t=(s+t)-(s=t);
        System.out.println("value of s " + s + " and t is " + t + "");
        //Using Collections Class

        int x = 10;
        int y = 20;
        ArrayList listobj = new ArrayList();
        listobj.add(x);
        listobj.add(y);
        Collections.swap(listobj, 0, 1);
        System.out.println("list obj after swapping " + listobj);

    }
}
