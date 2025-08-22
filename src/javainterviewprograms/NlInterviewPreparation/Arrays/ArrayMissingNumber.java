package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.ArrayList;

public class ArrayMissingNumber {

    public static void main(String[] args) {

        int[] a={1,3,5};

        //{1, 2,4,5
        // 0 ,1,2,3  }
        findMissingNUmber(a);

    }

    private static int findMissingNUmber(int[] a) {

        int missingNumber = 0;

        ArrayList al = new ArrayList();



        for(int i=1;i<a.length;i++)
        {
            if(a[i]-a[i-1]==2)
            {
              missingNumber=  a[i-1]+1;
              al.add(missingNumber);
            }
            if(a[i]-a[i-1]==3)
            {
                missingNumber=  a[i-1]+1;
                al.add(missingNumber);
                missingNumber=  a[i-1]+2;
                al.add(missingNumber);

            }

            if(a[i]-a[i-1]==4)
            {
                missingNumber=  a[i-1]+1;
                al.add(missingNumber);
                missingNumber=  a[i-1]+2;
                al.add(missingNumber);
                missingNumber=  a[i-1]+3;
                al.add(missingNumber);
                missingNumber=  a[i-1]+4;
                al.add(missingNumber);

            }

        }


        System.out.println(al);
        return missingNumber;


    }
}
