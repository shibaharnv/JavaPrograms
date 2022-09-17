package javainterviewprograms.NaveenTrickyCodeQuestions;

public class StaticBlockAnotherClass {

    //{For this example first main method first class message will be printed since the static block is present in
    // --the another class which is not loaded
    // when we call a variable from testing class that time static block will be loaded first and then print the message}


    public static void main(String[] args) {
        System.out.println("Main method first class");
        System.out.println(testing.a);

    }
}
class testing{
        static int a=10;
    static {
        System.out.println("Testing class static block");
    }

}