package Collections.SET;

import java.util.TreeSet;

public class TreeSetClass {

    //{Tree set : set elements will be sorted since it implements navigable set and sorted set and we can use those methods
    // Sub set first element greater than or equal to and less than last element}

    public static void main(String[] args)
    {
        TreeSet tobj = new TreeSet();

        tobj.add(970);

        tobj.add(1000);
        tobj.add(1270);
        tobj.add(630);
        tobj.add(370);


        System.out.println("tobj "+tobj);

        System.out.println(tobj.headSet(970));

        System.out.println(tobj.tailSet(970));

        System.out.println("subset "+tobj.subSet(630,1270));

        System.out.println("lower"+tobj.lower(630));
        System.out.println("higher"+tobj.higher(1000));


        System.out.println("celing"+tobj.ceiling(1000));


    }
}
