package DataStructureInterview.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSortCorrect {

    public static void main(String[] args) {
        //{Insertion sort logic
        // int[] a={4,2,3,1}
        // Insertion sort take the second value and compare it with previous values if it is less then swap if not break

        // outer loop logic take the i value from the second position and it should go it end of the array
        // inner loop logic j value should start from the same i value and it has to reduce the value and do comparison
        // if the a[j]<a[j-1] then swap if not break}


        int[] a= {3,1,66,33,99,17};;



        for (int i=1;i<a.length;i++)
        {

            for(int j=i;j>0;j--)
            {
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
