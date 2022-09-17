package javainterviewprograms.Preparation;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayTwoIntegersMultiplicationFinalFull {

    public static void main(String[] args) {

        int[] array ={1,3,7,4,5,8,10};
        System.out.println(array.length);

        boolean resultArray=integerMultiplication(array,15);

        System.out.println(resultArray);


    }

    private static boolean integerMultiplication(int[] inputArr,int value) {

        HashSet<Integer> s= new HashSet<>();

        for(int i=0;i<inputArr.length;i++)
        {
            if(value%inputArr[i]==0 && s.contains(value/inputArr[i]))
            {
                return true;
            }
            s.add(inputArr[i]);

        }

        return false;

    }




}
