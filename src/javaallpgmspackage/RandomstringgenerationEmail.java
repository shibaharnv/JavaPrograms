package javaallpgmspackage;

import java.util.Random;

public class RandomstringgenerationEmail {

	public static void main(String[] args) {
		
		
		Random randomobj = new Random();
		
		
		int ans = randomobj.nextInt(10000000);
		
		System.out.println("Number values"+ans);

		String base = "sfhkdsjhfkjdshfkdsjhfdskjhfkh";

		StringBuffer stringobj = new StringBuffer();

		Random randomnoobj = new Random();

		for (int i = 0; i < 10; i++)

		{

			int number = randomnoobj.nextInt(26);

			stringobj.append(base.charAt(number));

		}
		System.out.println("String value "+stringobj);
		
		

		
		StringBuffer finalstring = stringobj.append(ans);
		System.out.println(finalstring);

		String email = "Testuser" +finalstring+ "@mailinator.com";
		System.out.println(email);
		
	}
	

	
	

}
