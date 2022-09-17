package DataStructureInterview.Stack;

import java.util.Stack;

public class RemoveDuplicatesUsingStack {

    //{Declare stack using length of the string
    // using the first loop send the first character inside
    // using the second loop check if the element is presnt inside the stack
    // if the element is present then push if not dont push}

        //int stackSize=0;

    public RemoveDuplicatesUsingStack(int size)
    {

       // this.stackSize=size;

    }

    public Stack<Character> stackDuplicatesRemoval(String myinput) {
        Stack<Character> mystack = new Stack<Character>();

        for(int i=0;i<myinput.length();i++)
        {
            char firstCharacter=myinput.charAt(i);
            mystack.push(firstCharacter);

            for (int j=1;j<myinput.length();j++)
            {
                char secondCharacter=myinput.charAt(j);

                for(int k=0;k<mystack.size();k++)
                {
                   char fromStack= mystack.get(k);

                   if(fromStack!=secondCharacter)
                   {
                       mystack.push(secondCharacter);
                   }
                }

            }

        }


        return mystack;

    }


    public static void main(String[] args)
    {

        String input = "abcda";
        RemoveDuplicatesUsingStack objmr = new RemoveDuplicatesUsingStack(input.length());
        Stack<Character> finalstack=objmr.stackDuplicatesRemoval(input);
        int top=finalstack.size();
        String finalString="";
        while (top>=0)
        {
            finalString=finalString+finalstack.get(top);
            top--;
        }

        System.out.println("final string"+finalString);

    }
}
