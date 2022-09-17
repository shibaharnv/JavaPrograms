package javainterviewprograms.Strings;

import java.util.Arrays;

public class StringFullReverse {

    public static void main(String[] args)
    {
        String value= "This is test";
        //o/p "tset is siht"

        //{Store in string array
        // using for reverse loop take the element and reverse using string buffer
        // add or concatenate}

        String[] valueArray = value.split(" ");

        System.out.println(Arrays.toString(valueArray));

        System.out.println("Value array length "+valueArray.length);

        String reverse="";

        for(int i= valueArray.length-1;i>=0;i--)
        {
            String singleValue =valueArray[i];

            StringBuffer sb = new StringBuffer(singleValue);
            sb.reverse();

            reverse=reverse+sb.toString()+" ";
        }

        System.out.println(reverse);
    }
}
