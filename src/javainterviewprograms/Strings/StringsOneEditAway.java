package javainterviewprograms.Strings;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class StringsOneEditAway {

    //{Input two strings - one edit away
    // 1.Three operations permitted 1. change the character ,2 . add a character, 3 .deleted a character}

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcv";

        System.out.println("contains result "+s1.contains(s2));

        //{write function that accepts two strings and change one character to make the strings equal
        // logic : INside the method convert both the strings to Char array
        // COnvert them to character array and do arrays sorting
        // Try to add the character one by one inside the set and check the boolean value if the change count value is one the return true}



        boolean restult = oneEditAwayChange(s1, s2);
        boolean result2=oneEditAwayAdd(s1,s2);
        System.out.println(restult);
        System.out.println("result2 "+result2);
    }


    public static boolean oneEditAwayChange(String str1, String str2) {


        if(str1.length()==str2.length())
        {


        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        int Stringlength = str1.length();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        Character[] characterArray1 = new Character[charArray1.length];
        Arrays.setAll(characterArray1, i -> charArray1[i]);
        Character[] characterArray2 = new Character[charArray2.length];
        Arrays.setAll(characterArray2, i -> charArray2[i]);
        System.out.println(charArray1);
        System.out.println(charArray2);
        ArrayList al1 = new ArrayList(Arrays.asList(characterArray1));
        ArrayList al2 = new ArrayList(Arrays.asList(characterArray2));


        int count = 0;

        for (Object e : al1) {
            if (al2.contains(e)) {
                count++;
            }
        }
            if (count == Stringlength - 1) {
                return true;
            }

        }

        return false;
    }


    public static boolean oneEditAwayAdd(String st1,String st2)
    {
        //{Add character logic find the string length for both the strings and if the difference is one then check using contains method}

        boolean result= true;
        int Stringlength1= st1.length();
        int Stringlength2= st2.length();
        int diff= Stringlength1-Stringlength2;

        if(diff==1)
        {
            if(st1.contains(st2))
            {
                return result;
            }
        }

        else if (diff== -1)
        {
            if(st2.contains(st1))
            {
                return result;
            }
        }

        return false;
    }
}