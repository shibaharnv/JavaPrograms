package javainterviewprograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberRetesting {

    //{1,2,3,4,5,6,7,8}
    //{Given number is 4 we need to find out the nearest prime number
    // take the first number from array and check if it is prime if yes then calculate the distance between given number and current number}

    public static void main(String[] args) {


        int[] a={1,2,3,4,5};

        System.out.println(primeNumbers(a));


    }

    public static boolean isPrime(int n)
    {

        boolean flag =true;

        if(n<0 )
        {
            return false;
        }

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=false;
            }
        }


        return flag;
    }

    public static Integer[] primeNumbers(int[] a)
    {

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            if(isPrime(a[i]))
            {
                list.add(a[i]);
            }
        }
//
//        Integer[] b= new Integer[list.size()];
//        b= list.toArray(new Integer[0]);
//
        Integer[] b= list.toArray(new Integer[list.size()]);

        System.out.println(Arrays.toString(b));
        return b;

    }
}
