package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.Arrays;

public class ArraysMoveZerosToRight {

    //{Input -[1,0,2]-->[1,2,0]-- Two pointers
    // One pointer for loop i index next pointer nonzeroIndex which starts from zeroth position
    // Check if each element inside  and see if it is not equa to zero is yes swap with nonzero index place }

    public static void main(String[] args) {

        int[] a ={0,5,4};
        int nonZeroIndex=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                int temp=a[i];
                a[i]=a[nonZeroIndex];
                a[nonZeroIndex]=temp;
                nonZeroIndex++;
            }

        }

        System.out.println(Arrays.toString(a));

    }
}
