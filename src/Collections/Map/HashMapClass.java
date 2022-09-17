package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

    //{Hashmap methods :
    // put,putAll,get,remove(Key),containskey,containsvalue,size,clear,isEmpty}

    public static void main(String[] args)
    {
        HashMap m = new HashMap();

        m.put(1,"test1");
        m.put(2,"test2");
        m.put(3,"test3");

        Set so= m.entrySet();
        Iterator its=so.iterator();

        while (its.hasNext())
        {
           // System.out.println("testing "+its.next());

          Map.Entry mo= (Map.Entry) its.next();

            System.out.println("mo key "+mo.getKey());
            System.out.println("mo value "+mo.getValue());
        }


        HashMap m2 = new HashMap();
        m2.put(4,"hi");
        m2.putAll(m);
        System.out.println("Get value using key"+m.get(2));
        System.out.println(m2);

        m2.remove(4);
        System.out.println(m2);

        m.containsKey(2);
        System.out.println(m.containsKey(2));
        System.out.println(m.containsValue("hi"));

        System.out.println("key set"+m.keySet());

        System.out.println("all values "+m.values());

        System.out.println("Entry set "+m.entrySet());

        System.out.println(m.size());
       // m.clear();
        System.out.println(m);
        System.out.println("is empty"+m.isEmpty());

        for(Object s :m.keySet())
        {
            System.out.println("key value "+s);
        }

        for(Object st :m.values())
        {
            System.out.println("value "+st);
        }

        for(Object a :m.entrySet())
        {
            System.out.println("entry set value "+a);
        }
        // Retrieve key and value using for each loop
        for(Object s :m.keySet())
        {
            System.out.println("testing "+s+" "+m.get(s));
        }


        HashMap<Integer,String> hobj = new HashMap<Integer,String>();
        hobj.put(1,"shibahar");
        hobj.put(2,"Thanu");
        hobj.put(3,"Iniyan");


        Set testset =hobj.entrySet();

        Iterator itrk=testset.iterator();

        while (itrk.hasNext())
        {
            Map.Entry valu= (Map.Entry) itrk.next();
        }

        System.out.println(hobj.entrySet());

        for(Map.Entry oneEntry:hobj.entrySet())
        {
            System.out.println("Entry single value "+oneEntry);
        }

              Set mySet= hobj.entrySet();

                Iterator itr=mySet.iterator();

                while (itr.hasNext())
                {
                    Map.Entry entr =(Map.Entry) itr.next();

                    System.out.println("key "+entr.getKey() +" value "+entr.getValue());
                }

    }
}
