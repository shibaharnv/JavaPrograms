package javaallpgmspackage;

import java.util.Scanner;

public class PalindromeIntegercheck {

	public static void main(String[] args) {
		

		Scanner scanobj = new Scanner(System.in);
		
		int integer =scanobj.nextInt();
		
		int value=integer;
		
		
		int reverse = 0;
		
		while (value!=0)
		{
			reverse = reverse*10;
			
			reverse = reverse + value%10;
			
			value=value/10;
		}
		
		System.out.println("Number after reversing " +reverse);
		
		if(integer==reverse)
		{
			System.out.println("Entered text is a palindrome");
		}
		
		else
		{
			System.out.println("Entered text is not a Palindrome");
		}
		
		
		
		
	/*	int strlength =value.length();
		
		for(int i =strlength -1; i>=0;i--)
		{
			
			
			 reverse = reverse + value.charAt(i);
			
		}
		
		System.out.println(reverse);*/
		
	/*	if(value.equals(reverse))
		{
			System.out.println("Entered text is a palindrome");
		}
		
		else
		{
			System.out.println("Entered text is not a Palindrome");
		}
		*/

	}

}
