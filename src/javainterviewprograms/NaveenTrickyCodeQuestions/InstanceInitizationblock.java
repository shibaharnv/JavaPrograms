package javainterviewprograms.NaveenTrickyCodeQuestions;

public class InstanceInitizationblock {

    static {
        System.out.println("Static block");

        System.err.println("error block");
    }

    {
        System.out.println("Instance initizalizaton class");
    }

    InstanceInitizationblock()
    {
        System.out.println("this is constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        new InstanceInitizationblock();
    }
}
