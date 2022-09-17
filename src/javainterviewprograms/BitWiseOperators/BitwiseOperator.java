package javainterviewprograms.BitWiseOperators;

public class BitwiseOperator {

    public static void main(String[] args) {
        int a =9;int b=12;
        int c= a &b;
        System.out.println("a & b" +c);
        c= a | b;
        System.out.println("a | b " +c);
        c =a^b;
        System.out.println("a ^ b " +c);
    }
}
