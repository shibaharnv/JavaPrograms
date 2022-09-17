package javainterviewprograms.Strings;

import java.util.Stack;

public class StringRemoveAdjacentDuplicates {

    public static void main(String[] args)
    {
        String word="caaabbbc";
        //o/p- ca using stack resolve the pblem

        char[] wordCharArray= word.toCharArray();
        Stack<Character> st= new Stack<Character>();

        for(int i=0;i< wordCharArray.length;i++)
        {
            if(st.empty())
            {
                st.push(wordCharArray[i]);
            }
            else
            {
                char topvalue =st.peek();

                if(topvalue==wordCharArray[i])
                {
                    st.pop();
                }
                else
                {
                    st.push(wordCharArray[i]);
                }
            }



        }
        System.out.println(st);
    }
}
