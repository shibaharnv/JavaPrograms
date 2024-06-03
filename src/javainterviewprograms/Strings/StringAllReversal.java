package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringAllReversal {

    public static void main(String[] args) {


        String word = "abcd";

        StringBuffer sb = new StringBuffer(word);

        sb.reverse();

        System.out.println(sb);


        String reverse="";


        for(int j=word.length()-1;j>=0;j--)
        {
            reverse=reverse+word.charAt(j);
        }
        System.out.println(reverse);


//
//        char[] charArray= word.toCharArray();
//
//        Character[] characterArray= new Character[charArray.length];




    }
}
