package Collections.SET;

import java.util.*;

public class SetPrograms {

    //{Simple programs
    // 1.Add ,remove ,replace elements in set
    // 2.Addll,retainall,removeall ,containsall methods
    // 3.TO check if a element is present inside the set use contains
    // 4. Set dont have replace instead we can remove and add a new item
    // 5. Sort an array using set}

    public static void main(String[] args)
    {

        //1.Add ,remove elements in set

        Set objs =new HashSet();

        objs.add("test");
        objs.add("test2");
        objs.remove("test");
        System.out.println(objs);

        // 2.Addll,retainall,removeall methods

        Set qb1= new HashSet();
        Set qb2 = new LinkedHashSet();

        qb1.add(21);
        qb1.add(32);
        qb2.add(43);
        qb2.add(65);
        qb1.addAll(qb2);
        System.out.println(qb1);

        // Retain all.

        Set ra1= new HashSet();
        Set ra2= new HashSet();
        ra1.add(10);
        ra1.add(20);
        ra2.add(30);
        ra2.add(10);

        ra1.retainAll(ra2);
        System.out.println("ra1"+ra1);


        // remove all

        Set rem1= new HashSet();
        Set rem2= new HashSet();
        rem1.add(10);
        rem1.add(100);
        rem1.add(104);
        rem2.add(105);
        rem2.add(10);

        rem1.removeAll(rem2);
        System.out.println("remove all "+rem1);

        // Contains all

        Set ca1= new HashSet();
        Set ca2= new HashSet();

        ca1.add(34);
        ca1.add(44);
        ca2.add(34);
        ca2.add(345);


        System.out.println("contains all result "+ca1.containsAll(ca2));

        //Contains method

        System.out.println(ca1.contains(34));

        //Iterator

        Iterator iobj=ca1.iterator();

        while (iobj.hasNext())
        {
            System.out.println(iobj.next());

            iobj.remove();
        }
        System.out.println("after removing"+ca1);


        // Sorting an array using set
        int a[] ={14,534,123,334,23,54,87,43};

        //{1.Convert array to set or inser array into set
        // 2.Set will remove the dupicates by default
        // 3.Sorted set interface will sort the set}

        //converting int array to integer array

        Integer[] integerarray = new Integer[a.length];

        Arrays.setAll(integerarray,i->a[i]);

        SortedSet sorobj = new TreeSet(Arrays.asList(integerarray));

        System.out.println("sorobj"+sorobj);

        //finding the smallest number :

        System.out.println("smallest number"+sorobj.first());

        //finding the largest number

        System.out.println("smallest number"+sorobj.last());


        // FIND OUT the numbers less than 100 in an array using SET

        int[] intarray = {21,324,34,65,756,100};

        Integer[] interarray = new Integer[intarray.length];

        Arrays.setAll(interarray,i->intarray[i]);

        SortedSet ssobj = new TreeSet(Arrays.asList(interarray));



        System.out.println("ssobj "+ssobj);

        System.out.println("numbers less than 100" +ssobj.headSet(100));


        // FIND OUT the numbers greater than 100 in an array using SET

        System.out.println("numbers greater than 100");

        SortedSet suumma=ssobj.tailSet(100);
        System.out.println("suumma"+suumma);

        if(suumma.contains(100))
        {
            suumma.remove(100);
        }
        System.out.println("numbers greater than 100"+suumma);


        // find out the numbers ranging from 50 to 100 in an array

        int[] aarray ={21,356,78,90,43,222};

        //{1.Convert int array to integer array using Arrays
        // 2.Add integer array to Set using Arrays
        // 3. Use Sorted set so that we get the numbers in sorted order
        // 4. Using Iterator iterate the elements and check if it is greater than 50 and less than 100 and put it in another set}


        Integer[] intarrayer = new Integer[aarray.length];

        Arrays.setAll(intarrayer,i->aarray[i]);

        SortedSet sobj = new TreeSet(Arrays.asList(intarrayer));

        System.out.println("Sorted numbers are "+sobj);

        Iterator i2obj = sobj.iterator();

        ArrayList<Integer> alistobj = new ArrayList<Integer>();
        int count=0;

        while (i2obj.hasNext())
        {
            Object value=i2obj.next();
            System.out.println("value"+value);
            int i= (int) value;
            if(i>50&&i<100)
            {
                alistobj.add(i);
            }
            count++;



        }

        System.out.println("Numbers ranging from 50 to 100"+alistobj);

            //Adding multiple nulls to set

        Set setobj = new HashSet();
        setobj.add(null);
        setobj.add(null);
        System.out.println("setobj "+setobj);


        // Find the second largest element in an array

        int[] numarray={40,20,30,10};

        Integer[] INTnumarray= new Integer[numarray.length];

        Arrays.setAll(INTnumarray,i->numarray[i]);

        NavigableSet nnobj = new TreeSet(Arrays.asList(INTnumarray));

        System.out.println("nnobj "+nnobj);

        // we need to find the element next to first element.poll first we will get the first element
        nnobj.pollLast();

       Object answer= nnobj.pollLast();

        System.out.println("Second largest number in array is "+answer);

//        NavigableSet newobj = new TreeSet();
//        newobj.add(null);

//        SortedSet newobj2 = new TreeSet();
//        newobj2.add(null);

        Set newobj3 = new HashSet();
        newobj3.add(null);
        newobj3.add(null);
        System.out.println(newobj3);
    }


}
