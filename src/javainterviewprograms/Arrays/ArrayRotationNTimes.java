package javainterviewprograms.Arrays;

import java.util.Arrays;

public class ArrayRotationNTimes {

    public static void main(String[] args) {

        int[] a= {1,2,3,4};

        int noOfRotation=2;
        //op :4,1,2,3

        int[] b=new int[a.length];
        int j=1;
        System.out.println(a.length);
        int k=1;
        while (k<=noOfRotation) {

            for (int i = 0; i < a.length; i++) {

                if (j < a.length) {
                    b[j] = a[i];
                    j++;
                }


                if (a.length - 1 == i) {
                    b[0] = a[i];
                }

            }
            k++;
        }

        System.out.println(Arrays.toString(b));


    }
}
