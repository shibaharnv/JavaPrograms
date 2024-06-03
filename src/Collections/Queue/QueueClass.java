package Collections.Queue;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class QueueClass {


    public static void main(String[] args)
    {
        Queue qobj = new PriorityQueue();
        qobj.add(1);
        qobj.add(4);
        qobj.add(3);
        qobj.add(2) ;
        System.out.println("fifo" +qobj);

        System.out.println(qobj.poll());
        System.out.println(qobj.poll());
        System.out.println("fifo" +qobj);
        System.out.println(qobj.peek());

        Queue qObjColor = new PriorityQueue();

        qObjColor.add("red");
        qObjColor.add("blue");
        qObjColor.add("green");

        System.out.println(qObjColor);

        for (Object s: qObjColor)
        {
            System.out.println(s);
        }

        Iterator it =qObjColor.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        Queue qObjColor2 = new PriorityQueue();
        qObjColor2.add("test");
        qObjColor2.add("zebra");

        qObjColor2.addAll(qObjColor);

        System.out.println("2nd "+qObjColor2);

        Queue ssObj = new PriorityQueue();

        ssObj.add(32);
        ssObj.add(3);
        ssObj.add(12);
        System.out.println("ssObj"+ssObj);

        Queue ssObj2 = new PriorityQueue();

        ssObj2.add(444);
        ssObj2.add(3);
        ssObj2.add(12);
        System.out.println("ssObj2"+ssObj2);


        for(Object s : ssObj)
        {
            System.out.println(ssObj2.contains(s)? "yes" :"no");
        }

        System.out.println("first element "+ssObj2.peek());

        System.out.println("Retrieve and remove "+ssObj2.poll());
        System.out.println("ssObj2"+ssObj2);

        ssObj.offer(100);
        System.out.println("ssObj2 offer"+ssObj);



        //count

        System.out.println("count "+ssObj.size());

        ssObj.removeAll(ssObj);

        System.out.println("after removing "+ssObj);

        // Priority queue to array

        PriorityQueue testing = new PriorityQueue();

        testing.add(11);
        testing.add(22);
        testing.add(33);




        Object[] a = new Object[testing.size()];
        a=testing.toArray();
        int i=0;
        for(Object s : a)
        {
            int value =(int) s;
            a[i]=value;
            i++;
        }
        System.out.println(a[2]);
        System.out.println("Array "+Arrays.toString(a));


        PriorityQueue StringObj = new PriorityQueue();

        StringObj.add(11);
        StringObj.add(22);
        StringObj.add(33);

        String testingString =StringObj.toString();
        System.out.println("Testing string "+testingString);

        ArrayDeque arObj = new ArrayDeque();

        arObj.addFirst(22);
        arObj.addLast(32);
        System.out.println(arObj);


    }
}
