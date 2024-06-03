package javainterviewprograms.Strings;

public class StringAllUpperCasesRetest {

    public static void main(String[] args)
    {
        String word="AmaZon123";



        word=word.replaceAll("[^0-9]","");

        System.out.println(word);

        //{string Ex:1ABC34D768 the output shd be (1+34+768)
        // basically replace Alphabets with +}

        String myWord="1ABC34D768";

        myWord=myWord.replaceAll("[A-Z]","+");

        System.out.println(myWord);


        myWord=myWord.replaceAll("[+][+][+]","+");
        System.out.println(myWord);
    }
}
