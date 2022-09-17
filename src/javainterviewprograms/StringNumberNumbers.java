package javainterviewprograms;

public class StringNumberNumbers {

    public static void main(String[] args)
    {
        String word="Demo1234Demo$#@$@#$@#";
        String number;
        String splcharacter;
        String newString;
        number=word.replaceAll("[^0-9]","");
        System.out.println("number "+number);
        splcharacter=word.replaceAll("[a-zA-Z0-9]","");
        System.out.println("character "+splcharacter);

        newString=word.replaceAll("[^a-zA-z]","");
        System.out.println("newString"+newString);
    }
}
