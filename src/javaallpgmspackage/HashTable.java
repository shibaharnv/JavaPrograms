package javaallpgmspackage;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		 //Created hashtable class object to use Its different properties.
		
		  Hashtable<String, Integer> t1 = new Hashtable<String, Integer>();
		
		  
		  //Put values 
		  
		  t1.put("hands", 2);
		  
		  t1.put("Nose", 1);
		  
		  
		  //Here 2 and 1 are the values
		  
		  
		 // Retrieve the values using the key
		  
		  System.out.println("Human hands " +t1.get("hands"));
		  
		  System.out.println("Human nose " +t1.get("Nose"));
		  
		  
		  System.out.println(t1.keySet());
		  System.out.println(t1.entrySet());
	}

}
