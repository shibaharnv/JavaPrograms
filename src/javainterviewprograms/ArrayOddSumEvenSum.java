package javainterviewprograms;

public class ArrayOddSumEvenSum {

    public static void main(String[] args) {
        //{If the input array is [1, 2, 3, 4, 5], the script should output:
        //Oddsum: 9 (1 + 3 + 5)
        //Evensum: 6 (2 + 4)
        //If the input array is [10, 15, 20, 25, 30], the script should output:
        //Oddsum: 65 (15 + 25)
        //Evensum: 60 (10 + 20 + 30)}

        //{Input is Array and output is array first element is odd sum and second element is even sum
        // take th array iterater and check if the number returns zero reminder
        // }

        int[] a={1, 2, 3, 4, 5};
        int[]  oddSumEvenSumResult=oddSumEvenSum(a);


    }

    public static int[] oddSumEvenSum(int[] inputArray)


    {

        int evenSum=0;
        int oddSum=0;
        for(int i:inputArray)
        {
            if(i%2==0)
            {
                evenSum=evenSum+i;
            }

            else {
                oddSum=oddSum+i;
            }
        }


        return new int[] {oddSum,evenSum};
    }


}
