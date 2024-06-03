package javainterviewprograms.Strings;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {

        String input= "Hello World";

       // Sample Output: "World Hello"

        String[] s=input.split("\\s");

        System.out.println(Arrays.toString(s));

        String result="";

        for(int i=s.length-1;i>=0;i--)
        {
            result=result+s[i];
            if(i!=0)
            {
                result=result+" ";
            }

        }

        System.out.println(result);

    }
}
