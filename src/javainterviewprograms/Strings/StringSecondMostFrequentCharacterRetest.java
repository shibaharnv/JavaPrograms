package javainterviewprograms.Strings;

import com.sun.source.tree.Tree;

import java.util.*;

public class StringSecondMostFrequentCharacterRetest {

    //{Coding Q: Given a string (“Banana”); Find the second most frequent character in the given String;}

    public static void main(String[] args) {
        String word = "shibbahara";

        char[] charArray = word.toCharArray();

        //{Find the second most frequent character in the array
        // input : String
        // Output :character
        // first we need to count the characters in the string - Hashmap
        // key value -- character-count
        // first - find the character that is having highest count
        // find the second highest}

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        int count = 0;


        for (int i = 0; i < charArray.length; i++) {

            char c = charArray[i];

            if (!hm.containsKey(c)) {
                hm.put(c, count + 1);
            } else {
                hm.put(c, hm.get(c) + 1);
            }

        }

        System.out.println(hm);

        System.out.println(hm.values());

        TreeSet ts2 = new TreeSet<>(hm.values());

        System.out.println("ts2 " + ts2);



        ts2.pollLast();

        Object highValue = ts2.last();
        int intHighValue = (int) highValue;

        System.out.println(intHighValue);


        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue().equals(highValue)) {
                System.out.println(entry.getKey());
            }


//        Collections<Integer> coll=hm.values();
//
//        for(char c:hm.keySet())
//        {
//                int value =hm.get(c);
//
//                int tempValue=0;
//
//
//
//
//        }


        }
    }
}
