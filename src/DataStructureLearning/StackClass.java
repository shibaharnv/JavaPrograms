package DataStructureLearning;

import java.util.Arrays;

// Stack implemetation using array

public class StackClass {

    long[] stackArray;

    int maxsize;

    int top;



    // Top is always -1 when the stack is empty when we place a a item then index value will be zero

    public StackClass(int size)
    {
        this.maxsize=size;
        this.stackArray= new long[maxsize];
        this.top=-1;
        System.out.println(maxsize);
        System.out.println();
        System.out.println(top);

    }



    void push(int newvalue)
    {
        top++;
        stackArray[top]=newvalue;
//        System.out.println(top);
//        System.out.println(stackArray[top]);
//        System.out.println(Arrays.toString(stackArray));
    }

     long pop()
    {

        // When we call the method Pop first element should be returned

        int oldtop=top;
        top--;
       // System.out.println("Poped element is "+stackArray[oldtop]);
        return stackArray[oldtop];


    }


    boolean isEmpty()
    {
        return top==-1;
    }

    long peak()
    {
        return stackArray[top];
    }

    boolean isFull()
    {
        return maxsize-1==top;
    }
}
