package javaallpgmspackage;

public class ArmStrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//What is ARM strong Number 

		
	//A Positive number is called  ARMStrong number if sum of cubes of its digits 
		
		//Eg: 1, 153, 370 ,371 and 407
		
		
		int number = 153 ;
		
		int temp = number;
		
		int remainder; 
		//int dividervalue; 
		
		int finalvalue =0;
		
		
		while(number>0)
		{
			remainder = number%10;
		
			number = number/10;
			
			
			
			 finalvalue = finalvalue + (remainder*remainder*remainder);
			 
			 
		}
	
		/*
		 * while(number>0) { reverse =( reverse *10);
		 * 
		 * reverse= reverse +number %10 ;
		 * 
		 * number= number/10; }
		 */
		
		if(finalvalue==temp)
		{
			System.out.println("Given number "+temp+" is ARM strong number");
		}
		
		
		else
			
		{
			System.out.println("Given number "+temp+" is  NOt ARM strong number");
		}
		
		
	}

	}


