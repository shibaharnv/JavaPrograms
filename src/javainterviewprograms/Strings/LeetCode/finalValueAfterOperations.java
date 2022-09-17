package javainterviewprograms.Strings.LeetCode;

public class finalValueAfterOperations {

    public static void main(String[] args)
    {

        //{Input: operations = ["--X","X++","X++"]
        //Output: 1
        //Explanation: The operations are performed as follows:
        //Initially, X = 0.
        //--X: X is decremented by 1, X =  0 - 1 = -1.
        //X++: X is incremented by 1, X = -1 + 1 =  0.
        //X++: X is incremented by 1, X =  0 + 1 =  1.}

        String[] myOperations={"X++","++X","--X","X--"};

        int answer=finalValueOperations(myOperations);
        System.out.println(answer);

        //{Logic : if the string contains - decrease the value by 1
        // if the string contains + increase the value by 1
        // x value by default 0}

    }

    static int finalValueOperations(String[] operations)
    {
        int x=0;
        String singleValue;
        for(int i=0; i<operations.length;i++)
        {
             singleValue =operations[i];

             if(singleValue.contains("-"))
             {
                 x=x-1;
             }
             else if(singleValue.contains("+"))
             {
                 x=x+1;
             }
        }

        return x;
    }
}
