package javainterviewprograms;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumber {

    public static void main(String[] args)
    {

        // Random Number - Integer based on the number of zero we get the digits
        Random ra= new Random();

        int randomNumber =ra.nextInt(1000000);

        System.out.println(randomNumber);

        // Random decimal number generation from 0.0 to 1.0
        double decimal =ra.nextDouble();

        System.out.println(decimal);

        Random robj = new Random();
        int ranno =robj.nextInt(1000);

        System.out.println("ranno"+ranno);

    }
}
