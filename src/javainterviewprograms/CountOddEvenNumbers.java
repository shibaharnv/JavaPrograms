package javainterviewprograms;

public class CountOddEvenNumbers {

    public static void main(String[] args)
    {
        int num =145678;
        int remainder=0;
        int oddCount=0;
        int evenCount=0;
        while (num!=0)
        {
            remainder=num%2;

            if(remainder==1)
            {
                oddCount++;
            }

            if (remainder==0)
            {
                evenCount++;
            }

            num=num/10;
        }

        System.out.println("No of odd digits  "+oddCount+" and No of even digits "+evenCount);
    }
}
