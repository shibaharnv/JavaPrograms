package DataStructureInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayCommonItemsUsingListRetest {

    public static void main(String[] args) {


        int[] a={1,2,3};
        int[] b={5,1,8};

        Integer[] integerArray1 = new Integer[a.length];
        Arrays.setAll(integerArray1,i->a[i]);
        Integer[] integerArray2 = new Integer[b.length];
        Arrays.setAll(integerArray2,i->b[i]);
        ArrayList al1= new ArrayList(Arrays.asList(integerArray1));
        ArrayList al2= new ArrayList(Arrays.asList(integerArray2));

        System.out.println(al1);
        System.out.println(al2);

        ArrayList finallist= new ArrayList(al1);
        finallist.retainAll(al2);
        System.out.println(finallist);




    }



}
