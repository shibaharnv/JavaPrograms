package javainterviewprograms.Arrays;

import java.util.*;

public class ArrayNeonCompanyRetest {

    public static StringBuilder findPairs(int[] arr) {

        //{Take the first element as target
        // take first number from the array substract it with taret and store that number as temp
        // add the seennumber to a ist
        // take Second number from the array substract it with tarett and store that number as temp}
        //// add the seennumber to a ist
        //if the subalue is present in th list then add currentnum and subvale

        int target=arr[0];

        List<Integer> list= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        //{7, 3, 5, 2, -4, 8, 11};
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            int subval=target-num;

            if(list.contains(subval))
            {
                if(sb.length()>0)
                {
                    sb.append(" ");
                }
                sb.append(num).append(",").append(subval);
            }




            list.add(num);



        }


        return sb;

    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 5, 2, -4, 8, 11};
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + findPairs(arr1)); // Should print "5,2 -4,11"


    }
}
