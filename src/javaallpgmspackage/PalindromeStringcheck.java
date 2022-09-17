package javaallpgmspackage;

import java.util.Scanner;

public class PalindromeStringcheck {

	public static void main(String[] args) {
		
		
		
		String value = "";
		
		String reverse = "";
		
		Scanner scanobj = new Scanner(System.in);
		
		String s =scanobj.nextLine();
		
		value=s;
		
		int strlength =value.length();
		
		
		for(int i =strlength -1; i>=0;  i--)
		{
			
			reverse = reverse + value.charAt(i);
			
		}
		
		System.out.println(reverse);
		
		if(value.equals(reverse))
		{
			System.out.println("Entered text is a palindrome");
		}
		
		else
		{
			System.out.println("Entered text is not a Palindrome");
		}
		

	}

}
