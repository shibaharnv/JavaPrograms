package javaallpgmspackage;

import java.util.ArrayList;

public class xyzautomation {

	public static void main(String[] args) {
		
		
		String fullstring ="xyzautoxyzauto";
		
		ArrayList<Character> arraylistobj = new ArrayList<Character> ();
		
		
		char c[] ={'a','u','t','o'};
		
	    int charlength=c.length;
	    
	    int count=0;
	    
	    int finalcount=0;
	    
	    String emptystring="";
	    
	    String actualstring="auto";
		
	
	    int secondfinal=0;
		
		int stringlenth=fullstring.length();
		
		for(int i=0;i<stringlenth;i++)
		{
			char storedcharacter =fullstring.charAt(i);
			
			System.out.println(storedcharacter);
			
			if('a'==storedcharacter ||'u'==storedcharacter ||'t'==storedcharacter ||'o'==storedcharacter)
			{
			count++;
			
			emptystring =emptystring+storedcharacter;
			
		
			
			}
			if(emptystring.equals(actualstring) )
			{
				finalcount++;
				
			
					
				}
			
			
			
		}
		
		System.out.println("FInalcount "+finalcount);
		
		

	}

}
