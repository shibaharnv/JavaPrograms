package javainterviewprograms;

public class Reverseastring {
	
	   String word ="abcd";
	
	String reverse ="";

	public static void main(String[] args) {
		
		//private String word;

		
		Reverseastring obj = new Reverseastring();
		
		obj.reversemethod();

		StringBuffer sb = new StringBuffer(obj.word);
		sb.reverse();
		System.out.println("after reverse"+sb);
	}

	
	void reversemethod() {
		
		int wordlenght = word.length();
		
		for(int i=wordlenght-1; i>=0;i--)
		{
			
			reverse = reverse + word.charAt(i);
			
		}
		
		System.out.println("reversed string is "+reverse);
	
	 
	}
}
