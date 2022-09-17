package Collections.Map;

import java.util.*;

public class MapPrograms {

    public static void main(String[] args)
    {
        //{Write a Java program to associate the specified value with the specified key in a HashMap.}

        HashMap<Integer,String>  hoobj= new HashMap<Integer,String> ();
        hoobj.put(1,"shibahar");
        hoobj.put(2,"Mano");
        hoobj.put(3,"Iniyan");

        for(Map.Entry entry:hoobj.entrySet())
        {
            System.out.println("Key "+entry.getKey()+ "Value "+entry.getValue());
        }

        int count=hoobj.size();
        System.out.println(count);


        HashMap<Integer,String>  hoobj2= new HashMap<Integer,String> ();
        hoobj2.putAll(hoobj);
        System.out.println(hoobj2);
        HashMap<Integer,String>  hoobj3= new HashMap<Integer,String> ();
        hoobj3 =(HashMap<Integer, String>) hoobj.clone();
        System.out.println(hoobj3);

//        for(Map.Entry entry3 :hoobj3.entrySet())
//        {
//
//          Object get_Key = entry3.getKey();
//            hoobj3.remove(get_Key);
//        }

//        Set seobj= hoobj3.entrySet();
//
//        Iterator itsk=seobj.iterator();
//
//        while (itsk.hasNext())
//        {
//            Map.Entry entrsss =(Map.Entry)itsk.next();
//            Object key1=entrsss.getKey();
//            hoobj3.remove(key1);
//        }



        System.out.println("After removing keys "+hoobj3);

        HashMap<Integer,String>  yoobj= new HashMap<Integer,String> ();
        hoobj.put(1,"shibahar");
        hoobj.put(2,"Mano");
        hoobj.put(3,"Iniyan");

        Set<Integer> setObj = new HashSet<>();
        setObj.add(1);
        setObj.add(2);
        setObj.add(3);

        yoobj.keySet().removeAll(setObj);

        System.out.println(yoobj);

        HashMap<Integer,String>  toobj= new HashMap<Integer,String> ();
        toobj.put(1,"shibahar");
        toobj.put(2,"Mano");
        toobj.put(3,"Iniyan");

        boolean result =toobj.containsKey(5);
        if(result)
        {
            System.out.println("Key and value is present");
        }

        else {
            System.out.println("Key and value not present");
        }

        boolean result2 =toobj.containsValue("Mano");

        if(result2)
        {
            System.out.println("Key and value is present");
        }

        else {
            System.out.println("Key and value not present");
        }


        // Compare two hashmaps

        HashMap m1= new HashMap();
        m1.put("name","mano");
        m1.put("height","152");

        HashMap m2= new HashMap();
        m2.put("name","mano");
        m2.put("height","153");

           Set sm1= m1.entrySet();
           Set sm2= m2.entrySet();
          Iterator it1= sm1.iterator();
        Iterator it2= sm2.iterator();

        while (it1.hasNext() && it2.hasNext())
        {
            Map.Entry me1= (Map.Entry)it1.next();
            Map.Entry me2= (Map.Entry)it2.next();

            if(!me1.getValue().equals(me2.getValue()))
            {
                System.out.println("mismatching key"+me2.getKey());
                System.out.println("mismatching value"+me2.getValue());

            }
        }

                char valu= 'c';

                int intValue= (int) valu;

                String val= "test";
                int res=Integer.parseInt(val);


    }
}
