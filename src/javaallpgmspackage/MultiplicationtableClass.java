package javaallpgmspackage;

import java.util.Scanner;

public class MultiplicationtableClass {


    public static void main(String[] args)
    {
        //{Print the mulitplication table
        // output: 2 *1 = 2
        //2 *1 = 2
        // 2*2=4}

        Scanner sobj = new Scanner(System.in);
        System.out.println("please enter the number here");
        int givennumber= sobj.nextInt();

        for(int i=1;i<=25;i++)
        {
            System.out.println(""+givennumber+" * "+i+" = "+(givennumber*i)+"");
        }

    }

}
