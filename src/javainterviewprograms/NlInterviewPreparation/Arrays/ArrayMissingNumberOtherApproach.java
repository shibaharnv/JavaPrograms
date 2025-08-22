package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMissingNumberOtherApproach {

    public static void main(String[] args) {

        //{Input is array and output is array list
        // [1,2,4] take the first number and last number
        // iterate one by one so it will be in sequence
        // check if each number is present in array
        //}
            int[] a={5,2,4,6,9,12};
        Arrays.sort(a);

            int first=a[0];
            int last=a[a.length-1];

            int num=0;

        List<Integer> list = new ArrayList<>();

            for(int i=first;i<last;i++)
            {
                num=i;
                if(!contains(a,num))
                {
                 list.add(num);
                }
            }

        System.out.println(list);

    }

    public static boolean contains(int[] a, int num)
    {


        for(int i:a)
        {
            if(i==num)
            {
                return true;
            }
        }

        return false;

    }
}
