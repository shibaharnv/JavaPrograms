package javaallpgmspackage;

public class Fibinocciseries {

    public static void main(String[] args)
    {
        int first=0;
        int second=1;
        int sum= 0;
        int temp=0;


        int i=0;
        while(i<10)
        {
            sum =first+second;
            first=second;
            second=sum;
            System.out.println("Sum "+sum);
            i++;
        }
    }
}
