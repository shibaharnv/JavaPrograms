package javainterviewprograms;

public class StackClass {

    // Stack

    //Push,pop,peepk,isempty

    int[] intArray;

    //int[] intArray= new intArray[];

    int top=-1;


    public StackClass(int[] intArray, int top) {
        //this.intArray=new in
        this.top = top;

    }

    //Push{if the stack is empty top =-1,top ++}

    public void push(int a) {
        // top++;
  //if the stack is full the print stack is full

  //

        //if stack is empty then top++ and push that to
        // top++;
            intArray[top] = a;


    }


    public static void main(String[] args) {

        int[] a={1,2,3};

        int top=-1;
        StackClass sobj = new StackClass(a,top);
        sobj.push(10);
        sobj.push(20);


    }
}