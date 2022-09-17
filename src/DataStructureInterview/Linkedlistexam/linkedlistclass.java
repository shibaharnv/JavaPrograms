package DataStructureInterview.Linkedlistexam;

public class linkedlistclass {
    private Node first;

    public linkedlistclass()
    {

    }
    public void addNode(int mydata)
    {
        Node newnode =new Node();
        newnode.data=mydata;
        newnode.next=first;
        first=newnode;
    }

    public void displaynodes()
    {
        Node currentnode = first;

        while(currentnode!=null)
        {
            System.out.println(currentnode.data);
            currentnode= currentnode.next;

        }
    }

    public int countNodes()
    {
        Node currentnode = first;
        int count=0;
        while(currentnode!=null)
        {
            count+=1;
            currentnode= currentnode.next;


        }
        return count;
    }

}
