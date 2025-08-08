package javainterviewprograms.NlInterviewPreparation.Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {

    //{Input : String -Output : character
    // count each character using hashmap
    // if count ==1 break
    // Step1: String to Character Array
    // Step 2: Declare hashmap
    // Step 3: for each loop on chracter array and cehdk the key is alreay present if it is
    // not present then set the count to 1
    // step 4:if it is present get the value and increase the count
    // }
    public static void main(String[] args) {
        String input="automation";

        HashMap<Character,Integer> hm = new HashMap<>();

        char[] charArray=input.toCharArray();

        System.out.println(charArray);

        for (char c:charArray)
        {


            if(!hm.containsKey(c))
            {
                hm.put(c,1);
            }
            else
            {
                hm.put(c,hm.get(c)+1);
            }
        }

        System.out.println(hm);

        for(Map.Entry entry:hm.entrySet())
        {

           Object value= entry.getValue();

           int intValue= (int) value;

           if(intValue==1)
           {
               System.out.println("First non repeating character is "+entry.getKey());
               break;
           }

        }

    }





}
