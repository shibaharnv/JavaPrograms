package Collections.Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableClass {
        //{hashtable no null,no order,no duplicates}
    public static void main(String[] args)
    {
        Hashtable<Integer,String>  htobj = new Hashtable<Integer,String> ();
        htobj.put(1,"abc");
        htobj.put(2,"fgh");
        htobj.put(3,"xyz");


        System.out.println(htobj);

        System.out.println("keys "+htobj.keys());
        System.out.println("\"keys set \""+htobj.keySet());

        System.out.println("values "+htobj.values());

        System.out.println("Get key "+htobj.get(2));

        Set mapobj=htobj.entrySet();

        Iterator its=mapobj.iterator();

        while (its.hasNext())
        {
           Map.Entry entry = (Map.Entry) its.next();
            System.out.println("entry set "+entry);
            System.out.println("key "+entry.getKey()+"value "+entry.getValue() );

        }



    }
}
