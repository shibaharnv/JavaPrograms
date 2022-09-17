package javainterviewprograms.Strings;

import java.util.TreeSet;

public class StringUniqueCharactersIsogram {

    public static void main(String[] args)
    {
        //Isogram is a string that contains non repeated character

        String word= "codee";//output is false

        char[] wordCharArray=word.toCharArray();

        TreeSet ts= new TreeSet();
        boolean flag=true;
        for(char c :wordCharArray)
        {
            if(ts.add(c))
            {

            }
            else
            {
                flag=false;
                break;
            }
        }

        if(!flag)
        {
            System.out.println("Given string is Not a ISOGram");
        }
        else
        {
            System.out.println("Given string is a ISOGram");
        }

    }


}
