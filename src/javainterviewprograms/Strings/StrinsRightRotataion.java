package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class StrinsRightRotataion {

    public static void main(String[] args) {
        String word="abc";//Output:"bca"                            //{[a,b,c] }            output:[c,a,b]  [b,c,a]
        //{index of b=value of b-1
        //index of c=value of c-1
        //Save the las index value and paste it
        //i= 2: [a,b,b]
        //i=1: [a,a,b]
        // abc
        //{a->b,b->c}
        //{conver to char array
        // add to addray list}
        System.out.println(word);
        System.out.println(rightRotation(word));
        System.out.println(rightRotation(word));








    }

    private static String rightRotation(String input)
    {

        char[] charArray= input.toCharArray();

        int charSize= charArray.length;
       // System.out.println(charSize);

        char last=charArray[charSize-1];
       // System.out.println("last "+last);

        for(int i=charSize-1;i>0;i--)
        {
            charArray[i]=charArray[i-1];
        }

        charArray[0]=last;
        //String output=charArray.toString();

        String output= new String(charArray);

        return output;



    }
}
