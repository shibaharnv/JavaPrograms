package javaallpgmspackage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;

public class Hashtableclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable  <String ,Integer>  t1 = new 	Hashtable  <String ,Integer> ();
		
		
		t1.put("eyes", 2);
		
		t1.put("Nose", 1);
		//t1.put("", null); //doesnot allow null values
		

		HashMap<String ,Integer>  mapobj = new HashMap<String, Integer>();
		
		mapobj.put("hands",2);
		mapobj.put("hands",2);
		mapobj.put("",null);
		mapobj.put("",null);
		mapobj.put("",null);
		mapobj.put("",null);
		mapobj.put("",null);
		mapobj.put("",null);
		
		
		
		
		
		
		
		System.out.println("No of eyes are  " +t1.get("eyes"));

		System.out.println("No of nose is  " +t1.get("Nose"));
		
		System.out.println("No of eyes are  " +mapobj.get("hands"));

		System.out.println("No of nose is  " +mapobj.get("hands"));
		
		



		
	}

}
