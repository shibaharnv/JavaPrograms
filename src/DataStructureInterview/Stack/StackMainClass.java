package DataStructureInterview.Stack;

public class StackMainClass {

    public static void main(String[] args)
    {
        StackClass obj = new StackClass(4);

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);

//        int popedvalue= obj.pop();
//        System.out.println("popedvalue "+popedvalue);



        //remove all the elements using pop so when the stack is empty stop poping

        while(!obj.isEmpty())
        {
            int newpopedvalue =obj.pop();

            System.out.println("newpopedvalue "+newpopedvalue);
        }

        // Try to pop an empty stack

            int emptypopvalue=  obj.pop();
            System.out.println(emptypopvalue);




    }
}
