package javainterviewprograms;

import java.util.Scanner;

public class Countnooflettersinword {

	public static void main(String[] args) {
		
		int count=0;
		
		
		
		String word = "Shibahar";
		
	char givencharcter= 'a';
		
		int wordlength =word.length();
		
		for(int i=0;i<wordlength;i++)
		{
			 char c =word.charAt(i);
			
			if(c==givencharcter)
			{
				count= count+1;
			}
		}
		
		System.out.println("THe character "+givencharcter+ " appears "+count+" times in the word "+word+"");
		
		
		

	}

}
