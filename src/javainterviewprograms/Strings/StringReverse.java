package javainterviewprograms.Strings;

public class StringReverse {

    public static void main(String[] args)
    {
        String word = "shibahar";

        String reverse="";

        for(int i=word.length()-1;i>=0;i--)
        {
            reverse=reverse+word.charAt(i);
        }

        System.out.println(reverse);

        //Type 2
        StringBuilder sbo= new StringBuilder("abcd");
        System.out.println(sbo.reverse());

        // Type 3: Character Array

        String value= "xyz";

        char[] charArray=value.toCharArray();

        String rev="";

        for(int j= charArray.length-1;j>=0;j--)
        {
            rev= rev+charArray[j];
        }
        System.out.println(rev);
    }



}
