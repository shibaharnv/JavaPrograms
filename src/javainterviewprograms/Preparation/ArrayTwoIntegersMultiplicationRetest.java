package javainterviewprograms.Preparation;

import java.util.HashSet;

public class ArrayTwoIntegersMultiplicationRetest {

    public static void main(String[] args) {

        int[] array ={1,3,4,5,8,10};

        //{Set pointers start and end
        // iterate with the array length
        // a[Start]*a[end]<result --->Increase start
        // a[Start]*a[end]>resut----->Decrease end
        // if equal store a[Start ] a[end]}

        int start=0;
        int end=array.length-1;
        int multiplicationvalue=0;

        int firstValue=0;
        int secondValue=0;

        int resultValue=40;

        for(int i =0;i< array.length;i++)
        {
            multiplicationvalue=array[start]*array[end];
            if(multiplicationvalue<resultValue)
            {
                start++;
            }

            else if(multiplicationvalue>resultValue)
            {
                end--;
            }

            else if(multiplicationvalue==resultValue)
            {
                firstValue=array[start];
                secondValue=array[end];

            }

        }

        System.out.println("Two numbers are "+firstValue+" and "+secondValue);



    }





}
