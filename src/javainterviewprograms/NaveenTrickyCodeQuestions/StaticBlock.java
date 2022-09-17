package javainterviewprograms.NaveenTrickyCodeQuestions;

public class StaticBlock {

    //{In java when class is loaded in memory static block will be called and only then main method will be executed}

    public static void main(String[] args) {
        System.out.println("This is main method");
    }

    static {
        System.out.println("this is static block inside the class");
    }
}
