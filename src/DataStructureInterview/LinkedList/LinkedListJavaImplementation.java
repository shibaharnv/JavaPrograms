package DataStructureInterview.LinkedList;

public class LinkedListJavaImplementation {

    Node head;
    class Node
    {
        int data;
        Node next;

        Node( int data)
        {
            this.data = data;
            next = null;
        }

    }


    public void printLinkedList()
    {
        Node n= head;
        while (n!=null)
        {
            System.out.println("data is "+n.data);
            n=n.next;
        }

    }

   public static void main(String[] args)
   {

       LinkedListJavaImplementation ll= new LinkedListJavaImplementation();

       Node first = ll.new Node(10);
       ll.head=first;


       Node second = ll.new Node(20);
       first.next=second;

       Node third = ll.new Node(30);
       second.next=third;

       ll.printLinkedList();


   }
}
