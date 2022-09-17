package javainterviewprograms.NaveenTrickyCodeQuestions;

public class ConstructorPrivateOutsideClass {

    public static void main(String[] args) {
        //ConstructorPrivateOutsideClass

    //this will not allow us to create object for Constructor private class
       // ConstructorPrivate obj= new ConstructorPrivate();

        ConstructorPrivate.createObject();
    }
}
