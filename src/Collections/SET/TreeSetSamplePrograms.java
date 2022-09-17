package Collections.SET;

import javax.sound.midi.Soundbank;
import java.util.*;

public class TreeSetSamplePrograms {

    public static void main(String[] args)
    {
        TreeSet tobj = new TreeSet();
        tobj.add("blue");
        tobj.add("red");
        tobj.add("black");

        System.out.println(tobj);
        Iterator it=tobj.iterator();

        while (it.hasNext())
        {
            Object myobj= it.next();
            System.out.println(myobj);
        }

        for(Object s: tobj)
        {
            String value= String.valueOf(s);
            System.out.println("value"+value);
        }

        // Adding to new tree set

        TreeSet newObj = new TreeSet();

        newObj.addAll(tobj);
        System.out.println("new obj "+newObj);

        // Print the element in reverse order for Treeset

        Iterator desObj =newObj.descendingIterator();
        while (desObj.hasNext())
        {
            System.out.println(desObj.next());
        }

            TreeSet trobj = new TreeSet();
            trobj.add("test1");
            trobj.add("test2");
            trobj.add("test3");
            trobj.add("test4");
            System.out.println("First "+trobj.first());
            System.out.println("Last "+trobj.last());


            // clone the tree set
            TreeSet cobj = new TreeSet();
            cobj=(TreeSet)trobj.clone();
            System.out.println("After Clone "+cobj);

            // Number of elements in Tree set

                System.out.println("Number of elements "+trobj.size());

            // Compare two Tree Sets

                System.out.println(trobj.equals(cobj));

            // Compare each element :

            for( Object x : trobj)
            {
                String value = String.valueOf(x);

                System.out.println(cobj.contains(value) ?"yes" : "no");

            }



        // Find out the numbers less than 7 - we can use floor celing methos

        TreeSet nobj = new TreeSet();
        nobj.add(10);
        nobj.add(4);
        nobj.add(8);
        nobj.add(3);
        nobj.add(7);

        SortedSet sampleObj = new TreeSet();

        System.out.println("Less than 7"+nobj.headSet(7));
        System.out.println("Greater than 7"+nobj.tailSet(7));
        System.out.println("Ful nobj"+nobj);
        nobj=(TreeSet) nobj.tailSet(7);
        nobj.remove(7);
        System.out.println("sampleobj "+nobj);

        // Find element which is greater than or equal to given element

        int givenNo= 11;
        TreeSet tree_num = new TreeSet();
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        // Find next greater number or equal to -One number

        Object value= tree_num.ceiling(givenNo);
        int intValue = (int) value;
        System.out.println(intValue);

        // Find number less than or equal to --One Number

        Object value2= tree_num.floor(givenNo);
        int intValue2 = (int) value2;
        System.out.println(intValue2);

        //get an element in a tree set which is strictly greater than the given element.

        Object value3= tree_num.higher(25);
        int intvalue3 = (int) value3;
        System.out.println(intvalue3);

        //get an element in a tree set which is strictly less than the given element.

        Object value4= tree_num.lower(25);
        int intvalue4 = (int) value4;
        System.out.println(intvalue4);

        // Retrive the first element
        System.out.println("tree num" +tree_num);
        Object firstElement= tree_num.first();
        //tree_num.remove(firstElement);
        System.out.println("tree num first remove" +tree_num.pollFirst());
        System.out.println("tree num last remove" +tree_num.pollLast());
        //Pol first removes first element and poll first
        System.out.println("tree num" +tree_num);
    }
}
