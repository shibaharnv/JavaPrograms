package javainterviewprograms;

public class FibinocciSeries {

    public static void main(String[] args)
    {
        //{WAP to find the fibinocci series of number 10
        // 0 1 1 2 3}

        int n1=0;
        int n2=1;
        int sum=0;
        System.out.print(n1+" " +""+n2);
        for(int i=2;i<=5;i++)
        {
            sum=n1+n2;
            System.out.print( " "+sum);
            n1=n2;
            n2=sum;

        }
    }
}
