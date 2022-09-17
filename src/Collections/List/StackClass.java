package Collections.List;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args)
    {
        Stack sobj = new Stack();
        sobj.add(10);
        sobj.add(20);
        sobj.add(30);
        sobj.add(40);
        sobj.empty();

        System.out.println(sobj);
        System.out.println("pop"+sobj.pop());
        System.out.println("peek"+sobj.peek());
        System.out.println("distance from top "+sobj.search(30));
        System.out.println("serach "+sobj.search(40));
        sobj.empty();
        System.out.println(sobj);
    }
}
