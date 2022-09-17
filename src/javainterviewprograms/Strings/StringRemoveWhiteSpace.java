package javainterviewprograms.Strings;

public class StringRemoveWhiteSpace {

    public static void main(String[] args)
    {
        String w= "x tr gf  hgh";

       // w=w.replaceAll(" ","");
        w=w.replaceAll("\\s","");
        System.out.println(w);

    }
}
