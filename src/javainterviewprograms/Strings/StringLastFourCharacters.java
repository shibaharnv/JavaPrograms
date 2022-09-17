package javainterviewprograms.Strings;

public class StringLastFourCharacters {

    public static void main(String[] args)
    {
        String word ="abcdefg";
        String four="";
        char[] wordCharArray=word.toCharArray();
        System.out.println(word.length());
        String lastfour = word.substring(3,word.length());
        System.out.println("lastfour"+lastfour);

        for(int i= wordCharArray.length-1;i>(wordCharArray.length-1)-4;i--)
        {
           char c= wordCharArray[i];
           four=four+c;
        }

       // System.out.println(four);

        StringBuffer sb= new StringBuffer(four);
        System.out.println(sb.reverse());


    }
}
