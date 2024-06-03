package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareIndexinArray {

    public static void main(String[] args) {


        int[] a={1,4,5,7};
        int[] b={6,4,3,7};
        Integer[] integerArray1 = new Integer[a.length];
        Arrays.setAll(integerArray1,i->a[i]);
        Integer[] integerArray2 = new Integer[b.length];
        Arrays.setAll(integerArray2,i->b[i]);
        ArrayList<Integer> al1 = new ArrayList(Arrays.asList(integerArray1));
        ArrayList<Integer> al2= new ArrayList(Arrays.asList(integerArray2));

        ArrayList<Integer> al3= new ArrayList();

        for(int i=0;i<al1.size();i++)
        {
            if(al1.get(i).equals(al2.get(i)))
            {
                al3.add(al1.get(i));
            }
        }

        System.out.println(al3);

        //int[] finalArray=al3.toArray(new int[al3.size()]);

      //  System.out.println(Arrays.toString(finalArray));
    }
}
