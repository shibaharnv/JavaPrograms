package javainterviewprograms.Strings;

import java.util.ArrayList;
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

        HashMap<String,Integer> hobj = new HashMap();
        int i=1;


        for(String sd:wordArray)
        {
            if(!hobj.containsKey(sd))
            {
                hobj.put(sd,1);
            }
            else {
                hobj.put(sd,hobj.get(sd)+1);
            }
        }
        System.out.println(hobj);

        int count=0;

        ArrayList al= new ArrayList();

        for(String s:hobj.keySet())
        {
           count= hobj.get(s);

           if(count>1)
           {
               al.add(s);
           }
        }
        System.out.println(al);



//        for(String s:wordArray)
//        {
//            if(hobj.containsKey(s))
//            {
//              hobj.put(s,i+1);
//            }
//            else {
//                hobj.put(s,i);}
//
//
//        }
//
//        System.out.println(hobj);




    }
}