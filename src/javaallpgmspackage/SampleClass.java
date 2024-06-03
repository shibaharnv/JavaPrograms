package javaallpgmspackage;

public class SampleClass {
    public static void main(String[] args) {
        method(null);
        IntegerMethod in = new IntegerMethod();
        in.intMethod();
    }

    public static void method(Object obj) {
        System.out.println("object method called");
    }

    public static void method(String str) {
        System.out.println("string method called");
    }
}
