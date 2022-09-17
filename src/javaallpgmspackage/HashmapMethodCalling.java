package javaallpgmspackage;

import java.util.HashMap;

public class HashmapMethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String ,Integer>  mapobj = new HashMap<String, Integer>();
		
		
		mapobj.put("Head", 1);
		mapobj.put("Legs", 2);
		mapobj.put("Legs", 2);
		mapobj.put("Legs", 2);
		
		HashmapMethodCalling classobj = new HashmapMethodCalling();
		
		
		classobj.print(mapobj);
		
		
}
	
	
	void print (HashMap mapobj)
	
	
	{
		
		for(int i=0;i<=mapobj.size();i++)
			
		{
			System.out.println("Print value " +mapobj.get("Head"));
			
			System.out.println("Print value "+mapobj.entrySet());
			
			System.out.println("Print value "+mapobj.keySet());
			
		}

		
		
	}
	
	void filldetails()
	{
		
	}

	
	
}
