package javainterviewprograms.NaveenTrickyCodeQuestions;

public class ConstructorPrivate {

    //Q: How can we create objects outside the class when we make the constructor private?
    int age;

    private ConstructorPrivate() {
      age =30;
    }

    static {
        ConstructorPrivate obj1= new ConstructorPrivate();
    }

    public static void createObject()
    {
        System.out.println("This is create object method");
        ConstructorPrivate obj1= new ConstructorPrivate();
        System.out.println(obj1.age);
    }

    public static void main(String[] args) {

        ConstructorPrivate obj= new ConstructorPrivate();
        System.out.println(obj.age);

    }
}
