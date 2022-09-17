package DataStructureInterview.Queue;

public class Queueclass {


    int maxsize;
    long[] queuearray;
    int front;
    int rear;
    int nitems;

    public Queueclass(int size)
    {
        this.maxsize= size;
        this.queuearray =new long[size];
        this.front=0;
        this.rear=-1;
        this.nitems=0;
    }


    public void insert(int element)
    {
        rear++;
        queuearray[rear]=element;
        nitems++;
    }


    public long remove()
    {
        long removedvalue;
        removedvalue = queuearray[front];
        front++;
        nitems--;
        return removedvalue;
    }




    public void show()
    {
        System.out.println("[ ");

        for (int i=0;i<queuearray.length;i++)
        {


            System.out.println(queuearray[i]+ " ");

        }
        System.out.println(" ]");
    }

}
