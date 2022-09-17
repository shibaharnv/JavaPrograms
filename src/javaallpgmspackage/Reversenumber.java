package javaallpgmspackage;

public class Reversenumber {

	public static void main(String[] args) {

		int n = 123;
		
		
int reverse = 0;

			while (n != 0)

			{
				reverse = reverse * 10;
				reverse = reverse + n % 10;
				n = n / 10; }

System.out.println("Reverse of the number is " + reverse);


	/*	int reverse = 0;

		while(number!=0)
		{

		reverse = reverse*10;

		reverse =number%10;

		reverse= number/10;
		}

		System.out.println("Reversed number is  "+reverse);


		*/
		
		    
		
		// Converting Integer to String and reversing the string
		
		//String convstring = Integer.toString(n);
		/*
		 * String convstring = String.valueOf(123);
		 * 
		 * System.out.println("convstring" +convstring);
		 * System.out.println("convstring class name" +convstring.getClass());
		 * 
		 * String reverseint ="";
		 * 
		 * for(int i=convstring.length()-1;i>=0;i--) { reverseint =reverseint +
		 * convstring.charAt(i);
		 * 
		 * }
		 * 
		 * System.out.println("reverseint" +reverseint);
		 */
	}
	
	
	
	
	
	

}
