package javaallpgmspackage;

import java.sql.Array;

public class CopyOfFindtextinstring {

	public static void main(String[] args) {
		
		
		String text = "xyzautomationxyzautomationxyzautomation";
		
		String myword ="automation";
		
		String stringmod = text.replaceAll("xyz", " ");
		
		String[] stringtoarry =stringmod.split(" ");
		
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
