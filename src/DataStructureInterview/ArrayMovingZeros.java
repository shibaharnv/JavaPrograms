package DataStructureInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMovingZeros {

    public static void main(String[] args)
    {
        int[] a={1,2,0,4,0};

        int[] outputarray = new int[a.length];
        //{input integer array
        // output array
        // check for zero's
        // two arraylists
        // Merge two arrays}

        ArrayList<Integer> arraylist1= new ArrayList<Integer>();
        ArrayList<Integer> arraylist2= new ArrayList<Integer>();
        ArrayList<Integer> finallist= new ArrayList<Integer>();
        int[] numberarray ;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                arraylist2.add(a[i]);
            }
            else
            {
                arraylist1.add(a[i]);
            }
        }
        System.out.println(arraylist1.toString());
        System.out.println(arraylist2.toString());

        Object[] arraywithnumbers= arraylist1.toArray();
        Object[] arraywithzeros= arraylist2.toArray();

        System.out.println(arraylist1.toArray().length);

        int array1length= arraylist1.toArray().length;
        int array2length= arraylist2.toArray().length;

        outputarray = new int[array1length +array2length];
        System.out.println("Output array length "+outputarray.length);
            int count=0;
        for(int j=0;j<array1length;j++)
        {
            outputarray[j]= (int) arraywithnumbers[j];

            count++;
        }

        for(int k=0;k<array2length;k++)
        {
            outputarray[count]= (int) arraywithzeros[k];
        }




        System.out.println("Test "+Arrays.stream(outputarray).count());

        System.out.println("Test "+Arrays.stream(outputarray).toString());
        System.out.println(Arrays.asList(outputarray).toArray());
        for (Integer obj : outputarray)
            System.out.println(obj);
    }
}
