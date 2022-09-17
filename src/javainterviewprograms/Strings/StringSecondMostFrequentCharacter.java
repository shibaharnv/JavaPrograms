package javainterviewprograms.Strings;

import java.util.*;

public class StringSecondMostFrequentCharacter {

    //{Coding Q: Given a string (“Banana”); Find the second most frequent character in the given String;}

    public static void main(String[] args)
    {
        String word = "shibahar";

        //{Find second most frequent character1. most frequesnt character means character that appears many times in the string
        // Using hashmap we can find the character count Tree map sort the keys
        // pick the second select last element from the tree map using descending set}

        char[] wordCharArray=word.toCharArray();

        TreeMap<Character,Integer> tm= new TreeMap<Character,Integer>();

        String testString;

        //find the count of the character

        int charCount =word.replaceAll("[^a-z]","").length();
        testString=word.replaceAll("[^a-z]","");
        System.out.println(testString);
        System.out.println("count "+charCount);

        for(char c:wordCharArray)
        {
            int charLength =word.replaceAll("[^"+c+"]","").length();
            tm.put(c,charLength);
        }

        System.out.println(tm);
        System.out.println(tm.get('a'));
        Collection ll=tm.values();

        Object[] objArray =ll.toArray();
        LinkedList linklist = new LinkedList(Arrays.asList(objArray));
        System.out.println(linklist);
        Collections.sort(linklist);
        System.out.println("After sorting"+linklist);
        System.out.println(linklist.pollLast());
        Object value=linklist.getLast();

       // System.out.println("Second most freq character "+tm.get(value));


        for(Map.Entry enry:tm.entrySet())
        {
            System.out.println(enry);
            if(enry.getValue().equals(value))
            {
                System.out.println(enry.getKey());
            }
        }


    }
}
