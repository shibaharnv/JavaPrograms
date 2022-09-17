package DataStructureInterview;

import java.util.Arrays;

public class ReverseIntegerArray {

    public static void main(String[] args)
    {

        int[] input ={32,54,143,4444,788,22};

        ReverseIntegerArray obj = new ReverseIntegerArray();

        int[] finaloutputarray = obj.reverseArray(input);

        System.out.println(Arrays.toString(finaloutputarray));

    }


    int[] reverseArray(int[] a)
    {
        int temp=0;

        int[] newarray= new int[a.length];

        for(int i=a.length-1,k=0;i>=0;i--)
        {
            newarray[k]=a[i];
            k++;
        }
        return newarray;


    }
}
