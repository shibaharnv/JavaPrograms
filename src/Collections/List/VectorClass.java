package Collections.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {

    public static void main(String[] args)
    {
        Vector vobj = new Vector();
        vobj.add("test");
        vobj.add("some");
        vobj.add("hi");

        System.out.println(vobj);

        vobj.add(0,"newtest");

        //Array list will not replace if we use add need to us eset
        System.out.println(vobj);

        System.out.println(vobj.get(2));

        vobj.remove(2);
        System.out.println("After removing 3rd element"+vobj);

        boolean result =vobj.contains("hi");

        System.out.println("result "+result);

        String[] word = new String[2];
        vobj.copyInto(word);


       for(Object o:word)
       {
           System.out.println(o);
       }

        ListIterator lit=  vobj.listIterator();


            while (lit.hasNext())
            {
               Object myObj= lit.next();
                System.out.println(myObj.toString());
                int value =lit.previousIndex();
                System.out.println("Index value"+value);
                lit.previous();
            }



    }
}
