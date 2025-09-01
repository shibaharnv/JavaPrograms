package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.ArrayList;

public class ArrayMissingNumberRetest2 {


    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        int[] a={1,2,4};

        int first=a[0];
        int last=a[a.length-1];

        for(int i=first;i<last;i++)
        {
            //check if arraycontains this number
            if(!arrayContains(a,i))
            {
                al.add(i);
            }
        }

        System.out.println(al);

    }

    public static boolean arrayContains(int[] a,int num)
    {
            //i have an array i want to check if the number is present inside the array
     //{a=[1,2] num =3--in iterationtake first a[0] matches with 3 no then go for next iteration
        // if present then return true}

        for(int i :a)
        {
            if(i==num)
            {
                return true;
            }
        }

        return false;

    }

}
