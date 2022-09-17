package JavaStudy.Singleton;


//Singleton class
public class Animal {

    public static Animal single_instance=null;

    private Animal()
    {

    }


    public static Animal getSingle_instance() {

        if(single_instance==null)
        {
            single_instance=new Animal();
        }
        return single_instance;
    }
}
