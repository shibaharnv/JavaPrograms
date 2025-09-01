package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.Arrays;

public class ArraysEqual {

    public static void main(String[] args) {

        //{a1={1,2},a1={1,3} first sort the array
        // a1[0]=a2[0] if equal increase the pointer and move to next
        // a1[1]=a2[1]}

        int[] a1={2,3,1};
        int[] a2={1,2,3};

        System.out.println(arraysEqual(a1,a2));

    }

    private static boolean arraysEqual(int[] a1,int[] a2) {

        Arrays.sort(a1);
        Arrays.sort(a2);
            int count=0;
        if(a1.length==a2.length)
        {
            for(int i=0;i< a1.length;i++)
            {
                if(a1[i]!=a2[i])
                {
                    count++;
                }
            }
            if(count==0)
            {
                return true;
            }
        }


        return false;
    }
}

