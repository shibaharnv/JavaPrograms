package javaallpgmspackage;

import java.util.Scanner;

public class Sumofdigitstosinglenumber {

	public static void main(String[] args) {
		
		
		Scanner scanobj = new Scanner(System.in);
		
		//int giventhreedigitnumber = scanobj.nextInt();
		
		
		//Enter three digit number
		
		String giventhreedigitnumber = scanobj.next();
		
		System.out.println("giventhreedigitnumber" +giventhreedigitnumber);
		
		giventhreedigitnumber.length();
		
		int integersinglvalue=0;
		
		int finalresult =0;
		
		for(int i=0;i<giventhreedigitnumber.length();i++)
		{
		
			
			char c= giventhreedigitnumber.charAt(i);
			
			integersinglvalue =	Character.getNumericValue(c);
			
			System.out.println("integersinglvalue" +integersinglvalue);
			
			finalresult=integersinglvalue+finalresult;
			
		}
	
		
		
		System.out.println("finalresult" +finalresult);
		
		
		
/*		int finalresultnumber=0;
		
		while(giventhreedigitnumber>0)
		{
			
			int remainder = giventhreedigitnumber%10;
			
			finalresultnumber = finalresultnumber + remainder;
			
			giventhreedigitnumber=	giventhreedigitnumber/10;
			
		}
		
		System.out.println("finalresultnumber" +finalresultnumber);
		*/
		
		
	}

}
