package javaallpgmspackage;

public class LargestOfThreeNumbers {

    public static void main(String[] args)
    {
        int a=10;
        int b=200;
        int c=50;

        if(a>b && a>c)
        {
            System.out.println(+a+ " a is big");
        }
        else if(b>c)
        {
            System.out.println(+b+ " b is big");
        }
        else {
            System.out.println(+c+ " c is big");
        }
    }
}
