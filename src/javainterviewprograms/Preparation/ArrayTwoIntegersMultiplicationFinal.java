package javainterviewprograms.Preparation;

import java.util.Arrays;

public class ArrayTwoIntegersMultiplicationFinal {

    public static void main(String[] args) {

        int[] array ={1,3,7,4,5,8,10};
        System.out.println(array.length);

        int[] resultArray=integerMultiplication(array);

        System.out.println(Arrays.toString(resultArray));


    }

    private static int[] integerMultiplication(int[] inputArr) {

        Arrays.sort(inputArr);

        int start=0;
        int end =inputArr.length-1;

        int expectedValue=30;
        int actualValue=0;

        int firstNumber=0;
        int secondNumber=0;

        int[] outputArray= new int[2];

        for(int i=0;i<inputArr.length;i++)
        {

            actualValue=inputArr[start]*inputArr[end];

            if(actualValue<expectedValue)
            {
                start++;
            }

            else if(actualValue>expectedValue)
            {
                end--;
            }

            else

            {
                firstNumber=inputArr[start];
                secondNumber=inputArr[end];

                outputArray[0]=firstNumber;
                outputArray[1]=secondNumber;

            }

        }

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        return outputArray;
    }




}
