package javaallpgmspackage;

import java.util.Arrays;

public class SubArraySumToGivenNumber
{
    static void findSubArray(int[] a, int inputNumber)
    {



        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int sum=0;
                sum=a[i]+a[j];
                System.out.println("Sum is "+sum);

                if(sum==inputNumber)
                {
                    System.out.println(a[i]);
                    System.out.println(a[j]);
                    //System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, j+1)));

                    System.out.println(Arrays.toString(Arrays.copyOfRange(a,i,j+1)));
                }

            }
        }




    }

    public static void main(String[] args)
    {
        //findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArray(new int[]{1, 2, 3, 13}, 5);

       // findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }
}