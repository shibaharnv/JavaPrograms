package DataStructureInterview.Stack.Retest;

import java.util.Arrays;

public class StackMainClass2 {

    public static void main(String[] args) {

        StackClass2 sobj = new StackClass2(5);
        System.out.println(Arrays.toString(sobj.stackArray));
        sobj.push(10);
        System.out.println(Arrays.toString(sobj.stackArray));
        sobj.push(20);
        System.out.println(Arrays.toString(sobj.stackArray));
        sobj.push(30);
        sobj.push(40);
        sobj.push(50);

        System.out.println(Arrays.toString(sobj.stackArray));

        // Remove all the elements from the stack stop it when it is empty
        // Stack will be empty

        while (!sobj.isEmpty())
        {
            int popValue=sobj.pop();
            System.out.println(popValue);
            System.out.println(sobj);
           // System.out.println(Arrays.toString(sobj.stackArray));
        }
      ///Dont print stack array
        System.out.println("After all pop "+sobj);
    }
}
