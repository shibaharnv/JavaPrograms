package javainterviewprograms.Arrays;

import java.util.Arrays;

public class PassMultipleArrays {

    public static void main(String[] args) {

        int[] a={1,2,3,4};
        int[] b={1,2,3,4};
        multipleArrays(a,b);

    }


    public static void multipleArrays(int[]...inputArrays)
    {
        for (int[] array:inputArrays)
        {
            System.out.println(Arrays.toString(array));
        }

    }
}
