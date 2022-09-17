package javainterviewprograms.Strings.LeetCode;

import java.util.Arrays;

public class ShuffleStringIndices {

    public static void main(String[] args)
    {
        //{Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        //Output: "leetcode"
        //Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
        //Example 2:
        //
        //Input: s = "abc", indices = [0,1,2]
        //Output: "abc"
        //Explanation: After shuffling, each character remains in its position.}

        String s="codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        String answer =shuffleString(s,indices);

        System.out.println(answer);

        //{Logic:
        // no of character in the String is equal to integer}
    }

    public static String shuffleString(String s,int[] indices )
    {

        char[] newCharArray= new char[s.length()];
        int position;

        char[] stringCharArray=s.toCharArray();

        for(int i=0;i<indices.length;i++)
        {
            position=indices[i];
            newCharArray[position]=stringCharArray[i];
        }

        String newString =new String(newCharArray);
        return newString;
        
    }
}
