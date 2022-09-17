package Collections.SET;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDifference {

    public static void main(String[] args) {

        Set obj1 = new TreeSet();
        Set obj2 = new TreeSet();

        obj1.add(1);
        obj1.add(2);
        obj1.add(3);

        obj2.add(1);
        obj2.add(2);
        obj2.add(6);

        Iterator itr =obj2.iterator();

    while (itr.hasNext())

    {
            Object e=itr.next();
        System.out.println((int) e);
    }
        Set resultSet = new TreeSet(obj1);
        System.out.println(resultSet);
        resultSet.removeAll(obj2);
        System.out.println(resultSet);

        System.out.println(obj2.removeAll(obj1));



    }
}
