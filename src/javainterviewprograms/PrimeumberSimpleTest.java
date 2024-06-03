package javainterviewprograms;

public class PrimeumberSimpleTest {

    public static void main(String[] args) {


        int givenNumber=6;

        primeCheck(givenNumber);

        int[] a={2, 3, 5, 6, 7, 11, 13, 15, 17, 19, 23}
                ;

        for(int number:a)
        {
            if(primeCheck(number))
            {
                System.out.println("Prime Number"+number);
            }
        }


    }

    public static boolean primeCheck(int givenNumber)
    {
        boolean flag=true;

        for(int i=2;i<givenNumber;i++)
        {
            if(givenNumber%i==0)
            {
                flag=false;
            }
        }

        if(flag)
        {
          //  System.out.println("Prime");
        }
        else {
           // System.out.println("Not prime");
        }

        return flag;
    }
}
