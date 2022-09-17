package DataStructureInterview.LinkedList;

public class LinkedListAllExam {

    //{Check if head is null }

    class Node{
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

    public void addNodeAtLast(int data)
    {
        Node newnode =new Node(data);
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


    public void addNodeAtFirst(int data)
    {
        Node freshnode = new Node(data);

        if(head==null)
        {
            System.out.println("linked list is empty");
            head=freshnode;
            tail=freshnode;
        }
        else {
            Node temp = head;
            head = freshnode;
            head.next = temp;
        }
        System.out.println("Added the node at the begining");
    }

    public void displayNodes()
    {
        Node currentnode =head;

        while(currentnode!=null)
        {
            System.out.println(currentnode.data);

            currentnode=currentnode.next;
        }
    }

    void deleteFirstNode()
    {

        if(head==null)
        {
            System.out.println("linked list is empty");
        }

        if(head==tail)
        {
            head=null;
            tail=null;
        }
        else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
        System.out.println("Deleted the first node");
    }

    void deleteNodeAtLast()
    {
        if(head==null)
        {
            System.out.println("linked list is empty");
            return;
        }
        if(head==tail)
        {
            head=null;
            tail=null;
        }
        else
        // Find the second last node and change the tail to second last node
        {
            Node actualnode=head;
            while (actualnode.next!=tail)
            {
                actualnode=actualnode.next;
            }
            tail=actualnode;
            tail.next=null;
        }

        System.out.println("Removed the last node");
    }


    public static void main(String[] args)
    {
        LinkedListAllExam llobj= new LinkedListAllExam();
        llobj.addNodeAtLast(10);
        llobj.addNodeAtLast(20);
        llobj.addNodeAtLast(30);
        llobj.addNodeAtLast(40);
        llobj.displayNodes();
        llobj.deleteNodeAtLast();
        llobj.displayNodes();
        llobj.addNodeAtFirst(50);
        llobj.displayNodes();
    }

}
