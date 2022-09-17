package Collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemovingAllKeysFromMap {

    public static void main(String[] args) {
        HashMap<Integer,String>  yoobj= new HashMap<Integer,String>();
        yoobj.put(1,"shibahar");
        yoobj.put(2,"Mano");
        yoobj.put(3,"Iniyan");

        Set<Integer> setObj = new HashSet<>();
        setObj.add(1);
        setObj.add(2);
        setObj.add(3);

        System.out.println(yoobj.keySet().removeAll(setObj));

        System.out.println(yoobj);
    }
}
