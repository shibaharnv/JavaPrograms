package javaallpgmspackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;

public class HashMapclass {
	
	

	public static void main(String[] args) {
		

		
		HashMap<Integer,String >  obj = new HashMap <Integer,String>();
		
		// Assigning values and Key
		
		obj.put(23, "Shibahar");
		
		obj.put(2, "Manoj");
		
		obj.put(2, "Manoj");
		
		//System.out.println(obj.entrySet());
		
		//System.out.println(obj.isEmpty());
		
		System.out.println("Key Set is "+obj.keySet());
				
		System.out.println("Entry Set is "+obj.entrySet());
		
		//Entry set gives output in the below format
		//[1=Shibahar, 2=Manoj]
		
		System.out.println("Get state " +obj.get(1));
		

		
/*		
	for(Map.Entry m: obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());  
		}
		
		
		
		for(Entry<Integer, String> value : obj.entrySet())
		{
			
			//System.out.println(value);
			
			System.out.println(value.getKey ()+" | "+ value.getValue());
			//System.out.println(value.getValue());
			
		}*/

		
		for( Integer Key  : obj.keySet())
		{
			
			System.out.println("Key :"+Key);
			
			System.out.println("Value " +obj.get(Key));
		}
		
					System.out.println(obj.values());
	
					System.out.println(obj.keySet());
		
		
	
	
	//
		HashMap<String, String> hashobj = new HashMap<String, String>();
	    HashMap<String, String> crxHashobj = new HashMap<String, String>();
	    HashMap<String, String> crxHashobjfinal = new HashMap<String, String>();
	    
	    hashobj.put("drupal_node_id", "durpalnodeidvalue");
	    hashobj.put("summary", "summaryvalue");
	    hashobj.put("alias", "aliasvalue");
	    
	   
	    crxHashobj.put("summary", "summaryvalue");
	    crxHashobj.put("drupal_node_id", "durpalnodeidvalue");
	    crxHashobj.put("title", "titelvalue");
	    
	    crxHashobjfinal.putAll(crxHashobj);
	    
	   final int crxhashobjsize =crxHashobj.size();
	   
	   //final Map crxHashobjfinal =crxHashobj;
	   
	   //final HashMap<String,String> crxHashobjfinal12=  crxHashobj;
	   
	   System.out.println("crxHashobjfinal stored before "+crxHashobjfinal);
	   // crxHashobj.put("alias", "aliasvalue");
	    
	    //TO CHECK IF BOTH THE MAP'S KEY AND VALUE ARE EQUAL
	    
	    if(hashobj.equals(crxHashobj))
	    	{
	    	System.out.println("BOth the maps are equal");
	    	}
	    else if(!(hashobj.equals(crxHashobj)))
	    {
	    	System.out.println("BOth the maps are NOT equal");
	    }
	    
	    	HashSet<String> unionKeys = new HashSet<>(hashobj.keySet());
	   // HashMap<String> unionKeys = new HashMap<>(hashobj.keySet());
	    
	    System.out.println("Before for loop " +crxHashobj);
	    for (String Key : unionKeys)

        {
	    	
	    	 System.out.println("Before removing " +crxHashobj);
    	
	    	 crxHashobj.remove(Key, hashobj.get(Key));
            System.out.println("INSIDE  MISSING IN CRX MAP " +crxHashobj);
        }
	    
	    System.out.println("KEYS MISSING IN CRX MAP " +crxHashobj);
	    
	    HashSet<String> divededKeys = new HashSet<>(crxHashobjfinal.keySet());
	    
	    System.out.println("crxHashobjfinal stored "+crxHashobjfinal);
	    
	    if((hashobj.size() == crxhashobjsize) && (!(hashobj.equals(crxHashobjfinal))))
	    {
	    	System.out.println("SUcess");
	    	System.out.println("Before for loop " +hashobj);
		    for (String Key : divededKeys)

	        {
		    	
		    	 System.out.println("Before removing " +hashobj);
	    	
		    	 hashobj.remove(Key, hashobj.get(Key));
	            System.out.println("INSIDE  MISSING IN CRX MAP " +hashobj);
	        }
	    	
		    System.out.println("KEYS MISSING IN drupal hashmap MAP " +hashobj);
	    	
	    }
	}
	}


	


