package javaallpgmspackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SET {

	public static void main(String[] args) {
		
		Set<String> obj =  new HashSet<String>(); 
		obj.add("Mano");
		obj.add("shibahar");
		obj.add("THanusha");
		obj.add("Amma");
		
		 Iterator<String> itobj = obj.iterator();
		
		String value = itobj.next();
		value = itobj.next();
		value = itobj.next();
		 /*value = itobj.next();
		 value = itobj.next();*/
		System.out.println("value " +value);
	/*	String value2 = itobj.next();
		System.out.println("value " +value2);*/
	}

}
