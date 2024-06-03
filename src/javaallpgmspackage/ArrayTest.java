package javaallpgmspackage;

import java.util.Arrays;

public class ArrayTest {


        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = arr1;
            arr2[0] = 10;

            System.out.println("Array 1: " + Arrays.toString(arr1));
            System.out.println("Array 2: " + Arrays.toString(arr2));
        }
    }


