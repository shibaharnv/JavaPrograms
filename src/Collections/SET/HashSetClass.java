package Collections.SET;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

    //{Hashset removes duplicate but doesnot maintain order
    // WORD HASH means no Order
    // we should able to use set interface methods since hashset extends set interface}



    public static void main(String[] args)
    {
        HashSet hobj = new HashSet();

        HashSet<String> hsobj = new HashSet<String>();

        hobj.add(10);
        hobj.add(20);
        hobj.add(30);

        HashSet hobj2 = new HashSet();


        hobj2.add(30);
        hobj2.add(80);
        hobj2.add(90);

        System.out.println("diff "+hobj.removeAll(hobj2));


        System.out.println(hobj);

        hsobj.add("Shibahar");
        hsobj.add("Manoj");
        hsobj.add("xyz");

        System.out.println(hsobj);

        System.out.println("contains"+hobj.contains(30));
        System.out.println(hobj.remove(20));
        System.out.println("After removal "+hobj);

        Iterator it=hobj.iterator();

        while (it.hasNext())
        {
            Object itobj=it.next();
            int value= (int)itobj;
            System.out.println("value"+value);
            if(value==30)
            {
                System.out.println("30 is present");
            }
        }

    }
}
