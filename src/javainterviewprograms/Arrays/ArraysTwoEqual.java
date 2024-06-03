package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysTwoEqual {

    public static void main(String[] args)
    {
        int[] a1= {1,2,4};
        int[] a2= {1,2,3};

        Arrays.equals(a1,a2);

        Integer[] integerArray1= new Integer[a1.length];
        Integer[] integerArray2= new Integer[a2.length];

        Arrays.setAll(integerArray1,i->a1[i]);
        Arrays.setAll(integerArray2,i->a2[i]);

        ArrayList aobj1 = new ArrayList(Arrays.asList(integerArray1));
        ArrayList aobj2 = new ArrayList(Arrays.asList(integerArray2));

        if(aobj1.equals(aobj2))
        {
            System.out.println("Both the arrays are equal");
        }

        else
        {
            System.out.println("Both the arrays are not equal");
        }

        Iterator it1 =aobj1.iterator();
        Iterator it2 =aobj2.iterator();

        while (it1.hasNext() && it2.hasNext())
        {
           int value1= (int) it1.next();
           int value2= (int) it2.next();

           if(value1!=value2)
           {
               System.out.println("Mismatching value is first array value "+value1+"second array value "+value2);
           }
        }

    }
}
