package javaallpgmspackage;

public class ReverseStringCopy {

	public static void main(String[] args) {
		
		
		String text = "abcd";
		
		int stringlength =text.length();
		
		
		 String reversedtext="";
		
		System.out.println(text.length());
		
		
		for(int i =stringlength-1; i>=0; i--)
			
		{
			
			 reversedtext =reversedtext + text.charAt(i);
			 
			 System.out.println(reversedtext);
	}
		
		System.out.println(reversedtext);
		

	}

}
