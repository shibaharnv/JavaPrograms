package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.Arrays;

public class TwoDimesionalArrayBasics {

    public static void main(String[] args) {

        int[][] a = new int[2][3];

        a[0][0] = 5;
        a[0][1] = 10;
        a[0][2] = 15;
        a[1][0] = 20;
        a[1][1] = 25;
        a[1][2] = 30;

        System.out.println(a.length);
        System.out.println(a[0].length);


            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j< a.length;j++)
                {
                    System.out.print(a[i][j]);
                    System.out.print(" ");
                }

                System.out.println();
            }
    }
}

