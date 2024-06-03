package javainterviewprograms.Arrays;

import java.util.Arrays;

public class ArrayLeftRotateStudy {

    public static void main(String[] args) {

        int[] a={1,2,3};

        //o/p[2,3,1]
       //{a[lastindex]=a[0]
        // a[0]=a[1]
        // a[1]=a[2]
        // a[i-1]=a[i]
        // 1st iteration - [2,2,3]
        // 2nd iteration [2,3,3]}

        int rotation=1;



        while(rotation<=2)
        {
            int firstElement=a[0];
            for(int i=1;i<a.length;i++)
            {
                a[i-1]=a[i];
            }
            a[a.length-1]=firstElement;
            rotation++;
        }





        System.out.println(Arrays.toString(a));
    }
}
