package JavaStudy;

public class ParentClass {

    public static void main(String[] args)
    {
        testStatic();

        ChildClass cobj1 = new ChildClass();

       cobj1.testNonStatic();
    }

    private void testPrivate()
    {
        System.out.println("this is test private method");
    }

     static void testStatic()
    {
        System.out.println("this is test Static method from parent");
    }
}
