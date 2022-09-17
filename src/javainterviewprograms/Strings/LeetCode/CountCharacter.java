package javainterviewprograms.Strings.LeetCode;

public class CountCharacter {

    public static void main(String[] args)
    {
        char c= 'p';
        String word="apple";
        int pCount=word.replaceAll("[^"+c+"]","").length();

        System.out.println(pCount);
    }
}
