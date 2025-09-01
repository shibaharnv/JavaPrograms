package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.Arrays;

public class Arraysort {

    public static void main(String[] args) {





        //{two pointers- Left and right
        // a[0]=a[1] if a[0]>a[1] then swap temp =a[0] a[0]=a[1] a[1]=temp
        // a[1]=a[2]
        // take the firsindex and compare with next indexvalue if
        // firstindex is greater then swap also increase index
        // if firstindex is smaller move the index}
        int[] a={2,5,1};
        int temp=0;
        int firstIndex=0;
        int firstValue=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i-1]>a[i])
            {
                temp=a[i-1];
                a[i-1]=a[i];
                a[i]=temp;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
