package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListRemoval {

    public static void main(String[] args) {
        List listObj = new ArrayList();

        listObj.add("12");
        listObj.add("22");
        listObj.add("33");
        System.out.println(listObj);
        listObj.remove("22");
        System.out.println(listObj);
    }
}
