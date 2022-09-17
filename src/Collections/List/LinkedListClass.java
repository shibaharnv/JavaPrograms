package Collections.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args)
    {
        LinkedList lobj = new LinkedList();

        lobj.add(1);
        lobj.add(2);
        lobj.add(3);
        lobj.add(1,4);
        lobj.set(2,5);
        System.out.println(lobj);

        // Add all adds the element at the end

        LinkedList lobj2 = new LinkedList();
        lobj2.add(10);
        lobj2.add(20);
        lobj2.addAll(lobj);
        System.out.println("Second linked list"+lobj2);

       // add all with index

        LinkedList lobj3 = new LinkedList();
        lobj3.add(100);
        lobj3.addAll(0,lobj);

        System.out.println("Third linked list"+lobj3);

        // add first add last
        LinkedList firstLobj = new LinkedList();
        firstLobj.add("200");
        firstLobj.add("300");
        firstLobj.add("400");
        firstLobj.addFirst("500");

        System.out.println("Add first linked list"+firstLobj);

        firstLobj.addLast("600");
        System.out.println("add last "+firstLobj);

        //clear
        firstLobj.clear();
        System.out.println(firstLobj);

        //clone
        LinkedList cloneObj= new LinkedList();
        cloneObj=(LinkedList)lobj3.clone();
        System.out.println("Clone obj "+cloneObj);
        LinkedList cloneObj2= new LinkedList();


        // Descending iterator

        LinkedList desObj = new LinkedList();

        desObj.add(3);
        desObj.add(2);
        desObj.add(7);
        desObj.add(9);
        desObj.add(2);
        Iterator desIt=desObj.descendingIterator();

        while (desIt.hasNext())
        {

            System.out.println(desIt.next());
        }

        // Element- will return the first element


        System.out.println("Element "+desObj.element());

        //Get first and get last

        System.out.println("Get first "+desObj.getFirst());
        System.out.println("Get first "+desObj.getLast());

        //last Index of
        System.out.println(desObj.lastIndexOf(2));

        //offer method

        System.out.println("Offer "+desObj.offer(9));

        System.out.println("After offer "+desObj);

        // offer first

        System.out.println("offer first "+desObj.offerFirst(100));
        System.out.println("after offer first"+desObj);

        //offer last
        System.out.println("offer first "+desObj.offerLast(500));
        System.out.println("after offer first"+desObj);

        // Remove first occurance
        System.out.println(desObj);
        desObj.removeFirstOccurrence(2);
        System.out.println(desObj);

        // Remove last occurance

        System.out.println(desObj);
        desObj.removeLastOccurrence(9);
        System.out.println(desObj);

      Object[] myArray=  desObj.toArray();

      int[] resultArray = new int[myArray.length];
        int i=0;
      for(Object s: myArray)
      {
          int value= (int) s;
          resultArray[i]=value;
          System.out.println("value "+value);
          i++;
      }

        System.out.println(Arrays.toString(resultArray));





    }

}
