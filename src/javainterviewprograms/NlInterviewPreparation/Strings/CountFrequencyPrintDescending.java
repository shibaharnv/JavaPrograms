package javainterviewprograms.NlInterviewPreparation.Strings;

import java.util.*;

public class CountFrequencyPrintDescending {

    public static void main(String[] args) {

        //{tree,-count frequency-t1r1e2--output eer1
        // Using Haspmap count the frequency
        // using entry set get value }


        String word="tree";

        HashMap<Character,Integer> hm= new HashMap<>();


        char[] charArray= word.toCharArray();

        for(char c:charArray)

        {
            if(!hm.containsKey(c))
            {
                hm.put(c,1);

            }

            else {
                hm.put(c,hm.get(c)+1);
            }
        }

        System.out.println(hm);
        int value;

        //NavigableMap<Character,Integer>nm=hm.descendingMap();

      //  System.out.println(nm);

        StringBuffer result = new StringBuffer();

        List<Integer> al = new ArrayList<>();

       for(Map.Entry map: hm.entrySet())
       {
            value=(int) map.getValue();

            al.add(value);




       }

        System.out.println(al);

       Collections.reverse(al);

        System.out.println(al);

        for(int a:al)
        {

        }

       // result=result.append(String.valueOf(map.getKey()).repeat(value));

        System.out.println(result);

        int charac;
        for(Map.Entry map: hm.entrySet())
        {
            charac=(char) map.getKey();










        }





    }
}
