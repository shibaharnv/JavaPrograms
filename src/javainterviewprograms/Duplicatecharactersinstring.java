package javainterviewprograms;

public class Duplicatecharactersinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * String word ="Shibahar";
		 * 
		 * int count=0;
		 * 
		 * for(int i=0;i<word.length();i++) { for(int j=i+1; j<word.length();j++) { char
		 * first =word.charAt(i);
		 * 
		 * char second=word.charAt(j);
		 * 
		 * if(first==second) {
		 * 
		 * count++;
		 * 
		 * System.out.println("duplicate character is "+first+" appears " +count ); } }
		 * 
		 * 
		 * }
		 */
		
		//System.out.println("duplicate count is " +count);
		
	
			      String stringWithDuplicates = "asdasdedsfrgdftg";
			      StringBuffer sb = new StringBuffer(); 
			      stringWithDuplicates.chars().distinct().forEach(letter->sb.append(letter));
			      String duplicatesRemoved = sb.toString();
			      System.out.println("String after duplicates removed : " +
			                        duplicatesRemoved);
			   }
			 }
			

