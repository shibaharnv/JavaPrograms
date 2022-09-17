package DataStructureInterview.Queue;

public class QueueMainClass {


    public static void main(String[] args)
    {
        Queueclass qobj = new Queueclass(4);
        qobj.insert(10);
        qobj.insert(20);
        qobj.insert(30);
        qobj.insert(40);
        qobj.show();
        long finalremovedvalue=qobj.remove();
        System.out.println("finalremovedvalue"+finalremovedvalue );
        qobj.show();

    }

}
