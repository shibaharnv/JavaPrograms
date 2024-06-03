package javainterviewprograms.Strings;

import java.util.*;

public class StringCountDuplicateWordsRetest {

    public static void main(String[] args) {

            String word = "This is java java learning learning program";
        ArrayList<String> al=duplicateCheck(word);

    }

    public static ArrayList<String> duplicateCheck(String word)
    {
        //{Count the duplicates .Convert the string into array
        // add the array into hashmap
        // if the key is present increase the count by getting it
        // iteraters through the values and get the key based on condition greater than 1}

        HashMap<String,Integer> hm = new HashMap<>();

          String[] strArray=word.split(" ");



          for(int i=0;i< strArray.length;i++)
          {
              if(!hm.containsKey(strArray[i]))
              {
                  hm.put(strArray[i],1);
              }

              else

              {
                  hm.put(strArray[i],hm.get(strArray[i])+1);
              }
          }

        System.out.println(hm.entrySet());


        ArrayList<String> duplicateWords = new ArrayList<>();
        for(Map.Entry<String,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()>1)

            {
                duplicateWords.add(entry.getKey());
            }
        }


    return duplicateWords;



    }
}