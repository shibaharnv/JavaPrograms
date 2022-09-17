package javaallpgmspackage;

import java.util.Vector;

public class Memoryleak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Vector v = new Vector(214444); 
	        Vector v1 = new Vector(214744444); 
	        Vector v2 = new Vector(214444); 
	        System.out.println("Memory Leaks");

	}

}
