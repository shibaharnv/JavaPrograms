package DataStructureInterview.LinkedList;

public class LinkedListCreationDeletelastNode {

    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    Node head =null;
    Node tail=null;

    public void insertNode(int data)
    {
        Node newnode =new Node(data);

        if(head==null)
        {
            head=newnode;
            tail=newnode;

        }

        else {
            tail.next=newnode;
            tail=newnode;
        }

    }

    public void deleteNodeAtLast()
    {

        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else if(head==tail)
        {
            head=null;
            tail=null;
        }
        else {


            Node currentnode=head;
            while(currentnode.next!=tail)
            {
                currentnode=currentnode.next;
            }

            tail=currentnode;
            tail.next=null;
        }

    }


    public void displayNodes()
    {
        Node currentnode;

        currentnode=head;

        while(currentnode!=null)
        {
            System.out.println(currentnode.data);
            currentnode=currentnode.next;
        }

    }

    public static void main(String[] args)
    {

        LinkedListCreationDeletelastNode llobj= new LinkedListCreationDeletelastNode();

        llobj.insertNode(10);
        llobj.insertNode(20);
        llobj.insertNode(30);

        llobj.displayNodes();
        llobj.deleteNodeAtLast();
        llobj.displayNodes();
    }

}
