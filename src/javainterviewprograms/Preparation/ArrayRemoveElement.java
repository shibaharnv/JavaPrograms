package javainterviewprograms.Preparation;

import java.util.Arrays;

public class ArrayRemoveElement {

    public static void main(String[] args) {

        int[] array ={2,4,1,6,5,40,-1};


        int[] copy = new int[array.length - 1];

        System.out.println(array.length);
        System.out.println(copy.length);

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != 2) {
                copy[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copy));
    }
}
