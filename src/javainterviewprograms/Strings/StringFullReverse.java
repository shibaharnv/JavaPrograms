package javainterviewprograms.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringFullReverse {

    public static void main(String[] args)
    {

        String words="testing";

        StringBuffer sb1 = new StringBuffer(words);
        sb1.reverse();
        System.out.println(sb1);



        String value= "This is test";


        String[] strArray= value.split(" ");

        System.out.println(Arrays.toString(strArray));

        String temp="";

        StringBuffer sbz;
        StringBuffer sbx=new StringBuffer();
        StringBuffer finalsb=new StringBuffer();

        for(int i=0;i<strArray.length;i++)
        {
           temp= strArray[i];
            System.out.println(temp);
            sbz=new StringBuffer(temp);
            sbx=sbz.reverse();
            finalsb.append(sbx);
            finalsb.append(" ");
        }
        System.out.println("finalsb "+finalsb);

       String result= finalsb.toString();
        System.out.println(result);

        String[] strArray2= result.split(" ");
        System.out.println(Arrays.toString(strArray2));

        ArrayList al2= new ArrayList(Arrays.asList(strArray2));

        Collections.reverse(al2);
        System.out.println("ans"+al2);


        StringBuffer kkk= new StringBuffer();
        for(Object g:al2)
        {
          String  f=(String) g;

          kkk.append(f);
            kkk.append(" ");
        }

        System.out.println(kkk);

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
