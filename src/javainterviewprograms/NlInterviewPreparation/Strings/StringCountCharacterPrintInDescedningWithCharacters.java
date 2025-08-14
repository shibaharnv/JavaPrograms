package javainterviewprograms.NlInterviewPreparation.Strings;

import java.util.*;

public class StringCountCharacterPrintInDescedningWithCharacters {

    public static void main(String[] args) {
        //{ I/p="banana" o/p=b:3 n:2,b:1
        // Input data type is String and Output data type is map
        // Convert String to char Array
        // using map count the characters- Key as character and value as count
        // condition check in the map if the key is already present if not present set the count to 1
        // if it is already present then get the value using get key method and increase the count
        // Based on the value we need to sort
        // get the values using entry set
        // take the values sepreately and put that in the list and sort
        // from value get key and put it put it in the map }

        String input ="aabbbc";

        char[] charArray=input.toCharArray();

        Map<Character,Integer> map = new TreeMap<>();
        for(char c:charArray)
        {
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }
            else
            {
                map.put(c,map.get(c)+1);
            }

        }

        System.out.println("Tree map" +map);

        //{a=3, b=1, n=2}
        //{a=3,n=2,b=1}
       Set mapSet=map.entrySet();
        System.out.println(mapSet);
        mapSet.iterator();
        LinkedList<Integer> al = new LinkedList();

        int value=0;
        for(Map.Entry entry:map.entrySet())
        {
            System.out.println(entry);
            value= (int)entry.getValue();
           al.add(value);
        }

        System.out.println(al);

        Collections.sort(al);
        System.out.println("After sorting" +al);

       Iterator<Integer> itr= al.descendingIterator();

       Map<Character,Integer> linkedMap = new LinkedHashMap<>();

       ArrayList descAl = new ArrayList();
            int temp=0;
       while (itr.hasNext())
       {
          temp=itr.next();

           descAl.add(temp);

           for(Map.Entry<Character,Integer> entr:map.entrySet())
           {
               if(entr.getValue().equals(temp))
               {
                   linkedMap.put(entr.getKey(),temp);
               }

           }


       }

        System.out.println(linkedMap);




    }


}
