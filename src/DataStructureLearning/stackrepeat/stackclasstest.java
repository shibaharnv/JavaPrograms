package DataStructureLearning.stackrepeat;

public class stackclasstest {

    //{Stack is last in first out data structure..
    // insertion deletion at one end called top
    // push pop operations can be performed
    // isempty,isfull,peek,peep methods can be used
    // }

    int top;
    int[] stackarray;
    int maxsize;


    public stackclasstest(int size) {
        this.maxsize = size;
        this.stackarray = new int[size];
        this.top = -1;
    }

    void push(int a) {
        top++;
        stackarray[top] = a;
    }

    int pop() {
        int oldtop = top;
        top--;
        return stackarray[oldtop];

    }

    boolean isEmpty() {

        return top==-1;

    }

    int peek()

    {
        return stackarray[top];
    }

    boolean isFull()
    {
        return maxsize-1==top;
    }

}
