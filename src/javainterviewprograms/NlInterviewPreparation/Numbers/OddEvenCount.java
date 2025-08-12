package javainterviewprograms.NlInterviewPreparation.Numbers;

public class OddEvenCount {

    public static void main(String[] args) {

        //{Input is integer and output is integer
        // if the given number is 123 output is oddcount is 2 and evencount is 1
        // 123 get the remainder by doing%10 so we get 3 and check if the number is odd or even (num%2==0) increase even count else odd count
        // divide the number by 10 so one number will be cut off}

        int number=10;
        int remainder=0;
        int evenCount=0;
        int oddCount=0;

        while (number!=0)
        {
            remainder= number%10;

            if(remainder%2==0)
            {
                evenCount++;
            }
            else {
                oddCount++;
            }
            number=number/10;
        }

        System.out.println("oddCount "+oddCount);
        System.out.println("oddCount "+evenCount);
    }
}
