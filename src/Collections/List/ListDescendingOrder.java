package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ListDescendingOrder {

    public static void main(String[] args) {

        ArrayList aobj= new ArrayList();

        aobj.add(1);
        aobj.add(2);
        aobj.add(3);

        Collections.reverse(aobj);

        System.out.println("First reversal "+aobj);

        TreeSet set = new TreeSet(aobj);

        System.out.println(set);

        Iterator itr =set.descendingIterator();
        aobj.clear();
        while (itr.hasNext())

        {
            aobj.add(itr.next());

        }

        System.out.println(aobj);
    }
}
