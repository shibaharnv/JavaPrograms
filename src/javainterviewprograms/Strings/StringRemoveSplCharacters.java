package javainterviewprograms.Strings;

public class StringRemoveSplCharacters {

    public static void main(String[] args)
    {
        String s= "$@#$@#%%^&^$%&$%~~#!@#(*_++*^%abcd1234";
        s= s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

        String x= "(^*(%%$#!$#%$#^$%^$%^xyz987";

        x=x.replaceAll("[a-zA-Z0-9]","");
        System.out.println(x);

    }
}
