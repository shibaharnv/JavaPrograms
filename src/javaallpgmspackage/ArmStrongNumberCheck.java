package javaallpgmspackage;

public class ArmStrongNumberCheck {

    public static void main(String[] args)
    {
        int num = 1634;
        int finalnum=num;
        int exp=3;
        int remainder=0;
        double sum=0;
// In program 1/10 is zero

        while (num!=0)
        {
            remainder =num%10;
            num =num/10;
            sum =sum + Math.pow(remainder,exp);
        }

        if(finalnum==sum)
        {
            System.out.println("Given number " +finalnum+ " is an ArmStrong Number");
        }

        else
        {
            System.out.println("Given number " +finalnum+ " is NOT an ArmStrong Number");
        }
    }
}
