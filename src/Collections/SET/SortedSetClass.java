package Collections.SET;

import java.util.*;

public class SortedSetClass {

    //{For set interface we can create object using hashset and linkedhasset classes
    // but for sorted set it is a seperate interface only tree set implements sortedset.
    // Always sort the elements inside for numbers small to highest ,for characters and strings a to z
    // Since it is a set doesn't allow duplicates
    // first method returns the first element from the sorted set it will be useful to find the smallest number
    // Last method returns the last element from the sorted set ---largerst number
    // Head set : It will return the elements that are less than the object mentioned inside the headset
    // Tailset :It will return the elements that are greater than or equal to the object mentioned inside the headset.
    // Subset subset(largervalue,small value) :Less tha or equal to first element and greater than second element}


    public static void main(String[] args)
    {

        SortedSet ssobj = new TreeSet();

        SortedSet sscharobj = new TreeSet();

        SortedSet sstringobj = new TreeSet();

        ssobj.add(432);
        ssobj.add(42345);
        ssobj.add(54);
        ssobj.add(88);
        ssobj.add(100);
        ssobj.add(200);



        sscharobj.add('z');
        sscharobj.add('t');
        sscharobj.add('a');
        sscharobj.add('h');
        sscharobj.add('b');

        sstringobj.add("zello");
        sstringobj.add("bye");
        sstringobj.add("new");

        System.out.println(ssobj);
        System.out.println(sscharobj);
        System.out.println(sstringobj);



        // int array to integer array and sorting.

        int[] intarray ={4,6,7,3,1,9};
        Integer[] integerarray = new Integer[intarray.length];
        Arrays.setAll(integerarray,i->intarray[i]);

        SortedSet arraysetobj = new TreeSet(Arrays.asList(integerarray));

        System.out.println("arraysetobj "+arraysetobj);


        // first last

        System.out.println("First result "+ssobj.first());
        System.out.println("Last result "+ssobj.last());

        //Head set tail set
        //Head set is values less than given value
        System.out.println("headset "+ssobj.headSet(100));

        //Tail set is given value + values greater than that
        System.out.println("tailset "+ssobj.tailSet(100));

        //Subset:

        System.out.println("subset "+ssobj.subSet(100,42345));

        //compartor

        System.out.println("compare "+ssobj.comparator());



    }
}
