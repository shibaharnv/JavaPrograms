package Collections.SET;

import java.util.*;

public class SetWithoutBuiltInMethods {

    public static void main(String[] args) {

        //Write a Java program to perform the union of two sets without using the built-in addAll method.

        Set<Integer> sobj = new HashSet<>();

        sobj.add(1);
        sobj.add(2);

        Set<Integer> sobj2 = new HashSet<>();

        sobj2.add(3);
        sobj2.add(4);

//        for(Integer obj:sobj2)
//        {
//            sobj.add(obj);
//        }
//
//        System.out.println(sobj);

      //  Using Iterator

        Iterator<Integer> itrObject=sobj.iterator();

        while (itrObject.hasNext())
        {
            sobj2.add(itrObject.next());
        }

        System.out.println(sobj2);


       //2 Implement a function that returns the intersection of two sets in Java without using the built-in retainAll method.

        Set<Integer> sobj3 = new HashSet<>();

        sobj3.add(1);
        sobj3.add(2);
        sobj3.add(4);

        Set<Integer> sobj4 = new HashSet<>();

        sobj4.add(2);
        sobj4.add(4);


//        System.out.println(sobj3.retainAll(sobj4));
//        System.out.println(sobj3);
//        System.out.println(sobj4);

        for(Object obj:sobj3)
        {

        if(sobj4.contains(obj))
        {
            System.out.println(obj);
        }

        }

        System.out.println(sobj3.removeAll(sobj4));
        System.out.println(sobj3);
        System.out.println(sobj4);

        //Question 3: Set Symmetric Difference
        //Create a Java program to find the symmetric difference between two sets without using the built-in removeAll method.


        Set<Integer> sobj5 = new HashSet<>();

        sobj5.add(1);
        sobj5.add(2);
        sobj5.add(4);

        Set<Integer> sobj6 = new HashSet<>();

        sobj6.add(2);
        sobj6.add(4);


//        sobj5.removeAll(sobj6);
//        System.out.println("After removeall" +sobj5);

//        for(Object c:sobj5)
//        {
//            if(sobj6.contains(c))
//            {
//                sobj5.remove(c);
//            }
//        }


       Iterator itr= sobj5.iterator();

       while (itr.hasNext())
       {
           if(sobj6.contains(itr.next()))
           {
               itr.remove();
           }
       }

        System.out.println("After removeall" +sobj5);


//        Question 4: Set Contains
//        Write a method that checks if one set is a subset of another set without using the built-in containsAll method.



        Set<Integer> seta = new HashSet<>();

        seta.add(1);
        seta.add(2);
        seta.add(4);

        Set<Integer> setb = new HashSet<>();

        setb.add(2);
        setb.add(4);

       // System.out.println(seta.containsAll(setb));
        int count=0;

        for(Object e:setb)
        {
            if(!seta.contains(e))
            {
                count++;
            }


        }

        if(count>0)
        {
            System.out.println("setb is not a subset of seta");
        }
        else {
            System.out.println("setb is  a subset of seta");
        }

        Set<Integer> setc= new HashSet<>();
        setc.add(4);
        setc.add(1);
        setc.add(3);
        setc.add(5);
        System.out.println("setc "+setc);

        ArrayList al = new ArrayList();

        al.addAll(setc);
        //Collections.sort(al);

        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);


//Question 5: Set Sorting
//Implement a program that sorts the elements of a HashSet in descending order without using the built-in TreeSet or Collections.sort method.




    }
}
