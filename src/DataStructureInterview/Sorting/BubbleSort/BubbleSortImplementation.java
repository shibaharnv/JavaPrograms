package DataStructureInterview.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortImplementation {

    public static void main(String[] args) {

        //{compare the adjacent values and bring the smallest values to the left}

        int[] a ={22,10,14,13,6,17};

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=0;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
