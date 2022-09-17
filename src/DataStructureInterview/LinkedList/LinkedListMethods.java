package DataStructureInterview.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

 public static void main(String[] args)
 {

     LinkedList<String> names= new LinkedList<String>();

     names.add("Shibahar");
     names.add("Thanusha");
     names.add("Iniyan");
     System.out.println(names);

    // System.out.println(names.get(1));
     System.out.println(names.size());
     //the below comment will not replace the exisiting string but shift
     names.add(2,"test");
     System.out.println(names);
   Iterator<String> itobj = names.iterator();

   while (itobj.hasNext())
   {
       System.out.println(itobj.next());
   }


   //Adding the linked list to another linked list

     LinkedList<String> users= new LinkedList<String>();

     users.add("peter");
     users.add("trump");

     names.addAll(users);

     System.out.println(names);

     names.addFirst("firstname");
     names.addLast("lastname");
     System.out.println(names);

     names.remove(0);
     System.out.println(names);
     names.removeAll(users);
     System.out.println(names);
     names.removeFirst();
     System.out.println(names);
     names.removeLast();
     System.out.println(names);
     names.clear();
     System.out.println(names);

     // Printing all the items in the Linked list in descending order

     LinkedList<String> number = new LinkedList<String >();
     number.add("df");
     number.add("av");
     number.add("bc");
     Iterator<String> it =number.descendingIterator();

     while (it.hasNext())
     {
         System.out.println(it.next());
     }


     for(String e : number)
     {
         System.out.println(e);
     }

     Collections.sort(number);
     System.out.println("************");
     System.out.println(number);
 }

}
