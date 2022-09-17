package javaallpgmspackage;

import java.util.ArrayList;
import java.util.List;

public class PrimenumberBetweenTwoNumbers {

    public static void main(String[] args)
    {
        int low =20;
        int high=50;
        int num = 14;
        int remainder=0;


        List<Integer> aobj = new ArrayList<Integer>();

/*        for(int i =20;i<=50;i++)
        {
            num2 = i/2;
            remainder=num2%2;

            if(remainder!=0)
            {

            }
            */


        while(low<=high)
        {
            boolean flag = false;
            for(int i=2;i<low/2;i++)
            {
                if(low%i==0)
                {
                   flag=true;
                   break;

                }
            }

            if (!flag)
            {
                System.out.println(low +" ");
            }


            low++;
        }


/*        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=true;
            }
        }

        if(!flag)
        {
            System.out.println("Given number "+num+" is prime");
        }

        else
        {
            System.out.println("Given number "+num+" is NOT prime");
        }*/
    }
}
