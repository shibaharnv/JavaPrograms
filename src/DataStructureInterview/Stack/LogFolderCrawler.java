package DataStructureInterview.Stack;

import java.util.Stack;

public class LogFolderCrawler {

    //{Problem definition The Leetcode file system keeps a log each time some user performs a change folder operation.
    //
    //The operations are described below:
    //
    //"../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
    //"./" : Remain in the same folder.
    //"x/" : Move to the child folder named x (This folder is guaranteed to always exist).
    //You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
    //
    //The file system starts in the main folder, then the operations in logs are performed.
    //
    //Return the minimum number of operations needed to go back to the main folder after the change folder operations.
    // Input: logs = ["d1/","d2/","../","d21/","./"]
    //Output: 2
    //Explanation: Use this change folder operation "../" 2 times and go back to the main folder.}


    //{Steps to solve :
    // input string of array with special characters
    // with the string arraylength create a for loop
    // Create a stack and push a string main in the zeorth position
    // if the stringarray value is x/ then add it to stack
    // if the stringarray value is ../ then pop
    // if the string array value is ./ don't do anything
    // finally stack length -1 is the number of time we need to move to reach the main folder}
    public static void main(String[] args)
    {
       // String[] input= {"x/","x/","../","x/","./"};

        //String[] input= {"x/","x/","../","x/","./"};


        String[] input=  {"d1/","d2/","./","d3/","../","d31/"};


        int ans= minOperations(input);
        System.out.println("answer "+ans);


    }


    public static int minOperations(String[] logs) {

        //int count = 0;
        Stack<String> stackobj = new  Stack<String>();
        stackobj.push("main");

        for(int i=0;i<logs.length;i++)
        {

            String value =logs[i];

            if(value.contains("d"))
            {
                stackobj.push(value);
            }
            else if (value=="./")
            {
                System.out.println("do nothing");
            }

            else if (value=="../")
            {
                stackobj.pop();
            }
        }

           int count=stackobj.size()-1;




        return count;
    }



}
