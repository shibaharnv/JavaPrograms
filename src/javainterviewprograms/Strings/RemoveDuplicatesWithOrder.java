package javainterviewprograms.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWithOrder {

    public static void main(String[] args) {

        String s="hello";

        char[] charArray=s.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        for(char c:charArray)
        {
            set.add(c);
        }

        System.out.println(set);

        String result="";

        for(char c:set)
        {
            result=result+c;
        }

        System.out.println(result);
    }
}
