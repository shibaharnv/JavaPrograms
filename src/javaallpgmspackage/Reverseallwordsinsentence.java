package javaallpgmspackage;

import java.util.Arrays;

public class Reverseallwordsinsentence {

	public static void main(String[] args) {
		
		
		String sentence ="This is sample text";
		
		StringBuilder sb2= new StringBuilder(sentence);
		
		sb2.reverse();
		
		System.out.println("sb2" +sb2);
		
		String split[] = sentence.split("\\s");
		
		System.out.println("Split full "+Arrays.toString(split));
		
		
		int splitlength =split.length;
		
		String reverseword ="";
		
		for(int j=0; j<splitlength;j++)
		{
			System.out.println("Each split item " +split[j]);
			
			StringBuilder sb= new StringBuilder(split[j]);
			sb.reverse();
			reverseword+=sb.toString()+" ";
			StringBuilder sb1= new StringBuilder(reverseword);
			sb1.reverse();
			System.out.println("sb1" +sb1);
			
			
			
			//sb.reverse(split[j]);
			
		}
		
		System.out.println("Reverse word " +reverseword);
	/*	
		System.out.println("splitlength :" +splitlength);
		System.out.println("split :" +split);
		
		//String sentence ="This";
		
		int areat =sentence.length();
		
		int count=0;
		
		
		int spacecount=sentence.replaceAll(" ", "").length();
		int finalspacecount =areat-spacecount;
		
		System.out.println("areat :"+areat);
		System.out.println("spacecount :"+spacecount);
		System.out.println("finalspacecount :"+finalspacecount);
		
		
		for(int i=0;i<areat;i++)
		{
			
			
			
			if(sentence.matches("\\S+"))
			{
				count++;
			}
				
		}
		
		System.out.println("Count is" +count);
		
		if(sentence.contains(" "))
		{
			System.out.println("It contains space");
		}
		
		else
		{
			System.out.println("It contains no space");
		}*/

	}

}
