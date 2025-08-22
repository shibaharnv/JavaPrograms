package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.ArrayList;

public class ArrayMissingNumberRetest {

    public static void main(String[] args) {

        int[] a={1,2,5,6,9};

        //{1, 2,4,5
        // 0 ,1,2,3  }
        findMissingNUmber(a);

    }

    private static int findMissingNUmber(int[] a) {

        int missingNumber = 0;

        ArrayList al = new ArrayList();

        int diff=0;

        for(int i=1;i<a.length;i++)
        {

            diff=a[i]-a[i-1];

            if(diff>1)
            {
                for(int j=1;j<diff;j++)
                {
                    missingNumber=  a[i-1]+j;
                    al.add(missingNumber);
                }
            }


        }


        System.out.println(al);
        return missingNumber;


    }
}
