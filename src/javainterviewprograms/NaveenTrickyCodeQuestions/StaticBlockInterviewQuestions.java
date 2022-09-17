package javainterviewprograms.NaveenTrickyCodeQuestions;

public class StaticBlockInterviewQuestions {

    //{Q : Run a java class without making any object}

    static {
        System.out.println("This is static block which will be called when the class is loaded in memory");
    }

    public static void main(String a[])
    {
        System.out.println("this is main method");
    }

    public static void test()
    {
        System.out.println("This is static test method");
    }

}
