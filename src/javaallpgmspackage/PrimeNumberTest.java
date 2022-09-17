package javaallpgmspackage;

public class PrimeNumberTest {

    public static void main(String[] args)
    {
        int num=2;

        //two 2 is the lowest prime number

        int remainder;

        remainder =num%2;

        if(remainder!=0)
        {
            System.out.println(" number  "+num+ " is prime");
        }

        else
        {
            System.out.println("Number "+num+" is not Prime");
        }
    }
}
