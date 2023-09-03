package DataStructureInterview.Stack.Retest;

public class StackClass2 {

    //{Mainly stack is the ordered list where insertion and deletion can be done only at one end top
    // if stack is empty top value is -1 is stack is full stack value is max size -1
    // Contains methods push, pop ,peek}

    int[] stackArray;
    int top;
     int maxSize;

     public StackClass2(int maxSize)
     {
         this.top=-1;
         this.maxSize=maxSize;
         this.stackArray= new int[maxSize];
     }

    public boolean isFull()
    {
        return maxSize-1==top;
    }

    public boolean isEmpty()
    {
        return top==-1;
    }

    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack is already full");
        }
        else {
            top++;
            stackArray[top]=value;
        }

    }

    public int pop()
    {

        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        else {
            int popValue;
            popValue=   stackArray[top];
            top--;
            return popValue;
        }

    }

    public int peek()
    {
        int peekValue=   stackArray[top];
        return peekValue;
    }























}



//    int top;
//    int[] stackArray;
//
//    int maxSize;
//
//    public StackClass2(int maxSize)
//    {
//        this.maxSize=maxSize;
//        this.top=-1;
//        this.stackArray= new int[maxSize];
//    }
//
//    public void push(int value)
//    {
//
//        if(isFull())
//        {
//            System.out.println("Stack is already full");
//        }
//        else {
//            top++;
//            stackArray[top]=value;
//        }
//
//    }
//
//    public int pop()
//    {
//
//        if(isEmpty())
//        {
//            System.out.println("Stack is empty");
//            return -1;
//        }
//        else {
//            int popValue=stackArray[top];
//            top--;
//            return popValue;
//        }
//
//
//    }
//
//    public int peek(){
//        int peekValue=stackArray[top];
//        return peekValue;
//    }
//
//    public boolean isEmpty()
//    {
//        return top==-1;
//    }
//
//    public boolean isFull()
//    {
//        return stackArray[maxSize-1]==top;
//    }
//}
