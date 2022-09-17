package javainterviewprograms;

public class test {

    public static void main(String[] args)
    {
        String test = " This is the book of ABC's of java";
        String variable = "abc";
        String REGEX = "\\b" + variable + "\\b";

        System.out.println(REGEX);
    }
}
