package DataStructureInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayUsingArrayList {

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};

        ArrayList<Integer> aobj = new ArrayList<Integer>();

        for(int i=arr.length-1;i>=0;i--)
        {
            aobj.add(arr[i]);
        }

        System.out.println(Arrays.asList(aobj));
    }
}
