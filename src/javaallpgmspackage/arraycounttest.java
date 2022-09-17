package javaallpgmspackage;

import java.util.Scanner;

public class arraycounttest {

	public static void main(String[] args) {

		
		String word = "shibahar";
		
		int count=0;
		
		//Storing given character in variable
		
		char givencharacter = 'a';
		
		int stringlength =word.length();
		
		for(int i=0;i<stringlength;i++)
		{
			
			char c= word.charAt(i);
			
			if(c==givencharacter)
			{
				count ++;
			}
		}
		
		System.out.println("Given character "+givencharacter+" appears "+count+" times in the string "+word+"" );
		
		
		
	}

}
