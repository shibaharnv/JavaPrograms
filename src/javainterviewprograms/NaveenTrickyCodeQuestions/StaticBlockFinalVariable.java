package javainterviewprograms.NaveenTrickyCodeQuestions;

public class StaticBlockFinalVariable {

    //{When we are having final for a variable in a class and when we call it from another class
    // Inside the .class file  byte code  NewTest.b will be replaced by 10 ..it will not load the NewTest Class at all
    // b value it will take it from the common memory allocation}

    public static void main(String[] args) {
        System.out.println("This is main method");
        System.out.println(NewTest.b);//will be replaced by 10

    }
}

class NewTest{
    static final int b=10;

    static {
        System.out.println("This is static method from NewTest class");
    }
}
