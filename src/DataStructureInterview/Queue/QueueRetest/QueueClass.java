package DataStructureInterview.Queue.QueueRetest;

public class QueueClass {

    int[] queueArray;
    int qsize;
    int front;
    int rear;


    public QueueClass(int size)
    {
        this.queueArray=new int[size];
        this.qsize=size;
        this.rear=-1;
        int front=0;
    }

    public void insert(int value)
    {
        rear++;
        queueArray[rear]=value;

    }

    public int remove()
    {
    int removedValue;
    removedValue=queueArray[front];
    front++;
    return removedValue;

    }

    public void displayQ()
    {
        for(int i=0;i<queueArray.length;i++)
        {
            System.out.println(queueArray[i]);
        }
    }


    public static void main(String[] args)
    {
        QueueClass qobj = new QueueClass(4);
        qobj.insert(10);
        qobj.insert(20);
        qobj.insert(30);
        qobj.insert(40);
        qobj.displayQ();
        qobj.remove();
        System.out.println("after removal");
        qobj.displayQ();

    }
}
