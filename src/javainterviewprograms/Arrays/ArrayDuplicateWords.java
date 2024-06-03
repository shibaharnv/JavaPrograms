package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayDuplicateWords {

    public static void main(String[] args)
    {

        //Find duplicate words\Strings in Array
        String[] a={"test","test1","test2","test1","test"};

        ArrayList al = new ArrayList(Arrays.asList(a));
        ArrayList dupal = new ArrayList();
        HashSet hs = new HashSet();
        String duplicateValue = "";

        for(Object s:al)
        {
            if(!hs.add(s))
            {
                 duplicateValue = (String)s;
                 dupal.add(duplicateValue);
            }
        }

        System.out.println(dupal);
    }
}
