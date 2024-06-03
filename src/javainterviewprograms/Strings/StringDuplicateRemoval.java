package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class StringDuplicateRemoval {

    public static void main(String[] args)
    {
        //Duplicate removal
        //{no duplicates - means collections set we can use}

        String word ="java";


        char[] charArray= new char[word.length()];



        for(int i=0;i<word.length();i++)
        {
            charArray[i]=word.charAt(i);
        }


        System.out.println("char array "+Arrays.asList(charArray));
        Character[] characterArray = new Character[charArray.length];

        Arrays.setAll(characterArray,i->charArray[i]);
        System.out.println("characterArray  "+Arrays.asList(characterArray));


        TreeSet tobj = new TreeSet(Arrays.asList(characterArray));

        ArrayList aobj = new ArrayList(Arrays.asList(characterArray));

        System.out.println("Array list obj "+aobj);

        System.out.println("tobj"+tobj);

        ArrayList aobj2 = new ArrayList(tobj);

        System.out.println("aobj2"+aobj2);

        aobj2.removeAll(aobj);
        aobj.retainAll(aobj2);
        System.out.println("After removing"+aobj2);
        System.out.println("After retainAll"+aobj);
    }
}
