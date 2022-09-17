package javaallpgmspackage;

public class FactorsOfNumber {

    public static void main(String[] args)
    {
        //Factors means if we take number 10-- >1,2,5 and 10 are the factors of 10 .. beacuse they can divide 10 without remainder


        int num=25;
        int i=1;
        while(i<=num)
        {
            if(num%i==0)
            {
                System.out.print (i +" ");
            }
            i++;
        }
    }
}
