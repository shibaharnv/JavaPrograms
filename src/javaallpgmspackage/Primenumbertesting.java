package javaallpgmspackage;

import java.util.Scanner;

public class Primenumbertesting {

	
	public static void main(String[] args) {

		
		Scanner scanobj = new Scanner(System.in);
		
		int inputvalue = scanobj.nextInt();
		
		int flag=0;
		
		
		System.out.println("Value enter by the user is "+inputvalue);
		
		
		//SIMPLE METHOD
		
/*		if(inputvalue%2==0)
		{
			System.out.println(""+inputvalue+" is NOT  prime number");
		}
		
		else
		{
			System.out.println(""+inputvalue+" is  a prime number");
		}
		*/
		
		//USING FOR LOOP
		
		for(int i=2; i<=inputvalue/2;  i++)
		{
			
			if(inputvalue%i==0)
			{
				flag =1;
				break;
			}
			
		}
		
		if(flag==1)
		{
			System.out.println(""+inputvalue+" is not a prime number");
		}
		
		else
		{
			System.out.println(""+inputvalue+" is  a prime number");
		}
		
		
		
		
		
		
		
/*		Scanner scanobj = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		int number = scanobj.nextInt();
		
		System.out.println("Entered value is " +number);
		
		
		int flag  =0 ;

		
		int i;
		
		
		
		for(i=2;i<=number/2;i++)
		{
			if(number%i==0)
				
			{
				flag =1;
				break;
			}
			}
		
		
		
		if(flag ==0)
			{
			System.out.println("Given number "+number+" is  a prime number  ");
			}
		else
		{
			System.out.println("Given number "+number+" is NOT a prime number  ");
		}
		
		
		int remaiander1;
		
		int remaiander2;
		
		remaiander1 =inputvalue%1 ;
		
		remaiander2= inputvalue%inputvalue;
		
	if(remaiander1==0 &&remaiander2==0)
	{
		System.out.println("Entered number "+inputvalue+" is a prime number ");
	}
	
	else
	{
		System.out.println("Entered number "+inputvalue+" is a Not prime number ");
	}
			
		
		

        int num = 13;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
		
		
		
		*/
		
		

	}

}
