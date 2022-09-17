package javaallpgmspackage;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String value = "abcd";
		
		 String reverse="";
		
		int Stringlength = value.length();
		
		
		for(int i=Stringlength-1; i>=0;i--)
		{
			
			// char reverse = value.charAt(i);
			 
			  reverse = reverse + value.charAt(i);
			 
			 //System.out.println(reverse);
		}
		System.out.println(reverse);
	
	
	
		/*
		 * String myword ="rahabihs";
		 * 
		 * String reverseword ="";
		 * 
		 * 
		 * int mywordlength = myword.length();
		 * 
		 * System.out.println(mywordlength);
		 * 
		 * 
		 * 
		 * for(int i = mywordlength-1; i >= 0; i--)
		 * 
		 * {
		 * 
		 * reverseword = reverseword + myword.charAt(i);
		 * 
		 * System.out.println(reverseword);
		 * 
		 * 
		 * } System.out.println("Final reverese word " +reverseword);
		 */
	

}
}