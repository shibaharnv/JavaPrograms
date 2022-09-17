package javainterviewprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringArrayDuplicatewords {

    public static void main(String[] args)
    {
        String[]  stringArray={"this","the","the","is","is"};

        HashSet setobj = new LinkedHashSet();
        String result ="";
        ArrayList al= new ArrayList();
        for(String s:stringArray)
        {
            if(!setobj.add(s))
            {
                result=s;
                al.add(result);
            }
        }

        System.out.println("Duplicate word " +result);
        System.out.println("Duplicate words "+al);
    }
}
