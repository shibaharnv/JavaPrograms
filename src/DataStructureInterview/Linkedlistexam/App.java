package DataStructureInterview.Linkedlistexam;

public class App {

    public static void main(String[] args)
    {
        linkedlistclass llobj= new linkedlistclass();
        llobj.addNode(2);
        llobj.addNode(3);
        llobj.addNode(4);

        llobj.displaynodes();
       int finalcount= llobj.countNodes();
        System.out.println("final count "+finalcount);
    }
}
