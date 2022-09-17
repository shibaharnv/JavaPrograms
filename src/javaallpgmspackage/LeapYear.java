package javaallpgmspackage;

public class LeapYear {

    public static void main(String[] args)
    {
        int year =1000;

        if(year%4==0)
        {
            System.out.println("Given year " +year+" is leap year");
        }

        else
        {
            System.out.println("Given year " +year+" is NOT a leap year");
        }

    }
}
