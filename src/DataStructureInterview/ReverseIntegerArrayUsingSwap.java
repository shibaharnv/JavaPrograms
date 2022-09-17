package DataStructureInterview;

import java.util.Arrays;
import java.util.Collections;

public class ReverseIntegerArrayUsingSwap {

    public static void main(String[] args)
    {

        int[] input ={155,233,553,4663,534534,454,4343};

        ReverseIntegerArrayUsingSwap obj = new ReverseIntegerArrayUsingSwap();

        Collections.reverse(Arrays.asList(input));

        System.out.println("Test" +Arrays.asList(input));

        int[] finaloutputarray = obj.reverseArray(input);

        int dividedby2= input.length/2;
        System.out.println("dividedby2 "+dividedby2);

        System.out.println(Arrays.toString(finaloutputarray));

    }


    int[] reverseArray(int[] a)
    {
        int temp=0;

        for(int i=0,k= a.length-1;i<a.length/2;i++)
        {

            temp= a[i];
            a[i]=a[k];
            a[k]=temp;

            k--;

        }

        return a;
    }
}
