package javaallpgmspackage;

import java.util.stream.IntStream;

public class Firstnonrepeatedcharacter {

	public static void main(String[] args) {
		
		String word = "shibahar";
		
		String finalword = word.replaceAll("\\s", "");
		
		System.out.println(finalword);

		
		
		int stringlength=finalword.length();
		System.out.println(stringlength);
		
		for (int i = 0; i < finalword.length(); i++) {
			
			   boolean unique = true;
			   
			   for (int j = 0; j < finalword.length(); j++) {
				   
			    if (i != j && finalword.charAt(i) == finalword.charAt(j)) {
			    	
			     unique = false;
			     break;
			    }
			   }
			   if (unique) {
			    System.out.println("The first non repeated character in String is: " + finalword.charAt(i));
			    break;
			   }
			  }
		}
		
		
		

	}


