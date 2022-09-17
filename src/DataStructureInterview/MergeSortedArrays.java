package DataStructureInterview;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        //{Given two arrays
        // to do:input two arrays
        // output: single array which is a merge of two arrays
        // 1:sort first array ,second arrays
        // 2.merge two arrays
        // 3.sort the final array}

        int a[] ={3,2,1};
        int b[] ={6,7,4,};
        int[] sortedarray1;
        int[] sortedarray2;
        MergeSortedArrays obj = new MergeSortedArrays();

        sortedarray1 =   obj.sortArrayFunction(a);
        sortedarray2 =   obj.sortArrayFunction(b);

        System.out.println("sortedarray1"+Arrays.toString(sortedarray1));
        System.out.println("sortedarray2"+Arrays.toString(sortedarray2));

        obj.mergeArrays(sortedarray1,sortedarray2);

    }

    int[] sortArrayFunction(int[] input1)
    {

        int temp;
        for(int i=0;i<input1.length;i++)
        {
            for(int j=i+1;j<input1.length;j++)
            {
                if(input1[i]>input1[j])
                {
                    temp=input1[i];
                    input1[i]=input1[j];
                    input1[j]=temp;
                }
            }
        }

        System.out.println("sorted array"+Arrays.toString(input1));
        return input1;
    }


    void mergeArrays(int[] mergeArray1,int[] mergeArray2)
    {

        int[] finalarray = new int[mergeArray1.length+ mergeArray2.length];

        int count=0;

        for(int x=0;x<mergeArray1.length;x++)
        {
            finalarray[x]=mergeArray1[x];
            count++;
        }

        for(int y=0;y<mergeArray1.length;y++    )
        {
            finalarray[count]=mergeArray2[y];
            count++;
        }

        System.out.println("finalarray "+Arrays.toString(finalarray));
    }
}
