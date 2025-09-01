package javainterviewprograms.NlInterviewPreparation.Strings;

public class Reversal {

    public static void main(String[] args) {
        //{String s = "Kalyani";
        //Output: ialyanK}


        String s = "Kalyani";

        //{Get the first element store in temp1
        // get the last element store in temp2
        // swap}
           String temp1= s.substring(0,1);

           String temp2=s.substring(s.length()-1,s.length());

        System.out.println("temp2"+temp2);

           String remaining= s.substring(1,s.length());

         System.out.println(remaining);

           StringBuffer sb = new StringBuffer();

           sb.append(temp2).append(remaining).append(temp1);

        System.out.println(sb);


    }
}
