package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) {
        //{kth smallest Element
        // first sort the array and pass the k and get the values from the index
        // input -int and output int}

        int[] a={7, 10, 4, 3, 20, 15};;

        System.out.println(findKthSmallestElement(3,a));



    }

    public static int findKthSmallestElement(int k,int a[])
    {

        Arrays.sort(a);

        int smallElement=a[k-1];

        return smallElement;

    }
}
