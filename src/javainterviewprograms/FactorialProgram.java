package javainterviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialProgram {

    public static void main(String[] args)
    {
        //{Factorical program
        // 3!= 3*2*1
        // a[length]*a[]}
        //3 factorial
        int number =25;

        ArrayList<Integer> aobj = new ArrayList<Integer>();

        for(int j=1;j<number+1;j++)
        {
            aobj.add(j);
        }

        System.out.println("After adding"+Arrays.toString(aobj.toArray()));

        int value=1;

      //  int[] a= {4,3,2,1};

        for(int i=aobj.size()-1;i>=0;i--)
        {
            value= aobj.get(i) * value;
        }

        System.out.println("Factorial of "+number+" is "+value);
    }

}
