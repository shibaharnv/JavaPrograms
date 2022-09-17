package javainterviewprograms;

public class ArrayMissingNumber {

    public static void main(String[] args)
    {
        //{To find the missing number in array there are some conditions
        // 1. Array should not have duplicates
        // 2. Array need not to be in sorted order
        // 3. Values should be in range eg 1 to 5
        // FInd the sum of the array elements and sum of the ranges and substract the two values to get the missing number }

        //int[] a = {1,2,3,4,5,6,8,9,10};

        int[] a = {4,5,7};

        int arrSum=0;
        int rangeSum=0;

        for (int i=0; i<a.length;i++)
        {
            arrSum += a[i];

        }

        for(int j=a[0];j<=a[a.length-1];j++)
        {
            rangeSum+=j;
        }

        System.out.println("arrSum"+arrSum);
        System.out.println("rangeSum"+rangeSum);

        System.out.println("Missing number "+(rangeSum-arrSum));
    }
}
