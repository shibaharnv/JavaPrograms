package javaallpgmspackage;

import java.util.Scanner;

public class Countnoofcharactersinastring {

	public static void main(String[] args) {

		
		
		String value="shibahar";
		
		
		Scanner scanobj = new Scanner(System.in);
		
		char inputcharacter =scanobj.next().charAt(0);
		
		
		//char character ='a';
		
		int count =0;
		
		
		int stringlengh =value.length();
		
		for(int i=0;i<stringlengh;i++)
		{
			System.out.println(value.charAt(i));
			
			if(value.charAt(i)==inputcharacter)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("Character "+inputcharacter+" doesnot appear in "+value+"");
		}
		
		if(count ==1)
		{
		
		System.out.println("Character "+inputcharacter+" appears "+count+" time in "+value+" ");
		}
		
		if(count>1)
		{
		
		System.out.println("Character "+inputcharacter+" appears "+count+" times in "+value+" ");
		}
		
		
	}

}
