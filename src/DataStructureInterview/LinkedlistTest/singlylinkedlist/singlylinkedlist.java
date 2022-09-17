package DataStructureInterview.LinkedlistTest.singlylinkedlist;

public class singlylinkedlist {

    private Node first;
    private Node last;


    public singlylinkedlist()
    {

    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insertNodeAtFirst(int data)
    {
        Node newnode= new Node();
        newnode.data=data;
        newnode.next=first;
        first=newnode;
        last=last.next;

    }

    public Node deleteNodeAtFirst()
    {
        Node temp =first;
        first=first.next;
        return temp;
    }

    public void displaylist()
    {
//        Node currentnode =first;
//        while (currentnode!=null)
//        {
//            System.out.println(currentnode.data);
//            currentnode=currentnode.next;
//        }

        Node currentnode=last;

    }

}
