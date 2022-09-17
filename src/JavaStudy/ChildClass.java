package JavaStudy;

public class ChildClass extends ParentClass{

    public static void main(String[] args)
    {
        ChildClass cobj = new ChildClass();

        cobj.testPrivate();



        testStatic();
    }

    private void testPrivate()
    {
        System.out.println("this is test private method from child class");
    }

    static void testStatic()
    {
        System.out.println("this is test Static method from child");
    }

    void testNonStatic()
    {
        System.out.println("this is test Non Static method from child");
    }
}
