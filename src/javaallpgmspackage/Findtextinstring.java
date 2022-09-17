package javaallpgmspackage;

import java.sql.Array;

public class Findtextinstring {
	


	public static void main(String[] args) {
		
		
		
		String text = "This game game is my game game game";
		
		String myword ="game";
		
		String[] stringtoarry =  text.split(" ");
		
		int count =0;
			
		for(int i=0;i<stringtoarry.length;i++)
		{
			System.out.println(stringtoarry[i]);
			
			if(stringtoarry[i].equals(myword))
			{
				count=count +1;
			}
			
			
		}
		
		System.out.println("The word "+ myword+" appears "+count+" times in the text");
		
	}



}
