package JavaStudy.Restudy;

import java.util.*;

public class MapBasics {

    public static void main(String[] args) {


        HashMap<Integer,String> hm = new HashMap();


        hm.put(1,"mano");
        hm.put(2,"shiba");
        hm.put(3,"amma");

        System.out.println(hm.get(2));

        System.out.println(hm.containsKey(1));
        System.out.println(hm.keySet());

        System.out.println(hm.values());

        Set sb=hm.keySet();

        Set entr=hm.entrySet();
        System.out.println(entr);

        Iterator itr=entr.iterator();

        while (itr.hasNext())
        {
            Map.Entry entrValue=(Map.Entry) itr.next();

            System.out.println(entrValue.getValue());
            System.out.println(entrValue.getKey());

        }


        TreeMap<Integer,String> tm= new TreeMap<>();

        tm.put(3,"TEst");
        tm.put(7,"TEst");
        tm.put(1,"TEst");
        tm.put(4,"TEst");

        System.out.println(tm.entrySet());

        Set tmSet=tm.entrySet();

        Iterator desItr=tm.descendingMap().entrySet().iterator();

        while (desItr.hasNext())
        {
           Map.Entry desMap= (Map.Entry) desItr.next();

            System.out.println(desMap.getKey());
            System.out.println(desMap.getValue());

        }
    }
}
