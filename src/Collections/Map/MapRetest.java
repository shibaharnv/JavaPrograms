package Collections.Map;

import javaallpgmspackage.HashTable;

import java.util.*;

public class MapRetest {

    public static void main(String[] args) {


        HashMap hmObj= new HashMap<>();

        hmObj.put("1","hi");
        hmObj.put("2","hello");
        hmObj.put("3","bye");

        Set setObj =hmObj.keySet();

        System.out.println("setObj "+setObj);

        Collection collectionObje=hmObj.values();

        System.out.println("collectionObje "+collectionObje);




        Set<Map.Entry> entrySetmap =hmObj.entrySet();

        Iterator<Map.Entry> entryitr =entrySetmap.iterator();

        while (entryitr.hasNext())
        {
            Map.Entry singleEntry =(Map.Entry)entryitr.next();

            System.out.println(singleEntry.getKey());
            System.out.println(singleEntry.getValue());
        }

    }
}
