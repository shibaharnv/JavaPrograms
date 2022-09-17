package javainterviewprograms.Strings;

public class StringSplCharacterNumber {

    public static void main(String[] args)
    {
        //WP to Separate Digits, Letters and Special Characters from a given string

        String word ="test123$#$#$@#$@";

        //Separte spl characters

        String splcharacter =word.replaceAll("[a-zA-Z0-9]","");

        System.out.println("splcharacter :"+splcharacter);

        // sepearte digits

        String digits = word.replaceAll("[^0-9]","");

        System.out.println("digits :"+digits);

        // separate letters

        String letters = word.replaceAll("[^a-zA-Z]","");

        System.out.println("letters "+letters);

        String myWord ="fsdfsdXYZ";

        myWord= myWord.replaceAll("[^A-Z]","");

        System.out.println("captial letter "+myWord);
    }
}
