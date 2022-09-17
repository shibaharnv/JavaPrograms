package javainterviewprograms.Preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTwoIntegersMultiplication {

    public static void main(String[] args) {

    //{Method input : array of integers
        // Output is an array with two numbers
        // ignore the number greater than 20 and negative number
        // Other numbers to ignore 3,6,7,8,9
        // Take the first number
        // 2*10
        // 4*5
        // 1*20
        // 5*4
        // 10*2}


        int[] array ={2,4,1,6,5,40,-1};

        integerMultiplication(array);


    }

    private static void integerMultiplication(int[] inputArr) {

        // removing unwanted numbers

        Integer[] integerArray = new Integer[inputArr.length];
        Arrays.setAll(integerArray,i->inputArr[i]);
        List al = new ArrayList();
        al=Arrays.asList(integerArray);
        System.out.println(al);

        for(Object a :al)
        {
                if(a.equals(6))
                {
                    al.remove(a);
                }
        }

        System.out.println(al);




    }


}
