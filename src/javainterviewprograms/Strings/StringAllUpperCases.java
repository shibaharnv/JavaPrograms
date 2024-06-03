package javainterviewprograms.Strings;

public class StringAllUpperCases {

    public static void main(String[] args)
    {
        String word="AmaZon123";

        //{GEt all upper cases
        // USe regular expression }

//        word=word.replaceAll("[^A-Z]","");
//        System.out.println(word);
        word=word.replaceAll("[^A-Z]","");
        System.out.println(word);


    }
}
