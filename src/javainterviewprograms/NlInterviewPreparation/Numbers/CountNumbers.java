package javainterviewprograms.NlInterviewPreparation.Numbers;

import java.util.Scanner;

public class CountNumbers {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Entered number is "+number);

        String numberString =String.valueOf(number);

        System.out.println(numberString.getClass());

        char[] charString=numberString.toCharArray();
        System.out.println("number of digits" +numberString.length());
    }
}
