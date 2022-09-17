package javainterviewprograms;

public class Factorial {

    public static void main(String[] args) {
        int givenNumber = 6;
        int fact=1;
        for(int i=1;i<=givenNumber;i++)
        {
          fact= fact*i;
        }

        System.out.println(fact);
    }
}
