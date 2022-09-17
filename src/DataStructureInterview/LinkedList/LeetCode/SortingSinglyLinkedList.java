package DataStructureInterview.LinkedList.LeetCode;

public class SortingSinglyLinkedList {

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

    void sortLinkedList()
    {
        //{we will have two pointers one is current and another one is index
        // current node points to head at the begining and index node will point the node next to the head
        //check if the current node is greater than the index node if it is true the swap the node
        // }
        Node current = head, index = null;
        int temp;
        if(head==null)
        {
            System.out.println("Linked list is empty and it cannot be sorted");
        }

        if(head ==tail)
        {
            System.out.println("There is only one node in the linked list and cannot be sorted");
        }

//        else
//        {
//            Node currentnode=head;
//            Node indexnode=currentnode.next;
//            int temp;
//
//            while (indexnode!=null)
//            {
//                if(currentnode.data>indexnode.data)
//                {
//                     temp =currentnode.data;
//                    currentnode.data=indexnode.data;
//                    indexnode.data=temp;
//                }
//                currentnode=currentnode.next;
//                indexnode=indexnode.next;
//            }
//        }

        else {
            while(current != null) {
                //Node index will point to node next to current
                index = current.next;

                while(index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }

        System.out.println("After sorting the linked list");
    }


    public static void main(String[] args)
    {
        SortingSinglyLinkedList llobj= new SortingSinglyLinkedList();

        llobj.addNodeAtLast(20);
        llobj.addNodeAtLast(10);
        llobj.addNodeAtLast(30);
        llobj.addNodeAtLast(40);
        llobj.displayNodes();
        llobj.deleteNodeAtLast();
        llobj.displayNodes();
        llobj.addNodeAtFirst(50);
        llobj.displayNodes();
        llobj.sortLinkedList();
        llobj.displayNodes();
    }


}
