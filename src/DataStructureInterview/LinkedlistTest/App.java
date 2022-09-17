package DataStructureInterview.LinkedlistTest;

public class App {

    public static void main(String[] args)
    {
        Node nodeA= new Node();
        nodeA.data=5;

        Node nodeB= new Node();
        nodeB.data=15;

        Node nodeC= new Node();
        nodeC.data=25;

        Node nodeD= new Node();
        nodeD.data=35;

        nodeA.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;


        System.out.println(nodelength(nodeA));
        System.out.println(nodelength(nodeB));


    }


    static int nodelength(Node mynode)
    {
         int lllength=0;

         Node currentnode=mynode;
        //while (mynode.next!=null)
        while(currentnode!=null)
        {
            lllength++;
            currentnode=currentnode.next;
        }

        return lllength;
    }
}
