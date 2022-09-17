package javainterviewprograms;

public class Reverseanumber {

	public static void main(String[] args) {
		
		
		int number =533;
		
		int no2= number;
		
		int reverse =0;
		
		//logic :
		
		//first get the remainder ie last digit by doing % 10 so that you will get last digit
		
		//divide the number by 10 so the number gets reduced
		
		/*
		 * while(number>0) {
		 * 
		 * reverse = reverse*10+ number %10; //reverse =
		 * 
		 * number = number/10;
		 * 
		 * }
		 */
		//System.out.println(reverse);
		
		
		/*
		 * while(number>0) {
		 * 
		 * reverse = reverse*10 +number %10 ;
		 * 
		 * 
		 * number =number/10;
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(reverse);
		 */
		while(number>0) {
		    reverse =( reverse *10);
		    		
		    reverse=  reverse +number %10 ;
		    
		    number= number/10;
		}  
		
		System.out.println("Reversed number is " +reverse);
		
		if(reverse ==no2)
		{
			System.out.println("The given number is Palindrome");
		}
		       
	}

}
