package javaallpgmspackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class summaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<String> obj =  new HashSet<String>(); 
		
		obj.add("shibahar");
		obj.add("THanusha");
		obj.add("Mano");
		obj.add("Amma");
		
		Iterator<String> it = obj.iterator();
		
		boolean value = it.hasNext();
		
		System.out.println("value" +value);

	}

}
