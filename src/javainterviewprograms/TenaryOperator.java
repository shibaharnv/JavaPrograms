package javainterviewprograms;

public class TenaryOperator {

    public static void main(String[] args)
    {
        // Tenary operator

        int b=10; int c= 20; int d=30;

        int largest1=b>c?b:c;

        int largest3=d>largest1?d:largest1;
        //replacing largest 1 value
        int largest2= d>(b>c?b:c)?d:(b>c?b:c);
        System.out.println("largest number is "+largest2);

    }
}
