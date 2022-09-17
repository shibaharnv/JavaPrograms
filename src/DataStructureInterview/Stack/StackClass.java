package DataStructureInterview.Stack;

import java.util.Arrays;

public class StackClass {

    int[] stackArray;
    int maxSize;
    int top;

    public StackClass(int size)
    {
        this.maxSize=size;
        this.stackArray= new int[maxSize];
        this.top=-1;

        System.out.println("From Constructor -- > " +Arrays.toString(stackArray));
    }

    void push(int pushvalue)
    {
        if(isFull()) {
            System.out.println("Stack is already full cannot add the element "+ pushvalue+ " to the stack");;
        }
        else {
            top++;
            stackArray[top] = pushvalue;
            System.out.println("After pushing the value -- > " + Arrays.toString(stackArray));
        }
    }


    int pop()
    {
        if(isEmpty()) {
            System.out.println("Stack is already empty");
            return -1;

        }

        else {
            int popvalue;
            popvalue = stackArray[top];
            top--;
            return popvalue;
        }
    }


    int peek()
    {
        return stackArray[top];
    }

    boolean isEmpty()
    {
        return top==-1;
    }


    boolean isFull()
    {
        return maxSize-1==top;
    }

}
