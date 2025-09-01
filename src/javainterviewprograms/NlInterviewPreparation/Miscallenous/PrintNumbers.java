package javainterviewprograms.NlInterviewPreparation.Miscallenous;

import java.util.Scanner;

public class PrintNumbers {

    //{I/P -2
    // 1
    // 122
    // INput number is equal to num of rows
    // //Use String buffer and stre the first element}

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        int num =sobj.nextInt();
        for(int i=1;i<=num;i++)
        {


            for(int j=1;j<=i;j++)
            {
              String result=  String.valueOf(j).repeat(j);
                System.out.print(result);
            }
            System.out.println();
        }
    }
}
