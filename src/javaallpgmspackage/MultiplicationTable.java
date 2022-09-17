package javaallpgmspackage;

import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args)
    {
        //{Print the mulitplication table
        // output: 2 *1 = 2
        //2 *1 = 2
        // 2*2=4}

        Scanner sobj = new Scanner(System.in);
        int givennumber= sobj.nextInt();

        for(int i=1;i<3;i++)
        {
            System.out.println(""+givennumber+" * "+i+" = "+(givennumber*i)+"");
        }

    }

}
