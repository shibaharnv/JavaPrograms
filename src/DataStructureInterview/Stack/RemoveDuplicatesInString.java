package DataStructureInterview.Stack;

import java.util.Stack;

public class RemoveDuplicatesInString {


    //Algorithm
    //{1. Based on the length of the string define a stack array
    // 2.using for loop get the first character and push it to the stack
    // 3.when we push the second element peek get the element/elements from the stack and compare if they are equal .. if they are not equal
    // then push to the stack
    // 4. If they are equal pop it}

        int stackMaxSize=0;
    Stack<Character> sobj;

    public RemoveDuplicatesInString(int size)
    {
        this.sobj= new Stack<Character>();
        this.stackMaxSize=size;
    }

    public static void main(String[] args)
    {
        //input String

        String input = "abcda";

        int stringLength=input.length();

        RemoveDuplicatesInString objmr = new RemoveDuplicatesInString(stringLength);

        objmr.removeDuplicates(input);
    }

     void removeDuplicates(String myinput) {

         for(int i=0;i<myinput.length();i++)
         {
             char c=  myinput.charAt(i);
             sobj.push(c);
         }
         System.out.println(sobj.search('b'));


             for(int i=0;i<myinput.length();i++)
        {
          char c=  myinput.charAt(i);
          sobj.push(c);

          for (int j=1;j<myinput.length();j++)
          {
              char d=  myinput.charAt(j);
               if(d!=sobj.peek())
               {
                   System.out.println(sobj.search(0));
                   sobj.push(d);
               }
               else
               {
                   sobj.pop();
               }
          }
        }

    }
}
