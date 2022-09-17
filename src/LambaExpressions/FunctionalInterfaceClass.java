package LambaExpressions;

@FunctionalInterface
interface cab
{
    public void bookcab();

}

class ola implements cab
{

    @Override
    public void bookcab() {
        System.out.println("Cab booked");
    }

    // for the above method writing lambda expression

  //  ()-> System.out.println("Cab booked");
}

public class FunctionalInterfaceClass {

    public static void main(String[] args)
    {
        //cab obj = new ola();
        //instead of the above line like creating class we can use lambda expression as below so that no seperate class is required
        //and code is reduced.
        cab obj = ()-> System.out.println("Cab booked");
        obj.bookcab();
    }
}
