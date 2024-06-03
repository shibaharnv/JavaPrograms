package javaallpgmspackage;

public class SwapTwoNumbersExists {

    public static void main(String[] args) {

        int a=1;
        int b=2;
        int c=a+b;
        b=c-b;
        a=a+b;

        System.out.println("a value="+a);
        System.out.println("b value="+b);

        String word1="abc";
        String word2="def";

        String word3=word1+word2;

        System.out.println("word3 "+word3);

        word2=word3.replace(word2,"");
        System.out.println("word2 "+word2);

        word1=word3.replace(word2,"");

        System.out.println(word1);
        System.out.println(word2);

    }
}
