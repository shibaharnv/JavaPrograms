package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCommonElementRest {

    public static void main(String[] args) {
        int[] a={1,2,3,4};

        int[] b= {1,2,3,5};

        int alength= a.length;

        int blengh=b.length;

        System.out.println(alength);




        Integer[] integerArray1= new Integer[a.length];
        Integer[] integerArray2= new Integer[b.length];
        Arrays.setAll(integerArray1, i->a[i]);
        Arrays.setAll(integerArray2,i->b[i]);

        ArrayList al1= new ArrayList(Arrays.asList(integerArray1));
        ArrayList al2= new ArrayList(Arrays.asList(integerArray2));

        ArrayList al3= new ArrayList(Arrays.asList(integerArray1));
        ArrayList finalList= new ArrayList();
//        System.out.println(al1.retainAll(al2));
//
//        System.out.println("common "+al1);

        //present in a but not in b

        al1.removeAll(al2);
        System.out.println(al1);
        finalList.add(al1);

        //present in b but not in a

        al2.removeAll(al3);
        System.out.println(al2);

        finalList.add(al2);

        System.out.println(finalList);

        List<List<Integer>> clubbedList = new ArrayList<>(finalList);
        System.out.println(clubbedList);

        List<Integer> singleList = new ArrayList<>();

        for(List<Integer> list:clubbedList)
        {
            for(Integer e:list)
            {
                singleList.add(e);
            }
        }

        System.out.println(singleList);
    }
}
