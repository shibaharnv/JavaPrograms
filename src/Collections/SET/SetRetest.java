package Collections.SET;

import java.util.*;

public class SetRetest {

    public static void main(String[] args) {

        //compare two sets

      // Set obj = new HashSet();

       SortedSet<Integer> obj = new TreeSet<Integer>();

        obj.add(11);
        obj.add(5);
        obj.add(3);
        obj.add(4);
        obj.add(8);
        obj.add(6);


        SortedSet<Integer> obj2 = new TreeSet<Integer>();

        obj2.addAll(obj);



        SortedSet<Integer> obj3 = new TreeSet<Integer>();

        obj.add(3);
        obj.add(4);

        System.out.println(obj.contains(11));
        System.out.println(obj.equals(obj2));

        System.out.println(obj.retainAll(obj3));

        System.out.println("obj2"+obj2);
        for (Object c:obj)
        {
            int d= (int) c;

            System.out.println(d);

        }
        System.out.println(obj);
        Iterator<Integer> itr=obj3.iterator();

        while (itr.hasNext())
        {
            System.out.println("inside");
           Integer element= itr.next();
            System.out.println(element);

        }


        Set<String> set = new HashSet<>();
        set.add("shiba");
        set.add("Thanu");
        set.add("Ini");
//
//        for(Object s:set)
//        {
//
//            String val=s.toString();
//            System.out.println(val);
//        }

       Iterator<String> itr2= set.iterator();
       while (itr2.hasNext())

       {

          String value= itr2.next();
           System.out.println(value);

       }

       int[] a={1,2,3,4,5};

       Integer[] integerarray= new Integer[a.length];

       Arrays.setAll(integerarray,i->a[i]);


       ArrayList<Integer>   al1= new ArrayList<>(Arrays.asList(integerarray));

        System.out.println(al1);

        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(3);
        al2.add(4);
        al2.add(5);

//        System.out.println(al1.retainAll(al2));
//        System.out.println("common"+al1);
        System.out.println(al1.removeAll(al2));
        System.out.println("test"+al1);


//        HashSet<Integer> h1= new HashSet<Integer>(al1);
//        HashSet<Integer> h2= new HashSet<Integer>(al2);
//
//        h1.retainAll(h2);
//
//        ArrayList<Integer> al3= new ArrayList<>(h1);
//        System.out.println("common" +al3);
        int[] b={13,2564,3,42,35};

        Integer[] integerArray=new Integer[b.length];

        Arrays.setAll(integerArray,i->b[i]);

        TreeSet<Integer>  ts= new TreeSet<>(Arrays.asList(integerArray));

        System.out.println(ts);
        //ts.pollFirst();
        Integer values=ts.pollFirst();

        System.out.println("vals"+values);
        System.out.println(ts);
        ArrayList al= new ArrayList(ts);

        System.out.println(al.get(0));


        Set s1= new HashSet();


        s1.add(1);
        s1.add(2);
        s1.add(3);

        Set s2= new HashSet();


        s2.add(3);

        System.out.println(s1.removeAll(s2));
        System.out.println(s1);


    }
}
