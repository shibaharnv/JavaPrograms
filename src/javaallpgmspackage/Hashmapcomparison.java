package javaallpgmspackage;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmapcomparison {

	public static void main(String[] args) {

		
		
		HashMap<String,String >  hashobj1 = new HashMap <String,String>();
		HashMap<String,String >  hashobj2 = new HashMap <String,String>();
	
		
		
		
		hashobj1.put("DRUPALdrupal_node_id", "7552001");
		hashobj1.put("DRUPALlastupdated", "2018-01-29T00:00:00.000-08:00");
		
		hashobj2.put("AEMdrupal_node_id", "755200");
		hashobj2.put("AEMlastupdated", "2018-01-29T00:00:00.000-08:00");
		//hashobj2.put("AEMlastupdatedd", "2018-01-29T00:00:00.000-08:00");
		
		
		
		//to rename the KEY 
		String remov1 = hashobj1.remove("DRUPALdrupal_node_id");
		hashobj1.put("AEMdrupal_node_id", remov1);
		
		
		String remov2 = hashobj1.remove("DRUPALlastupdated");
		hashobj1.put("AEMlastupdated", remov2);
		
		
		
		
		
		
		
		
		
		/*hashobj1.replace("DRUPALdrupal_node_id", "AEMdrupal_node_id");
		hashobj1.replace("DRUPALlastupdated", "AEMlastupdated");
		*/
		
		System.out.println("After rem replacing " +hashobj1.entrySet());
		
		int hashobj1size =hashobj1.size();
		int hashobj2size =hashobj2.size();
		
		if(hashobj1size==hashobj2size)
		{
			System.out.println("Both the hashmaps size are equal and they are" +hashobj1size);
			
			
			for( String Key  : hashobj1.keySet())
			//for( int i=0;i<hashobj2size;i++)
			{
				
				//if(hashobj1.values().equals(hashobj2.values()))
				
				if(hashobj1.get(Key).equals(hashobj2.get(Key)))
						{
					System.out.println("Both the Map values are matching");
						}
				
				else
				{
				System.out.println("Both the Map values are NOT matching"+Key);
				}
				
			/*	System.out.println(Key);
				
				System.out.println(obj.get(Key));*/
			}
			
			System.out.println("Both the Map values are matching");
		}
		
		else{
			System.out.println(hashobj1.entrySet());
		}
		
		
		HashSet<String>  hashunionkeysobj = new HashSet <String>();	
		hashunionkeysobj.addAll(hashobj1.keySet());
		
		hashunionkeysobj.addAll(hashobj2.keySet());
		
		System.out.println("hashunionkeysobj after adding " +hashunionkeysobj.toString());
		hashunionkeysobj.removeAll(hashobj1.keySet());
		
		
		
		System.out.println("hashunionkeysobj after removing " +hashunionkeysobj.toString());
		
		
		
		hashunionkeysobj.retainAll(hashunionkeysobj);
		
		System.out.println("hashunionkeysobj after retaining " +hashunionkeysobj.toString());
		
		/*hashunionobj.putAll(hashobj1);
		
		hashunionobj.putAll(hashobj2);
		
		System.out.println("hashunionobj entryset " +hashunionobj.entrySet());
		
		hashunionobj.remove(hashobj2.keySet());
		
		System.out.println("hashunionobj entryset " +hashunionobj.entrySet());*/
		
		
		
		
		
		// Comparison 
		
		
		HashMap<String,String >  newhashobj1 = new HashMap <String,String>();
		HashMap<String,String >  newhashobj2 = new HashMap <String,String>();
		
		
		//Map 1
		newhashobj1.put("DRUPALdrupal_TAXIO_id", "7552001");
		newhashobj1.put("DRUPALlastupdated", "2018-01-29T00:00:00.000-08:00");
		newhashobj1.put("DRUPALdrupal_node_id", "7552001");
		newhashobj1.put("alias", "alias");
		
		
		//Map 2 
		newhashobj2.put("DRUPALdrupal_node_id", "7552001DELETE");
		newhashobj2.put("DRUPALdrupal_TAXIO_id", "7552001");
		newhashobj2.put("DRUPALlastupdated", "2018-01-29T00:00:00.000-08:00");
		//Union Map 
		

		
		
		if(newhashobj1.equals(newhashobj2))
		{
			System.out.println("MAP COMPARISON EQUAL SUCESS");
		}
		
		else
		{
			HashSet<String> comaprisonmapkeys = new HashSet<>(newhashobj1.values());
			comaprisonmapkeys.addAll(newhashobj2.values());
			System.out.println("MAP COMPARISON NOT EQUAL ");
			System.out.println("comaprisonmapkeys "+comaprisonmapkeys);
			comaprisonmapkeys.removeAll(newhashobj2.values());
			System.out.println("MAP COMPARISON RESULTS" +comaprisonmapkeys.toString());
			
			
			for( String Key  : newhashobj1.keySet())
				//for( int i=0;i<hashobj2size;i++)
				{
					
					//if(hashobj1.values().equals(hashobj2.values()))
					
					if(newhashobj1.get(Key).equals(newhashobj2.get(Key)))
							{
						System.out.println("Both the Map values are matching");
							}
					
					else
					{
					System.out.println("AAAAAAAA Both the Map values are NOT matching"+Key);
					}
					
				/*	System.out.println(Key);
					
					System.out.println(obj.get(Key));*/
				}
			
			
		}
		
		
		
		
		
		if(newhashobj1.size()==newhashobj2.size())
		{
			System.out.println("BOTH NEW MAPS ARE SAME");
		}
		
		else{
			
			System.out.println("HI how are you "+newhashobj1.remove(newhashobj2));
			
			System.out.println("Final value " +newhashobj1);
			
			System.out.println("BOTH NEW MAPS ARE NOT SAME");
			
			
			HashSet<String> unionKeys = new HashSet<>(newhashobj1.keySet());
			unionKeys.addAll(newhashobj2.keySet());
			
			System.out.println("BEFORE REMOVING  " +unionKeys);
			unionKeys.removeAll(newhashobj2.keySet());
			System.out.println("After REMOVING  " +unionKeys);
			System.out.println("unionKeys" +unionKeys);
			
			
			
			HashSet<String> removekeys=new HashSet<>(newhashobj1.keySet());
					
			removekeys.removeAll(unionKeys);
			
			System.out.println("Final new hash 1 "+removekeys);
			
			
			
			for( String Key  : unionKeys)
			{
				
				
				newhashobj1.remove(Key, newhashobj1.get(Key));
				//System.out.println("Key :"+Key);
				
				//System.out.println("Value " +obj.get(Key));
			}
			
			
			System.out.println("newhashobj1 final " +newhashobj1.entrySet());
				
			}
			
			
		}
		
		
		
	

}
