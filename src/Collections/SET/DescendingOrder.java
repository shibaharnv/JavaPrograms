package Collections.SET;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DescendingOrder {

    public static void main(String[] args) {

        TreeSet setObj = new TreeSet();

        setObj.add(1);
        setObj.add(2);
        setObj.add(3);

        Iterator itr=setObj.descendingIterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
