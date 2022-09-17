package DataStructureLearning;

import java.util.Arrays;

public class StackMainClass {


    public static void main(String[] args)
    {
        StackClass obj = new StackClass(5);

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);

        System.out.println(Arrays.toString(obj.stackArray));


        while(!obj.isEmpty())
        {
             long removedvalue=   obj.pop();
            System.out.println("removedvalue" +removedvalue);

        }



    }
}
