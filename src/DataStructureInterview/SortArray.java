package DataStructureInterview;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] a={3,1,2};

        //int smallest=a[0];
        int temp;

        for(int i=0;i<a.length;i++)
        {
            for(int j =i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }

        System.out.println(Arrays.toString(a));



    }
}
