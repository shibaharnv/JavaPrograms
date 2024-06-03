package javainterviewprograms.Strings;

public class StringRemoveWhiteSpaceRetest {

    public static void main(String[] args)
    {
        String w= "x tr gf  hgh";

        w=w.replaceAll("\\s","");

        System.out.println(w);


    }
}
