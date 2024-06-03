package javainterviewprograms.Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class ArrayDuplicatesHowmanytimes {

    public static void main(String[] args)
    {
        int[] a ={1,2,2,3,3,5};

        //{1.input int array
        // 2.Convert that into integer array
        // 3. Declare a list
        // 4 declare a set}

        Integer[] integerArray = new Integer[a.length];

        Arrays.setAll(integerArray,i->a[i]);

        ArrayList al = new ArrayList(Arrays.asList(integerArray));

        ArrayList newal = new ArrayList();

        TreeSet ts = new TreeSet();

        int duplicateNumber=0;

        for(Object s :al)
        {
            boolean result = ts.add(s);
            if(!result)
            {
                duplicateNumber=(int) s;
                newal.add(duplicateNumber);
            }
        }

        for(int i=0;i<newal.size();i++)
        {
            int value =(int) newal.get(i);
        }

        System.out.println(newal);
    }
}
