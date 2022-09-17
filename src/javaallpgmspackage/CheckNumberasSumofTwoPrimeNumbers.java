package javaallpgmspackage;

public class CheckNumberasSumofTwoPrimeNumbers {


    //{9=2+7
    // 9=3+6
    // 9=4+5}


    public static void main(String[] args)
    {
        int num=11;
        CheckNumberasSumofTwoPrimeNumbers obj = new CheckNumberasSumofTwoPrimeNumbers();
        obj.checkPrimeNumber(num);
            boolean finalresultflag=false;
        for(int i=2;i<=num/2;i++)
        {
          Boolean resultflag= obj.checkPrimeNumber(i);
          Boolean numberresultflag =obj.checkPrimeNumber(num-i);
          if(!resultflag &&!numberresultflag)
          {
              //System.out.println("i value " +i+ " is prime number");
              System.out.println(" "+num+ "= "+i+" + " + (num-i)+" ");
              finalresultflag=true;
          }
        }
        if(finalresultflag)
        {
            System.out.println("Given number "+num+ " can be summation of two prime numbers ");
        }

        else
        {
            System.out.println("Given number "+num+ " cannot be summation of two prime numbers ");
        }
    }


    public boolean checkPrimeNumber(int number)
    {
        boolean primeflag=false;

        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                primeflag=true;
            }
        }

        if(!primeflag)
        {
           // System.out.println("Given number "+number+ " is prime");
        }
        else {
            //System.out.println("Given number "+number+ " is not prime");
        }

        return primeflag;

    }



}
