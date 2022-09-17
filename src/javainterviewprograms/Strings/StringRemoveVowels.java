package javainterviewprograms.Strings;

public class StringRemoveVowels {

    public static void main(String[] args)
    {
        String word = "shibahar";

        word=word.replaceAll("a","").replaceAll("i","").replaceAll("e","");

        System.out.println(word);

    }
}
