package javainterviewprograms.NaveenTrickyCodeQuestions;

public class MethodOverloadingNullArgument {

    public static void main(String[] args) {
        test(null);
    }

    public static void test(String s)
    {
        System.out.println("String method");
    }


    public static void test(Object o)
    {
        System.out.println("Object method");
    }
}
