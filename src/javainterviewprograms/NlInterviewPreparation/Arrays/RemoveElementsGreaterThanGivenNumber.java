package javainterviewprograms.NlInterviewPreparation.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveElementsGreaterThanGivenNumber {

    public static void main(String[] args) {
        //{Input is array and output is array
        // one more input is givennumber
        // example -array={1,4,3} if 2 is the given number then remove 4 and 3 and the
        // output is array{1}
        // Convert array to arraylist
        // Iterate the array list if}

        int[] a= {1,4,3,543,75,8};
        int givenNumber = 9;

        Integer[] integerArray = new Integer[a.length];
        Arrays.setAll(integerArray,i->a[i]);

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integerArray));

        Iterator itr=al.iterator();
        while (itr.hasNext())
        {

            int num=(int)itr.next();
            if(num>givenNumber)
            {
                itr.remove();
            }

        }

        System.out.println(al);




      //  System.out.println(Arrays.toString(itr));
//
//        ArrayList<Integer> newArraylst = new ArrayList<>(Arrays.asList(integerArray));
//        System.out.println(al.size());
//        System.out.println(al);
//
//        for(int i=0;i<newArraylst.size();i++)
//        {
//            if(newArraylst.get(i)>givenNumber)
//            {
//                al.remove(i);
//            }
//        }
//
//        System.out.println(al);
    }
}
