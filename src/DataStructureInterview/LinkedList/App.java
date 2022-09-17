package DataStructureInterview.LinkedList;

public class App {

    public static void main(String[] args)
    {
        Node nodeA= new Node();
        nodeA.data=4;

        Node nodeB=new Node();
        nodeB.data=3;

        Node nodeC=new Node();
        nodeC.data=7;

        Node nodeD=new Node();
        nodeD.data=7;

        nodeA.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;


        System.out.println(listlength(nodeD));

    }


    public static int listlength(Node anode)
    {
        //{Get the length of the entire linked list
        // for example anode}

        int count=0;
        Node currentnode=anode;
        while(currentnode!=null)
        {
            //System.out.println(anode.next.toString());
            count++;
            currentnode=currentnode.next;
        }

        return count;


    }
}
