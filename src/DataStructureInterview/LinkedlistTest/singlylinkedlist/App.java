package DataStructureInterview.LinkedlistTest.singlylinkedlist;

public class App {

    public static void main(String[] args)
    {

        singlylinkedlist sllistobj= new singlylinkedlist();
        sllistobj.insertNodeAtFirst(10);
        sllistobj.insertNodeAtFirst(20);
        sllistobj.insertNodeAtFirst(30);
        sllistobj.deleteNodeAtFirst();
        sllistobj.displaylist();

    }






}
