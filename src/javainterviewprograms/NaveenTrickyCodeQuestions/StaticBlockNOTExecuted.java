package javainterviewprograms.NaveenTrickyCodeQuestions;

public class StaticBlockNOTExecuted {

    static {
        System.out.println("this is static block");
    }

    public static final int x=20; //When we use static final then value will be stored in the common memory allocation

}


class testings
{
    public static void main(String[] args) {
        System.out.println(StaticBlockNOTExecuted.x);
    }
}
