package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayWordsEnding {

    //write a program to print words ending with letter 'e' from string array

    //{input: String Array and output is also string array
    // We need take one word at a time and check if the last letter is e is yes add that string to a another string array
    // if not ignore it
    // }


    public static void main(String[] args) {

        String word ="abcd";

        System.out.println(word.charAt(word.length()-1));

        String[] stringArray={"life","six","love"};

        String[] answer=printArray(stringArray);

        System.out.println(Arrays.toString(answer));
    }

    public static String[] printArray(String[] inputArray)
    {



        ArrayList<String> al = new ArrayList(Arrays.asList(inputArray));

        ArrayList<String> outputArrayList = new ArrayList();


        StringBuffer sb = new StringBuffer();
        for(String s:al)
        {

            char c=s.charAt(s.length()-1);

            System.out.println(c);

            if(c=='e')
            {
                outputArrayList.add(s);
            }

        }

       String[] outputArray = new String[outputArrayList.size()];


            outputArrayList.toArray(outputArray);


        return outputArray;

    }
}
