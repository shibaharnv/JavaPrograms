package javaallpgmspackage;

public class PalindromeTestNumber {

    public static void main(String[] args)
    {
        int num=1331;
        int rev=0;
        int remainder=0;
        int actualnumber=num;
        while(num!=0)
        {
            remainder = num%10;
            rev = (rev*10) +remainder;
            num = num/10;

        }
        System.out.println("After reversal "+rev);
        if(actualnumber==rev)
        {
            System.out.println("Given number is Palindrome");
        }
        else
        {
            System.out.println("Given number is NOT Palindrome");
        }
    }
}
