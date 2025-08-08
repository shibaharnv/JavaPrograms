package JavaStudy.Interface;

public class Tv implements Remote{
    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }
}
