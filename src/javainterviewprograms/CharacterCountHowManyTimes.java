package javainterviewprograms;

import java.util.Arrays;
import java.util.HashMap;

public class CharacterCountHowManyTimes {

    public static void main(String[] args)
    {
        String word ="shibahara";
        word=word.replaceAll("\\s","");
        System.out.println(word);

        char[] wordCharArray =word.toCharArray();

        System.out.println(Arrays.toString(wordCharArray));

        HashMap<Character,Integer> hsobj = new HashMap<Character,Integer>();
        int i=1;
        for(char c:wordCharArray)
        {
            if(hsobj.containsKey(c))
            {
                hsobj.put(c,i+1);
            }
            else {
                hsobj.put(c, i);
            }
        }

        System.out.println(hsobj);

        // Printing only duplicates
        for(Character key:hsobj.keySet())
        {

            if(hsobj.get(key)>1){
                System.out.println("Duplicate character"+key+" = "+hsobj.get(key));
            }
        }
    }
}
