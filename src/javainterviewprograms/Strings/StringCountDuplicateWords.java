package javainterviewprograms.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class StringCountDuplicateWords {

    public static void main(String[] args) {

            String word = "This is java java learning learning program";
            //{o/p--> This --1
        // O/p--> is ---1
        // java--> 2
        // learning-->2
        // Program-->1
        // WE need to use hashmap data structure beacuse we have word and count pair
        // in hashmap duplicate keys are not allowed but duplicate values are allowed
        // one null key and multiple null values are allowed}

        String[] wordArray = word.split(" ");
        System.out.println(Arrays.toString(wordArray));

        HashMap hobj = new HashMap();
        int i=1;
        for(String s:wordArray)
        {
            if(hobj.containsKey(s))
            {
              hobj.put(s,i+1);
            }
            else {
                hobj.put(s,i);}


        }

        System.out.println(hobj);




    }
}