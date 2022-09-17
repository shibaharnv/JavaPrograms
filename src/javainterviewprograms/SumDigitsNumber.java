package javainterviewprograms;

public class SumDigitsNumber {

    public static void main(String[] args)
    {
        int num=12345;
        int temp=0;
        int finalValue=0;

        while(num!=0)
        {
            temp=(temp)+num%10;
            num=num/10;
        }

        System.out.println("Total value is "+temp);
    }
}
