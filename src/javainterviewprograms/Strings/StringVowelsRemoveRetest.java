package javainterviewprograms.Strings;

import java.util.ArrayList;

public class StringVowelsRemoveRetest {

    public static void main(String[] args) {
        String word = "shibahar";

        //{convert the string to char array
        // iterate using char array lenth
        // capture the single character and check if it matches with a ,e,i,o,u
        // store all non vowel characters to char array}

        char[] wordCharArray = word.toCharArray();

        ArrayList<Character> alist= new ArrayList<Character>();


        for (int i = 0; i < wordCharArray.length; i++) {
            char c = wordCharArray[i];

            if (c == 'a' || c == 'e' || c == i || c == 'o' || c == 'u') {

            }
            else
            {
                alist.add(c);
            }



        }

        System.out.println(alist);
    }
}
