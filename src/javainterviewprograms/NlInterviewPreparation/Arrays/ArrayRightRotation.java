package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.Arrays;

public class ArrayRightRotation {

    public static void main(String[] args) {

        //{a={5,10,15}-->0,1,2 should be changed to 2,0,1
        //a={15,5,10}
        // take two points left and right
        // Left =0 --left=
        // Right=2--->
        //
        // Right rotation  last place should be empty
        // for that store that in temp variable
        // int temp=a.length-1
        // a[2]=a[1]
        // a[1]=a[0]
        // las
        // a[0]=temp}

        int[] a={1,2,3,4,5};

            int temp= a[a.length-1];
        System.out.println(temp);

        int i=a.length-1;

        while (i>0)
        {
            a[i]=a[i-1];
            i-=1;
        }
        a[0]=temp;

        System.out.println(Arrays.toString(a));
    }
}
