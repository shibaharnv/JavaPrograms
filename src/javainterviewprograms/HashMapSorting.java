package javainterviewprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {

    public static void main(String[] args)
    {
        HashMap hm = new HashMap();

        hm.put('a',3);
        hm.put('b',2);
        hm.put('c',10);
        hm.put('d',9);
        hm.put('e',5);
        hm.put('f',3);
        hm.put('g',8);
        System.out.println(hm);

        TreeMap tm= new TreeMap();
        tm.put(3,'a');
        tm.put(5,'b');
        tm.put(1,'c');
        tm.put(2,'d');

        System.out.println("tm "+tm);

        Set setobj =tm.descendingKeySet();

        System.out.println("Set obj " +setobj);
        int i=0;

         Iterator it= setobj.iterator();

         while (it.hasNext())
         {
            if(i==1)
            {
                System.out.println("second "+tm.get(it.next()));
                break;
            }
             System.out.println(tm.get(it.next()));
             i++;

         }


    }
}
