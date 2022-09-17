package javaallpgmspackage;

import java.util.ArrayList;

public class Arraylist {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arraylistobj = new ArrayList<String> ();
		
		ArrayList arraylistobj2 = new ArrayList<String> ();
		
		  String methodNames ="Scenario-Welcome text";
	       String Env="Env- IQA1";
	       String Status="Status- Pass";
	       String Failure="Failure Reason- NA";
	    
	       
	       arraylistobj2.add(methodNames); 
		
	
		arraylistobj.add("bye");
		
		
		//Get total size of Array list :
		System.out.println(arraylistobj.size());
			
		// Get Object
		System.out.println(arraylistobj.get(0));
		

		// Get index of the element
		System.out.println("Index of bye " +arraylistobj.indexOf("bye"));
		
		int a[] = new int[3];
		
		a[0] = 5;
		
		a[1] = 10;
		
		a[2] = 15;
		
		int arraysize= a.length;
		System.out.println(arraysize);
		//find the second highest
		
		largestnumberinarray(arraysize, a);
		
		
	}
	
	public static void largestnumberinarray(int arraysize ,int a[])
	{
		
		int max = a[0];
		
		for(int i=0;i<arraysize;i++)
		{
			if(max< a[i])
			{
				max=a[i];
							
			}	
		}
		
		
		System.out.println("Maximux value is " +max);
		
		
		}
	
	
	
		
		
			
}
		
		
		
	
	
	


