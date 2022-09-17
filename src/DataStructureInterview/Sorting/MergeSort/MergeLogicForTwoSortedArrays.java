package DataStructureInterview.Sorting.MergeSort;

import java.util.Arrays;

public class MergeLogicForTwoSortedArrays {

    //{This program will work for two sorted arrays or two single element in array}

    public static void main(String[] args) {

//        int[] first={10,11,13,15};
//        int[] second={14,18,20,22};


        int[] first={4,5};
        int[] second={1,7};
        
        int[] joined=new int[(first.length+second.length)];
        
        int i = 0,j=0,k=0;

        while (i< first.length && j< second.length) {
            if (first[i] < second[j]) {
                joined[k] = first[i];
                i++;
                k++;
            } else {
                joined[k] = second[j];
                j++;
                k++;
            }
        }

        while (i< first.length)
        {
            joined[k]=first[i];
            i++;
            k++;
        }

        while (j< second.length)
        {
            joined[k]=second[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(joined));
    }
}
