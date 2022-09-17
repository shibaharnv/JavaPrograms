package DataStructureInterview.LinkedList;

public class LinkedListCreationDeletefirstNode {

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

    Node head=null;
    Node tail=null;

    //insertion of node

    public void insertNode(int data)
    {
        Node newnode= new Node(data);

        //Check if the list is empty

        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }

        else
        {
            tail.next=newnode;
            tail=newnode;

        }

    }


    void delelteLastNode()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        //if the linked list has only one node
        if(head==tail)
        {
            head=null;
            tail=null;
        }
        else
        {
            //find the second last node
            Node currentnode=head;
            while (currentnode.next!=tail)
            {
                currentnode=currentnode.next;
            }
            tail=currentnode;
            tail.next=null;
        }
        System.out.println("after deleting the last node");
    }

    public void displayNodes()
    {
        Node currentnode=head;

        while(currentnode!=null)
        {
            System.out.println(currentnode.data);
            currentnode= currentnode.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedListCreationDeletefirstNode llobj= new LinkedListCreationDeletefirstNode();

        llobj.insertNode(15);
        llobj.insertNode(25);
        llobj.displayNodes();
        llobj.delelteLastNode();
        llobj.displayNodes();
    }

}
