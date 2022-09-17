package javainterviewprograms;

import java.util.Random;

public class RandomString {
    //{For Random String first generate random Number
    // then have a string for a-z
    // then using character array and using loop add the string to character array one by one
    // Then with another loop frame the random string}

    public static void main(String[] args) {
        Random ranObj= new Random();

        int ranNo=ranObj.nextInt(10);
        System.out.println("RanNo "+ranNo);

        String alphabets="abcdefghijklmnopqrstuvwxyz";

        char[] charArray= new char[alphabets.length()];

        for(int i=0; i< alphabets.length();i++)
        {
            charArray[i]= alphabets.charAt(ranObj.nextInt(10));
        }

        System.out.println(charArray);

        //only 5 character random String

        String randomString="";

        for(int j=0;j<5;j++)
        {
            randomString=randomString+charArray[j];
        }

        System.out.println("five character random String "+randomString);

        //Random Number + String

        Random roo= new Random();

        int test1=roo.nextInt(1000);

        String combinedString = randomString+String.valueOf(test1);
        System.out.println("combinedString "+combinedString);
    }

}
