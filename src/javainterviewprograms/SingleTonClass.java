package javainterviewprograms;

public class SingleTonClass {

    //{Singleton class only one object should be created for the singleton class
    // in the single ton class one static object should be created and constructor should be private and static getinstance method should be created that
    // will return the object}

    public static void main(String[] args)
    {
        MySingleTonClass obj2 =MySingleTonClass.getInstance();
        MySingleTonClass obj3 =MySingleTonClass.getInstance();

        System.out.println(obj2);
        System.out.println(obj3);
    }
}


class MySingleTonClass {


    static MySingleTonClass obj = new MySingleTonClass();

    private MySingleTonClass()
    {
        System.out.println("singleton constructor");
    }

    public static MySingleTonClass getInstance()
    {
        return obj;
    }

}
