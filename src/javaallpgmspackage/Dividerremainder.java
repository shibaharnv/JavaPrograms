package javaallpgmspackage;

import java.util.Scanner;

public class Dividerremainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanobj = new Scanner(System.in);
		
		int givennumber =scanobj.nextInt();
		
		System.out.println("givennumber " +givennumber);

		
		int divider = givennumber/10;
		
		System.out.println("divider" +divider);
		
		

		int remainder = givennumber%10;
		
		System.out.println("remainder" +remainder);
		
	}

}
