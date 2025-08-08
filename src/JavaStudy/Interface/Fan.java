package JavaStudy.Interface;



public class Fan implements Remote{
    @Override
    public void turnOff() {
        System.out.println("Fan is OFF");
    }

    @Override
    public void turnOn() {
        System.out.println("Fan is ON");
    }


}
