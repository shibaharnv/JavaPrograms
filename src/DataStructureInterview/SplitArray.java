package DataStructureInterview;

import java.util.Arrays;

public class SplitArray {

    public static void main(String args[])
    {
        //{input array
        // output two arrays
        // Get the length of the array
        // if it is even halflength = length/2
        // create two arrays with half length and iterate values
        // if length of the array not even then first arary half length is length+1/2
        // second array length =totallength -firstarrayhalflenth
        // }

        int input[] ={0,1,2,3,4};
        int totallength = input.length;
        int first[];
        int second[];

        if(totallength%2==0)
        {
             first =new int[totallength/2];
            second= new int[totallength/2];
        }

        else
        {
            first =new int[(totallength+1)/2];
            second=new int[totallength-first.length];
        }
            int firstcount=0;

        for(int i=0;i<first.length;i++)
        {
            first[i]=input[i];
            firstcount++;
        }

        int count=0;

        for(int j=firstcount;j<input.length;j++)
        {
            second[count]=input[j];
            count++;
        }

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

    }
}
