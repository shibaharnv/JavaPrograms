package Collections.Map;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

    public static void main(String[] args)
    {
        TreeMap<Integer,String> tobj= new TreeMap<Integer,String>();

        tobj.put(1,"Shibahar");
        tobj.put(2,"Thanusha");
        tobj.put(3,"Iniyan");
        tobj.put(4,"Venba");
        TreeMap<Integer,String> tobj2= new TreeMap<Integer,String>();
        System.out.println(tobj.ceilingEntry(4));
        System.out.println(tobj.ceilingKey(2));
        System.out.println("first "+tobj.firstKey());
        System.out.println("last "+tobj.lastKey());
        System.out.println("poll"+tobj.pollLastEntry());
        System.out.println("poll null"+tobj2.pollLastEntry());
        System.out.println(tobj);

           Collection soj=tobj.headMap(3).values();

        System.out.println("soj "+soj);

    }
}
