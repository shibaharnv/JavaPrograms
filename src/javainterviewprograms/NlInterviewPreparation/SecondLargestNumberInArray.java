package javainterviewprograms.NlInterviewPreparation;

import java.util.Arrays;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {

        int[] a={1,7,3,6};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        System.out.println(a[a.length-2]);

    }
}
