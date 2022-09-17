package DataStructureInterview;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayIntersection {

    public static void main(String[] args)
    {
        String[] inputarray1 = {"hi","hello","bye"};

        String[] inputarray2 = {"hi","hello","test","bye"};

        HashSet<String> obj1= new HashSet<String>(Arrays.asList(inputarray1));
        HashSet<String> obj2= new HashSet<String>(Arrays.asList(inputarray2));

        System.out.println("Retain all "+obj1.retainAll(obj2));

        System.out.println("After retain all "+obj1);

        for (String s:obj1) {
            System.out.println("first array "+s);
        }

        for (String t:obj2) {
            System.out.println("Second array "+t);
        }
    }
}
