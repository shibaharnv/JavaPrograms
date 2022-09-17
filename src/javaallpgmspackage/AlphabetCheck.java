package javaallpgmspackage;

public class AlphabetCheck {

    public static void main(String[] args)
    {
        char c ='c';


        if(( c>='a') && (c<='z') || (c>='A') && (c<='Z'))
        {
            System.out.println("Given character "+c+" is an alphabet");
        }

        else
        {
            System.out.println("Given character "+c+" is   NOT an alphabet");
        }


    }
}
