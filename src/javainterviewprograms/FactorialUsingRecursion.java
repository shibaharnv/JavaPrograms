package javainterviewprograms;

public class FactorialUsingRecursion {

    public static void main(String[] args)
    {
        int num=4;

        factorialmethod1(num);
    }

//    private static int factorialmethod1(int num) {
//
//        if(num!=1)
//        {
//            return 1;
//        }
//        else {
//            return num *factorialmethod2(num-1);
//        }
//    }

    private static int factorialmethod2(int num) {

        if(num!=1)
        {
            return 1;
        }
        else {
            return num *factorialmethod1(num-1);
        }
    }

    private static int factorialmethod1(int num) {

        if(num!=1)
        {
            return 1;
        }
        else {
            return num *factorialmethod1(num-1);
        }
    }


}
