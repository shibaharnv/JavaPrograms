package javainterviewprograms;

import java.util.Arrays;

public class ArrayFindDuplicatesUsingSorting {

    public static void main(String[] args)
    {
        int[] a= {1,8,4,9,4,6};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j< a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("duplicate no is "+a[i]);
                }
            }
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        for(int k=0;k<a.length-1;k++)
        {
            if(a[k]==a[k+1])
            {
                System.out.println("sort duplicate"+a[k]);
            }
        }
    }
}
