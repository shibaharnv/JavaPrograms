package javainterviewprograms.Strings.LeetCode;

import java.util.Arrays;

public class CellsRangeExcelSheet {

    public static void main(String[] args)
    {
        //{Input: s = "A1:F1"
        //Output: ["A1","B1","C1","D1","E1","F1"]
        // Extract the integer value
        // find the range
        // for loop
        // copy A1 and A2}


        String inputString="A1:F1";
        String[] stringArray=inputString.split(":");
        int i=0;
        int[] intArray = new int[2];
        for(String s:stringArray)
        {
            System.out.println(s);
            String number=s.substring(s.length()-1);
            intArray[i]=Integer.parseInt(number);
            i++;
        }

        System.out.println(Arrays.toString(intArray));




    }
}
