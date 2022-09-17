package javaallpgmspackage;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		//Prime number condition 
		
		//Given number should be divisible by 1 or itself
		
		// what to check - given number is divisible by 2 ,3,....n-1
		
		
			Scanner scanobj = new Scanner(System.in);
		
			System.out.println("Enter the number ");
		
			int inputnumber = scanobj.nextInt();
			
			int i=2;
			
			boolean prime= true;
			
	while(i<inputnumber)	
		
			if(inputnumber%i==0)
			{
				System.out.println("Given number "+inputnumber+" is not prime");
				
				prime= false;
				
				i++;
			}
	
	if(prime=true)
	{
		System.out.println("Given number "+inputnumber+" is  prime");
	}
			
		
		
/*		int flag =0;
		
		Scanner scanobj = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		int inputnumber = scanobj.nextInt();
		
		System.out.println("Entered nuber is " +inputnumber);
		
		int remainder;
		
		remainder=	inputnumber%2;
		
		
		if(inputnumber==0 ||inputnumber==1)
		{
			System.out.println("The given number "+inputnumber +" is a prime number");
			
		}
		
		
		else {
			
			for(int i=2; i<=remainder;i++)
			{
				if(inputnumber%i==0)
				{
					System.out.println("Given number "+inputnumber+" is not a prime number");
					flag=1;
					 break; 
				}
				
				  if(flag==0)  { System.out.println("Given number "+inputnumber+" is  a prime number"); }  
			  }
			}
			
		
		
		*/
		
		
		
		
		
		/*
		 * int i,remainder=0,flag=0; int n=2;//it is the number to be checked
		 * remainder=n/2;
		 * 
		 * if(n==0||n==1){ System.out.println(n+" is not prime number"); } else{
		 * 
		 * for(i=2;i<=remainder;i++){
		 * 
		 * if(n%i==0){ System.out.println(n+" is not prime number"); flag=1; break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * if(flag==0) { System.out.println(n+" is prime number"); } }//end of else
		 */		}    
			 
			
			
			
			/*
			 * int remainder =inputnumber%2;
			 * 
			 * if(remainder==1) { System.out.println("This is prime number"); }
			 * 
			 * else { System.out.println("This is NOT prime number"); }
			 */
			
		}
			
		
		
		
	/*	else
		{
			int remainder =inputnumber%2;
			
			
		}
		
	int remainder =inputnumber%2;
	
	if (remainder==1)
	{
		System.out.println("The given number "+inputnumber +" is a prime number");
	}
	
	else
	{
		System.out.println("The given number "+inputnumber +" is a NOT prime number");
	}
		
	}*/
		
/*		int remainder= inputnumber%2;
		
		System.out.println("Remainder is " +remainder);
		
		
		if(inputnumber==0 ||inputnumber23==1)
		{
			System.out.println("Entered number is "+inputnumber+" NOT a Prime number");
			
			1
			
		}
		
		else
		{
		
		
		if(remainder==0)
		{
			System.out.println("Enter number "+inputnumber+" is a NOT prime number");
			
		}
		
		else
		{
			System.out.println("Entered number "+inputnumber+" is a PRIME Number");
		}


	}
	}*/


