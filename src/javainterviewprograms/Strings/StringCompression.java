package javainterviewprograms.Strings;

import java.io.ObjectStreamException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {


    public static void main(String[] args) {


//        String Compression:
//
//        String input = "aabbcdaav";

// Output: a2b2c1d1a2v1


        String word= "aabbc";
        //output :a2b2c1

        //{convert the string to char arrary
        // iiterate the charact array and declare a hashmap
        // hasmap with character and integer
        // if the character is not present in hashmap i will add the value as 1
        // if it is already present i will increase the value by +1
        // finally i get a hashmap with key and values
        // convert key and values to concate string}

        HashMap<Character,Integer> hm = new HashMap<>();

        char[] charArray = word.toCharArray();

        Character[] characterArray = new Character[charArray.length];

        Arrays.setAll(characterArray,i->charArray[i]);

        for(int i=0;i< characterArray.length;i++)
        {
            if(!hm.containsKey(characterArray[i]))
            {
                hm.put(characterArray[i],1);
            }
            else

            {
                hm.put(characterArray[i],hm.get(characterArray[i])+1);

            }
        }

        System.out.println(hm);
        String result="";
        for(Map.Entry entry: hm.entrySet())
                {

                    System.out.println(entry);
                    Object character=entry.getKey();
                    character=character.toString();

                    result=result+character;

                    Object integer=entry.getValue();
                    integer=integer.toString();
                    result=result+integer;

                }

        System.out.println(result);

    }
}
