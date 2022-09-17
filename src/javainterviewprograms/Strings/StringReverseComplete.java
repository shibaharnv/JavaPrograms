package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringReverseComplete {

    public static void main(String[] args)
    {
        String fullString="This is java";

            String[] fullStringArray=fullString.split("\\s");

        System.out.println(Arrays.asList(fullStringArray));


        String reverseFullString="";

//        for(String oneWord:fullStringArray)
//        {
//            StringBuilder sb = new StringBuilder(oneWord);
//            sb.reverse();
//            reverseWord= reverseWord +sb.toString() +" ";
//        }

        for(String oneWord:fullStringArray)
        {
            Character c=' ';

            String reverseWord = "";

            for(int i=oneWord.length()-1;i>=0;i--)
            {
                c= oneWord.charAt(i);

                 reverseWord= reverseWord+ c;
            }



            reverseFullString=reverseFullString+reverseWord+ " ";
        }



        System.out.println("reverse word "+reverseFullString);
    }


}
