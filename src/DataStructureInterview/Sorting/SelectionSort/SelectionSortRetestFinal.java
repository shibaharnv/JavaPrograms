package DataStructureInterview.Sorting.SelectionSort;


import java.util.Arrays;

public class SelectionSortRetestFinal {

    public static void main(String[] args)

            //{big o(n2)}

            //Finding new mininum
    {
        int[] a={1,2,3};

        int minIndex=0;

        int temp=0;

        int jIndex=0;

        int count=0;

        for(int i=0;i< a.length;i++)
        {
            minIndex=i;

            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[minIndex])
                {

                    minIndex=j;
                    jIndex=j;
                    count++;
                }
            }
            if(count>0) {
                temp = a[i];
                a[i] = a[minIndex];
                a[jIndex] = temp;
                count=0;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
