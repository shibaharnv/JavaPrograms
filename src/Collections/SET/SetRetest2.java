package Collections.SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRetest2 {

    public static void main(String[] args) {


        Set myset = new HashSet();

        myset.add("abc");
        myset.add(1);
        myset.add('c');
        myset.add('e');


        System.out.println(myset);

        Set myset2 = new HashSet();

        myset2.add("xyz");
        myset2.add(2);
        myset2.add('d');
        myset2.add('e');

        System.out.println(myset2);

        myset2.retainAll(myset);
        System.out.println("retain all "+myset2);

        Set myset3 = new HashSet();

        myset3.add("ijk");
        myset3.add("ijk");
        System.out.println("myset3 before addall"+myset3);

        myset3.addAll(myset2);

        System.out.println(myset3);

        System.out.println(myset3.retainAll(myset2));


        Set myset4 = new HashSet();
        Set myset5 = new HashSet();

        myset4.add("a");
        myset4.add("b");

        myset5.add("b");
        myset5.add("c");

        System.out.println("contains all check "+myset4.containsAll(myset5));

        myset4.removeAll(myset5);
        System.out.println(myset4);
        System.out.println(myset5);

        System.out.println(myset4.size());
        System.out.println(!myset5.contains("b"));
        System.out.println(myset5.equals(myset4));

        int[] a=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        Integer[] aarray= new Integer[a.length];

        Arrays.setAll(aarray,i->a[i]);

        System.out.println("aarray "+Arrays.toString(aarray));



        Set myset6= new HashSet(Arrays.asList(aarray));

        System.out.println("myset6 "+myset6);

        Iterator<Integer> itr=myset6.iterator();

        while (itr.hasNext())
        {

            Integer value = itr.next();
            System.out.println(value);

            System.out.println(itr);
            System.out.println(itr.next());
        }
    }
}
