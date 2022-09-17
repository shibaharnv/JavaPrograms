package Collections.List;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListDifference {

    public static void main(String[] args) {

        ArrayList aobj1= new ArrayList<>();
        ArrayList aobj2= new ArrayList<>();




        aobj1.add(1);
        aobj1.add(2);
        aobj1.add(3);

        aobj2.add(1);
        aobj2.add(2);
        aobj2.add(4);


        ArrayList unionObj= new ArrayList<>(aobj1);

        unionObj.addAll(aobj2);

        System.out.println("unionObj "+unionObj);


        ArrayList retainObj= new ArrayList<>(aobj1);

        retainObj.retainAll(aobj2);

        System.out.println("retainObj "+retainObj);



        TreeSet tObj = new TreeSet(unionObj);
        System.out.println("tObj "+tObj);


        ArrayList finalobj= new ArrayList<>(aobj1);

        finalobj.removeAll(aobj2);

        System.out.println(finalobj);







    }
}
