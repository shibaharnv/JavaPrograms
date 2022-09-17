package DataStructureInterview;

import java.util.Arrays;

public class ReverseArrayUsingWhileLoop {


    public static void main(String[] args)
    {

        ReverseArrayUsingWhileLoop obj = new ReverseArrayUsingWhileLoop();
        int[] a= {1,2,3,4,5};

        int startindex=0;
        int endindex=a.length-1;
        int[] outputarray= new int[a.length-1];
        System.out.println(Arrays.toString(a));
        while (endindex>startindex)
        {

            outputarray = obj.swapNumbers(a,startindex,endindex);
            startindex++;
            endindex--;

        }
        System.out.println(Arrays.toString(outputarray));

    }

    int[] swapNumbers(int[] input, int startindex, int endindex)
    {
        int temp=0;

        temp=input[startindex];
        input[startindex]=input[endindex];
        input[endindex]=temp;

        return input;
    }
}
