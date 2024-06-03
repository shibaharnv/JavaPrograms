package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNegativeNumbersRetestwithList {

    public static void main(String[] args) {
        int[] a={-1,2,3,-5,7,-7};

        removeNegativeNumbers(a);
    }

    private static void removeNegativeNumbers(int[] a) {

        Integer[]   integerArray= new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList fullAl= new ArrayList<>(Arrays.asList(integerArray));
        ArrayList positiveAl= new ArrayList<>();

        for(Object k:fullAl)
        {
            int d =(int) k;

            if(d>0)
            {
                positiveAl.add(d);
            }
        }

        System.out.println(positiveAl);

        fullAl.removeAll(positiveAl);





    }
}
