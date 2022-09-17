package DataStructureInterview.LinkedList;

public class LinkedListImplementation {


    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
//            System.out.println("print data "+data);
//            System.out.println("print next pointer "+next);
        }

    }

    public void printLinkedList()
    {
        Node n= head;

        while(n!=null)
        {
            System.out.println(n.data);
            n= n.next;
        }
    }
    public static void main(String[] args)
    {

        //Creating object for linked list class
        LinkedListImplementation llobj= new LinkedListImplementation();

        //Creating the first node
        Node firstnode = llobj.new Node(10);
        llobj.head =firstnode;

        //Creating the Second node and pointing first node next to secondnode

        Node secondnode = llobj.new Node(20);
        firstnode.next=secondnode;

        //Creating the third node and pointing first node next to secondnode
        Node thirdnode = llobj.new Node(30);
        secondnode.next=thirdnode;


        llobj.printLinkedList();

    }
}
