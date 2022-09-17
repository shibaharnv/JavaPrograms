package DataStructureInterview.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSortRetesting {

    public static void main(String[] args) {

        int[] a={15,9,4,3};
        int min=0;
        int itemp=0;

        for(int i=0;i<a.length;i++)
        {
            min=a[i];

            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    a[j]=a[i];
                    a[i]=min;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
