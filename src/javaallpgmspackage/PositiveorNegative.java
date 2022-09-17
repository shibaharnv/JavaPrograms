package javaallpgmspackage;

public class PositiveorNegative {

    public static void main(String[] args)
    {
        //{Positive or negative number check if it is greater or less than zero}

        int num=-10;

        if(num>=0)
        {
            System.out.println("Given number "+num+" is positive");
        }
        else
        {
            System.out.println("Given number "+num+" is negative");
        }

        char ch='0';

        //if(ch>='A' || 'a'&& ch=='Z'||'z')
         if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))
        {
            System.out.println("Character");
        }

        else
        {
            System.out.println("NOT Character");
        }

    }
}
