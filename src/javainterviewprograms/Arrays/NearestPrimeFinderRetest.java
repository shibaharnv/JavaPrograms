package javainterviewprograms.Arrays;

public class NearestPrimeFinderRetest {

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the nearest prime number in the array
    public static int findNearestPrime(int[] arr, int target) {



        int minDiff=Integer.MAX_VALUE;
        int nearestPrime=0;

        for(int current:arr)
        {

            if(isPrime(current))
            {          int diff=Math.abs(target-current);

                if(diff<minDiff)
                {
                    minDiff=diff;
                    nearestPrime=current;
                }

            }


        }

        return nearestPrime;

    }

    public static void main(String[] args) {
        int[] numbers = { 4, 7, 11, 16, 23, 29, 34 }; // Example array of numbers
        int target = 16; // Example target number

        int nearestPrime = findNearestPrime(numbers, target);

        System.out.println("Nearest prime number to " + target + " is: " + nearestPrime);
    }
}
