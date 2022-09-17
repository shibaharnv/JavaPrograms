package DataStructureInterview.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSortRetest {

    public static void main(String[] args)
    {
        //{Insertion Sort
        // Sorted section and unsorted section
        // big o(n2)
        // }

        int[] a={5,2,1,3};
        int sortedIndex=0;

        int itemp=0;

        for(int i=0;i<a.length;i++)
        {
            sortedIndex=i;

            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[sortedIndex])
                {
                    sortedIndex=j;
                    itemp=a[i];
                    a[i]=a[sortedIndex];
                    a[j]=itemp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
