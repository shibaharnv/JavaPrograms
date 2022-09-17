package javaallpgmspackage;

import java.util.Scanner;

public class Scannerclassreceiveinputfromuser {

	public static void main(String[] args) {
		
		Scanner scobj = new Scanner(System.in);
		
		int  i= scobj.nextInt();
		
		System.out.println("Enter the integer");
		
		System.out.println("Integer value is  " +i);
		
		Scanner scobjb = new Scanner(System.in);
		
		System.out.println("Enter the String value");
		
		String S = scobjb.nextLine();
		

		System.out.println("String  value is  " +S);
		
		
	}

}
