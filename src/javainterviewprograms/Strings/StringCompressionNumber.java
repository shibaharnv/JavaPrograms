package javainterviewprograms.Strings;

import java.util.*;

public class StringCompressionNumber {

    //{String Compression:
    //
    //String input = "aaabbcdaav";
    //
    //// Output: a2b2c1d1a2v1}

    public static void main(String[] args) {

        //{Input is String and Ouput is characterand integers combined together to form a String
        //Using Hashmap find the count of the character
        //using String concatenate character and INteger
        // Check the character until new character
        // set will not add duplicate
        // //Convert String to Char array
        // First add the element to set
        // then check if it is the same character Set.add return false then add it to array
        //
        //if it is a different character }

        String inputString="aaabbcdaav";

        //{take current char and prev char if current char and prev char equal increase the count if not equal it is start of new char so concatprv char and number  }
        char[] charArray= inputString.toCharArray();

        int count =1;

        StringBuffer sb = new StringBuffer();


        for(int i=1;i<charArray.length;i++)
        {
            char currentChar=charArray[i];
            char prevChar=charArray[i-1];



            if(currentChar==prevChar)
            {
                count++;
            }

            else
            {
                sb.append(prevChar);
                sb.append(count);

                count=1;
            }
        }

        System.out.println(sb);



        Map<Character,Integer> map = new LinkedHashMap<>();

        Set<Character> set = new LinkedHashSet<>();

        List<Character> list = new ArrayList<>();



        for(char c:inputString.toCharArray())

        {


            if(!set.add(c))
            {

            }
        }

        for(char c:inputString.toCharArray())
        {

            if(!map.containsKey(c))
            {
                map.put(c,1);
            }

            else {
                map.put(c,map.get(c)+1);
            }

        }

        System.out.println(map);
    }
}
