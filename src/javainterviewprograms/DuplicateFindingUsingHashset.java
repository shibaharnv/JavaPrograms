package javainterviewprograms;

import java.util.HashSet;

public class DuplicateFindingUsingHashset {

    public static void main(String[] args)
    {


        int[] a= {1,2,8,8,2,4,5};

        HashSet obj = new HashSet();
        boolean result;

        for(int i=0;i<a.length;i++)
        {

            if(!obj.add(a[i]))
            {
                System.out.println("Duplicate element is "+a[i]);
            }
        }
    }
}
