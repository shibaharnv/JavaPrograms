package javaallpgmspackage;

import java.util.HashSet;
import java.util.SortedSet;

public class DuplicateArray {

    public static void main(String[] args)
    {
        int[] a ={1,3,4,5,6,7,7,6};

        HashSet testobj = new HashSet();

        for(int s: a)
        {
            if(testobj.add(s)==false)
            {
                System.out.println("Duplicate number is "+s);
            }

        }
    }
}
