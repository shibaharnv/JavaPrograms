package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class StringReverseSentenceWithSpace {

    public static void main(String[] args) {

        String sentence = "This is Java";
            //output :sihT si avaJ
                    //avaJ si sihT
        //Java is This
        //{Input is String:OUtput is also String
        // Split the sentence using split method and store it in string array
        // Using for each get the single word and reverse it and concat to new string with space
        // Use String buffer for reversing}

        String[] sentenceArray =sentence.split(" ");

        System.out.println(Arrays.toString(sentenceArray));

        ArrayList<String> al = new ArrayList<String>();

        String reverseOutput ="";
        String output ="";
        StringBuffer sb = null;
        for(String s:sentenceArray)
        {
             sb = new StringBuffer(s);
            sb.reverse();
            System.out.println(sb);
            al.add(sb.toString());
            output=output.concat(String.valueOf(sb));
            System.out.println(output);
            output=output.concat(" ");
            System.out.println(output);
        }

        System.out.println(output);
        System.out.println("Arraylist "+al);

        for(int i= al.size()-1;i>=0;i--)
        {
            String value =al.get(i);

            reverseOutput=reverseOutput.concat(value);
            reverseOutput=reverseOutput.concat(" ");
        }

        System.out.println(reverseOutput);
        //SB2

        StringBuffer sb2= new StringBuffer(output);

        sb2.reverse();
        System.out.println(sb2);

        String wordSentence= "This is Java";

        //OUtput //Java is This

        String[] wordSentenceArray= wordSentence.split(" ");

        String finalOutput="";

        for(int j= wordSentenceArray.length-1;j>=0;j--)
        {
            String value=wordSentenceArray[j];

            finalOutput= finalOutput.concat(value);
            finalOutput=finalOutput.concat(" ");
        }

        System.out.println(finalOutput);


    }
}
