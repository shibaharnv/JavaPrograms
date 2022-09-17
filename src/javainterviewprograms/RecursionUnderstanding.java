package javainterviewprograms;

import java.util.LinkedList;

public class RecursionUnderstanding {

    public static void main(String[] args)
    {
        reduceByOne(5);

    }

    public static void reduceByOne(int num) {
        if(num>=0) {
            reduceByOne(num - 1);
        }
        System.out.println("Completed call "+num);
    }



}
