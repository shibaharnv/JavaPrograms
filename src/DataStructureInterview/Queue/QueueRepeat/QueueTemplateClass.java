package DataStructureInterview.Queue.QueueRepeat;

public class QueueTemplateClass {

    int rear;
    int front;
    int[] queueArray;
    int qMaxSize;
    int nitems;

    public QueueTemplateClass(int size)
    {
        this.queueArray =new int[size];
        this.rear=-1;
        this.front=0;
        this.qMaxSize=size;
        this.nitems=0;
    }

    void insert(int value)
    {
       if(isFull())
       {
           System.out.println("Queue is already full");
           rear=-1;
       }

       else {

           rear++;
           queueArray[rear] = value;
           nitems++;
       }
    }

    boolean isFull()
    {
        return rear==qMaxSize-1;
    }

    boolean isEmpty()
    {
        return nitems==0;
    }

    void viewQ()
    {
        System.out.print("[");
        for(int i=0; i<queueArray.length;i++)
        {
            System.out.print(queueArray[i] +" ");
        }
        System.out.print("]");
    }

    int remove()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            front=0;
            return 0;
        }
        else {

            int removeValue = queueArray[front];
            front++;
            nitems--;

            return removeValue;
        }
    }


    public static void main(String[] args)
    {

        QueueTemplateClass qobj= new QueueTemplateClass(5);
//        qobj.insert(10);
//        qobj.insert(20);
//        qobj.insert(30);
//        qobj.insert(40);
//        qobj.insert(50);
//        qobj.insert(60);
//        qobj.viewQ();
//        System.out.println(qobj.remove());
//        System.out.println(qobj.remove());
//        System.out.println(qobj.remove());
//        System.out.println(qobj.remove());
//        System.out.println(qobj.remove());
//        System.out.println(qobj.remove());

        for(int i=0; i<= qobj.qMaxSize;i++)
        {
           qobj.insert(i);
        }
        qobj.viewQ();
        qobj.remove();

        System.out.println("After removal");
        qobj.insert(555);
        qobj.viewQ();

//        for (int j=0; j<=qobj.qMaxSize;j++)
//        {
//            System.out.println(qobj.remove());
//        }




    }
}
