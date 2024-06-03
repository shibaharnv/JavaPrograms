package javainterviewprograms.Arrays;

import java.util.Arrays;

public class ArrayRightRotatation {

    public static void main(String[] args) {


        int[] a= {1,2,3,4,5};

        //{First save the last value in temp variable
        // right shift a[4]=a[3]
        // a[3]=a[2]
        // a[2]=a[1]
        // a[1]=a[0]}

        System.out.println("Before right rotation "+ Arrays.toString(a));

        int rotationTime=2;
        int k=1;
        while(k<=rotationTime) {

            int i= a.length-1;
            int temp=a[i];
            while (i > 0) {
                a[i] = a[i - 1];

                i--;
            }
            a[0] = temp;
            k++;
        }
        System.out.println("Before replacing last temp value "+Arrays.toString(a));
    }


}
