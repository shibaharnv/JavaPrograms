package DataStructureInterview;

import java.util.Arrays;

public class DeleteElementInArray {

    public static void main(String[] args)
    {
        int[] numberarray={1,2,3,4,5};

        int[] outputarray;

        //numberarray[2]=null;
        DeleteElementInArray obj = new DeleteElementInArray();
        //{input array,index
        // get thte index value and assing null}
        outputarray=  obj.deleteArray(numberarray,2);

        System.out.println("Output array "+Arrays.toString(outputarray));

    }


    public int[] deleteArray(int[] inputarray, int index)
    {
        int[] newarray=new int[inputarray.length-1];

        for(int i=0,k=0;i<=newarray.length;i++)
        {
            if(i==index)
            {
                continue;
            }
            else
            {
                newarray[k]=inputarray[i];
                k++;
            }
        }

        return newarray;

    }

}
