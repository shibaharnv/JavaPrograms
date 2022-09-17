package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSetConnection {

    public static void main(String[] args) {


        List listobj= new ArrayList();

        listobj.add(0,10);
        listobj.add(1,20);
        listobj.add(2,30);


        Set setObj = new TreeSet();

        setObj.add(40);
        setObj.add(50);
        setObj.add(60);

        List newListObj= new ArrayList(setObj);

        System.out.println("newListObj "+newListObj);

        Set newSetObj= new TreeSet(listobj);

        System.out.println("newSetObj "+newSetObj);


    }
}
