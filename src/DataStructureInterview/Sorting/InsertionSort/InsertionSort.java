package DataStructureInterview.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    //{Insertion sort : Inserting the elements in the right position
    // sorted and unsorted
    // assume the first element as sorted and rest of the elements as unsorted section
    // take the second value and compare with the previous values and insert them in the right position}

    public static void main(String[] args)
    {
        int[] a={25,47,3};
        int temp=0;
        for(int i=1;i<a.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                  temp=a[j-1];
                  a[j-1]=a[j];
                  a[j]=temp;
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
