package JavaStudy.Interface;

public class MainTestClass {

    public static void main(String[] args)
    {
        Remote tvobj = new Tv();
        Remote fanobj = new Fan();

        tvobj.turnOn();
        fanobj.turnOff();
    }
}
