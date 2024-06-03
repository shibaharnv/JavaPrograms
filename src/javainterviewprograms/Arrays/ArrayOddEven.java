package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOddEven {

    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6};

        int remainder;

        ArrayList oddArrayList= new ArrayList();
        ArrayList evenArrayList= new ArrayList();

        for(int i=0;i<a.length;i++)
        {
            remainder=a[i]%2;
            if(remainder==0)
            {
                evenArrayList.add(a[i]);
            }
            else
            {
                oddArrayList.add(a[i]);
            }
        }

        System.out.println(Arrays.asList(oddArrayList));
        System.out.println(Arrays.asList(evenArrayList));

    }
}
