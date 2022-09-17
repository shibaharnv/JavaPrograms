package javainterviewprograms.NaveenTrickyCodeQuestions;

public class StaticBlockMemberVariables {

    String name;

    static {
        int a=10;
        System.out.println(a);

        StaticBlockMemberVariables obj = new StaticBlockMemberVariables();

        obj.name="shibahar";

        System.out.println(obj.name);



    }

    public static void main(String[] args) {

    }
}
