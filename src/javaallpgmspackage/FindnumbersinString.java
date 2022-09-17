package javaallpgmspackage;

import java.util.Arrays;

public class FindnumbersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "xyz123";
		
	String newvalue=	value.replaceAll("[^0-9]+", " ");
		
		System.out.println(newvalue);
		
		
		System.out.println(Arrays.asList(newvalue.trim().split("")));


	}

}
