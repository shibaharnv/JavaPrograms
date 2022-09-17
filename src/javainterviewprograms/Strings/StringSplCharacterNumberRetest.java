package javainterviewprograms.Strings;

public class StringSplCharacterNumberRetest {

    public static void main(String[] args)
    {
        //WP to Separate Digits, Letters and Special Characters from a given string

        String word ="test123$#$#$@#$@";

        String onlyNumbers;
        String onlyString;
        String onlySplCharacters;

        onlyNumbers=word.replaceAll("[^0-9]","");

        System.out.println("onlyNumbers "+onlyNumbers);

        onlyString=word.replaceAll("[^a-z]","");

        System.out.println("onlyString "+onlyString);

        onlySplCharacters=word.replaceAll("[0-9]","");

        onlySplCharacters=onlySplCharacters.replaceAll("[a-z]","");

        System.out.println("onlySplCharacters "+onlySplCharacters);



    }
}
