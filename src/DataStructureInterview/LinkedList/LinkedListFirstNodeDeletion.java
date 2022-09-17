package DataStructureInterview.LinkedList;

public class LinkedListFirstNodeDeletion {

    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        //by default keeping head and tail node as null
    }

    Node head=null;
    Node tail=null;

    public void insertNode(int data)
    {

        Node newnode=new Node(data);

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
        else {

            //find the second last node
            Node currentnode=head;
            while (currentnode.next!=tail)
            {
                currentnode=currentnode.next;
            }

            tail=currentnode;
            tail.next=null;
        }
        System.out.println("Node deleted at last");
    }

    void deleteNodeAtFirst()
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
        else
        {
            //If the list has more than one node then, the head will point to the next node in the list and delete the old head node.
            Node temp =head;
            head=head.next;
            temp=null;

        }
        System.out.println("Deleted the first node");
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
            System.out.println(currentnode.data);
            currentnode=currentnode.next;
            count=count+1;
        }
        return count;
    }

    //{DELETE A NODE AT SPECIFIC INDEX
    // first take the index or position value as the input parameter
    // find the length of the linked list
    // find the previous node of the node that needs to be deleted
    //how to find the previous node.. Iterate
    // map tail.next =previous node and tail as previous node}

    void returnNodeByPosition(int positionvalue)
    {
        Node currenthead=head;
        int i=0;
        while(i<positionvalue)
        {
            currenthead=currenthead.next;
            System.out.println("Position value "+i+ "  "+currenthead.data );
            i++;

        }
        System.out.println("Position value "+positionvalue+ "  "+currenthead.data );

    }
    //{find the actual node node by index value and store that in temp
    // find the previous node and point the next of previous node tothe node that is present after the node that needs
    // to be deleted}

    void deleteNodeByPosition(int index)
    {
        int i=0;
        Node actualnode=head;
        while (i<index)
        {
            actualnode=actualnode.next;
            i++;
        }

        //now actual node is the node that needs to be deleted so store that in temp
        Node temp=actualnode;
        //now find ut the previous node
        Node previousnode=head;
        int j=0;
        while (j<index-1)
        {
            previousnode=previousnode.next;
            j++;
        }

        //now find the next node of the node that needs to be deleted
        Node nextnode=head;
        int k=0;
        while (k<index+1)
        {
            nextnode=nextnode.next;
            k++;
        }
        temp=null;
        previousnode.next=nextnode;


    }


    // from stackoverflow



    public static void main(String[] args)
    {

        LinkedListFirstNodeDeletion lobj = new LinkedListFirstNodeDeletion();
        lobj.insertNode(11);//0th position
        lobj.insertNode(22);//1 position
        lobj.insertNode(33);//2 position
        lobj.insertNode(44);//3 position
        lobj.insertNode(55);//4 position
        lobj.insertNode(66);//5 position
        lobj.returnNodeByPosition(2);
        lobj.deleteNodeByPosition(4);
        lobj.displayNodes();
        System.out.println("Nodes count "+lobj.countNodes());
        lobj.displayNodes();
        lobj.deleteNodeAtLast();
        lobj.displayNodes();
        lobj.deleteNodeAtFirst();
        lobj.displayNodes();

        lobj.displayNodes();
    }

}
