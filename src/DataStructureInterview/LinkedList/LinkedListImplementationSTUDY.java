package DataStructureInterview.LinkedList;

public class LinkedListImplementationSTUDY {

     class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
// since head and tail are class variables or instance variables java itself will assign null value if we dont initialize the variable
    Node head=null;
    Node tail=null;

    void addNode(int data)
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

    void displayNodes()
    {
        Node currentnode=head;
        while (currentnode!=null)
        {
            System.out.println(currentnode.data);
            currentnode=currentnode.next;
        }
    }

    int countNodes()
    {
        Node currentnode=head;
        int count=0;
        while (currentnode!=null)
        {
            currentnode=currentnode.next;
            count+=1;
        }
        return count;
    }









    public static void main(String[] args)
    {
        LinkedListImplementationSTUDY llobj =new LinkedListImplementationSTUDY();
        llobj.addNode(10);
        llobj.addNode(20);
        llobj.addNode(30);
        llobj.displayNodes();
        System.out.println(llobj.countNodes());
    }

}
