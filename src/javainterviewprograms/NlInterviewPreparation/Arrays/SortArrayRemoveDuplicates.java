package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.*;

public class SortArrayRemoveDuplicates {

    public static void main(String[] args) {

        //{}

        int[] a={2,4,1,5,9,2,4,5};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();
        List al = new ArrayList();

        for(int i:a)
        {
            set.add(i);
        }

        for(int i:a)
        {
            if(!duplicateSet.add(i))
            {
             al.add(i)  ;
            }
        }


        System.out.println(set);
        System.out.println(al);



    }
}
