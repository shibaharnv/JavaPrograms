package JavaStudy.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {

        Map<Character,Integer>  hm= new HashMap<>();

        hm.put('{',1);
        hm.put('[',2);

        HashMap<String,String>  hs= new HashMap<>();

        hs.put("1","shibahar");
        hs.put("2","Mano");

        System.out.println(hs);

//        hs.put(null,"Iniyan");
//        hs.put(null,"fsdfds");
       // System.out.println(hm.containsKey('('));
       // System.out.println(hm.containsValue(1));

       // System.out.println(hm.keySet());
        hm.keySet();
      //  System.out.println("duplicate"+hs.keySet());

        Set setKeys=hs.keySet();

        for(Object s: setKeys)
        {
           // s=s.toString();

            System.out.println(s);
            System.out.println(hs.get(s));
        }

        System.out.println(hs.values());

    //    System.out.println(hs.entrySet());
        System.out.println(hs.remove(1));

        System.out.println(hs.entrySet());

      //  Set myentrySet=hs.entrySet();

//       Iterator itr= myentrySet.iterator();
//
//       while (itr.hasNext())
//       {
//           myentrySet.
//       }

        for(Map.Entry ev:hs.entrySet())
        {

            System.out.println(ev.getKey()+"        "+ev.getValue());
            //System.out.println(ev.getValue());

        }

       Set myntrySert= hs.entrySet();

       Iterator itr= myntrySert.iterator();

       while (itr.hasNext())
       {
          Map.Entry entry= (Map.Entry) itr.next();

       }

    }







}
