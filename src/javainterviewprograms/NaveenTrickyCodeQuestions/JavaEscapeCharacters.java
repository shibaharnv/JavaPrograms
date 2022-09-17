package javainterviewprograms.NaveenTrickyCodeQuestions;

public class JavaEscapeCharacters {

    public static void main(String[] args) {

        System.out.println("/\"hello\"/");

        //------ /'Hello'/
        //------'/'Hello'/'
        //------"/'Hello'/"

        System.out.println("/\'Hello\'/");

        System.out.println("'/'Hello'/'");

        System.out.println("\"/'Hello'/\"");
    }
}
