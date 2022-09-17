package DataStructureInterview.Sorting.MergeSort;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args)
    {
        //{Two unsorted arrays -[1,7,3] and [9,2,10]
        // Take the first elements from both the array a1 and a2
        // compare and find out which is smaller ie a1[i]<a2[j]
        // Smallest number should be added to a new array first postion-count
        // if(a1[i]<a2[j])--->put a1[i] in temp and add it to new array
        // and then increment i
        // else condition a2[j]= temp and then add it to new array count position and increament j}

        int[] a1={1,7,3};


        System.out.println(a1.length);

        int[] a2={9,2,10};

        int i = 0,j=0;

        int temp1=0;

        int temp2=0;

        int[] ans=new int[a1.length+a2.length];
        int count=0;
        int anslength=6;
        while (anslength>=0) {
            if (a1[i] < a2[j]) {
                temp1 = a1[i];
                ans[count] = temp1;
                count++;
                i++;
            } else {
                temp2 = a2[j];
                ans[count] = temp2;
                count++;
                j++;
            }
            anslength--;
        }

        System.out.println(Arrays.toString(ans));
    }
}
