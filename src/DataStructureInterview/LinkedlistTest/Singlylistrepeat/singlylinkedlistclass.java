package DataStructureInterview.LinkedlistTest.Singlylistrepeat;

public class singlylinkedlistclass {

    private Node first;


    public singlylinkedlistclass()
        {

        }

    public void insertNodeFirst(int data)
    {
        Node newnode =new Node();
        newnode.data=data;
        newnode.next=first;
        first=newnode;

    }

    public void displayNodes()
    {

       Node currentnode=first;
        while (currentnode!=null)
        {
            System.out.println(currentnode.data);
            currentnode=currentnode.next;
        }


    }

}
