package javainterviewprograms;

public class RecursionSumNaturalNumbers {

    public static void main(String[] args)
    {
        int number =3;

       int ans= sumMethod(number);
       System.out.println("Sum of Natural numbers through recursion "+ans );
    }



    public static int sumMethod(int num)
    {

        if(num!=0) {

            System.out.println(num);
          //  int total= num +sumMethod(num-1);
            return num + sumMethod(num - 1);
        }
        else
        {
            System.out.println(num);
            return num;
        }
    }
}
