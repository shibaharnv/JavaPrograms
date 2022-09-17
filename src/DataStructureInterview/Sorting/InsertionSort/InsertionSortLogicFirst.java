package DataStructureInterview.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSortLogicFirst {

    public static void main(String[] args) {
        int[] a={5,8,2,4};

        for(int i=1;i< a.length;i++)
        {
            for (int j=i;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=0;
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else
                {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
