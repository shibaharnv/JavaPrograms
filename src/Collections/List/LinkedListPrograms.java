package Collections.List;

import java.util.*;

public class LinkedListPrograms {

    public static void main(String[] args)
    {
        //Write a Java program to append the specified element to the end of a linked list.

        LinkedList lobj = new LinkedList();

        lobj.add(10);
        lobj.add(20);
        lobj.add(30);

        lobj.add(100);

        lobj.offerLast(500);
        lobj.offer(400);
        lobj.addLast(1000);
        System.out.println(lobj);

        //Write a Java program to iterate through all elements in a linked list starting at the specified position.



        LinkedList ilobj = new LinkedList();

        ilobj.add(10);
        ilobj.add(20);
        ilobj.add(30);
        ilobj.add(120);
        ilobj.add(130);

        // old method
        for(int i=1;i<ilobj.size();i++)
        {
            System.out.println(ilobj.get(i));
        }

        //List iterator

        Iterator llit=ilobj.listIterator(2);

        while (llit.hasNext())
        {
            System.out.println("llit "+llit.next());
        }


        //Write a Java program to iterate a linked list in reverse order.

        LinkedList revList = new LinkedList();

        revList.add("ab");
        revList.add("fg");
        revList.add("zz");

        Iterator itobj=revList.descendingIterator();
        while (itobj.hasNext())
        {
            System.out.println("testing "+itobj.next());
        }

        Collections.reverse(revList);

        System.out.println("After reversing "+revList);

        revList.addFirst("First");
        revList.addLast("Last");

        System.out.println("Rev List "+revList);

        revList.offerFirst("offer first");
        revList.offerLast("offer last");

        System.out.println("Rev list offer"+revList);


        //Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList tetList = new LinkedList();
        tetList.add(33);
        tetList.add(44);
        tetList.add(55);
        tetList.add(33);
        LinkedList objList = new LinkedList();
        objList.add(100);
        objList.add(500);
        objList.addAll(1,tetList);

        System.out.println("obj list "+objList);


        //Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println("obj list "+tetList);
        System.out.println("get fisrt"+tetList.getFirst());
        System.out.println("get fisrt"+tetList.getLast());


        // Write a Java program to display the elements and their positions in a linked list.

        LinkedList loobj = new LinkedList();

        loobj.add(100);
        loobj.add(200);
        loobj.add(300);
        loobj.add(400);

        int i=0;

        for(Object s:loobj)
        {
            System.out.println("" +i+" . " +s+"");
            i++;
        }

        loobj.remove(2);
        System.out.println(loobj);

        loobj.removeFirst();
        loobj.removeLast();
        System.out.println(loobj);

        // Write a Java program of swap two elements in a linked list.

        LinkedList swObj = new LinkedList();

        swObj.add(100);
        swObj.add(200);
        swObj.add(300);
        swObj.add(400);

        swObj.set(1,400);
        swObj.set(3,200);

        System.out.println(swObj);

        Collections.swap(swObj,1,3);
        System.out.println(swObj);

        Collections.shuffle(swObj);
        System.out.println(swObj);

        // Write a Java program to join two linked lists.

        LinkedList jobj1= new LinkedList();
        jobj1.add(12);
        jobj1.add(4);
        jobj1.add(6);

        LinkedList jobj2= new LinkedList();
        jobj2.add(1);
        jobj2.add(3);
        jobj2.add(5);

        jobj2.addAll(jobj1);
        System.out.println("After joining"+jobj2);

        Collections.sort(jobj2);
        System.out.println("After sorting"+jobj2);

        TreeSet tobj = new TreeSet(jobj1);

        System.out.println("tobj "+tobj);

        LinkedList cloneObj= new LinkedList();

        cloneObj= (LinkedList) jobj2.clone();

        System.out.println("CloneObj "+cloneObj);

        //Write a Java program to remove and return the first element of a linked list.

        Object firstElement =jobj2.removeFirst();
        System.out.println("first element "+firstElement);
        System.out.println(jobj2.pop());

        // Write a Java program to retrieve but does not remove, the first element of a linked list.

        jobj2.getFirst();
        System.out.println(jobj1);
        System.out.println("get first"+jobj1.getFirst());
        System.out.println("Peek first"+jobj1.peekFirst());
        System.out.println("Peek last"+jobj1.peekLast());

        Boolean result =jobj1.contains(6);
        System.out.println("Contains result "+result);

        // Linked list to Array list

        LinkedList llpObj= new LinkedList();
        llpObj.add(10);
        llpObj.add(20);
        llpObj.add(30);

        ArrayList testObj = new ArrayList(llpObj);

        System.out.println("test obj" +testObj);

        // Compare two Linked lists
        LinkedList compOb1= new LinkedList();
        compOb1.add(10);
        compOb1.add(20);
        compOb1.add(30);

        LinkedList compOb2= new LinkedList();
        compOb2.add(100);
        compOb2.add(20);
        compOb2.add(300);

        for(Object s :compOb1)
        {
            System.out.println(compOb2.contains(s) ? "yes ":"no");
        }


    }
}
