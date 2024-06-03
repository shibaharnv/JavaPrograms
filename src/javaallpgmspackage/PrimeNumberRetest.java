package javaallpgmspackage;

public class PrimeNumberRetest {


    public static void main(String[] args) {

        int number = 17; // Example number to check for primality

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        //print prime numbers in 1 to 10


        range(1,10);
    }


    private static void range (int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

           //  Method to check if a number is prime
            public static boolean isPrime(int num) {

                if(num<=1)
                    {return false;}

                for(int i=2;i<num;i++)
                {
                    if(num%2==0)
                    {
                        return false;
                    }
                }
                return true;



            }



    // Method to check if a number is prime
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }


    }
