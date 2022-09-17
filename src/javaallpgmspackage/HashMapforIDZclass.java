package javaallpgmspackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;

public class HashMapforIDZclass {
	
	

	public static void main(String[] args) {
		

	//
		HashMap<String, String> hashobj = new HashMap<String, String>();
	    HashMap<String, String> crxHashobj = new HashMap<String, String>();
	    HashMap<String, String> crxHashobjfinal = new HashMap<String, String>();
	    HashMap<String, String> hashobjfinal = new HashMap<String, String>();
	    
	    
	    ArrayList crxMissingValuesArrayList = new ArrayList();
	    
	    //ArrayList crxMissingValuesArrayList = new ArrayList();
	    
	    hashobj.put("drupal_node_id", "durpalnodeidvalue");
	    hashobj.put("summary", "summaryvalue");
	   // hashobj.put("alias", "aliasvalue");
	   // crxHashobj.put("title", "titelvalue");
	   
	    crxHashobj.put("summary", "summaryvaluedelte");
	    crxHashobj.put("drupal_node_id", "durpalnodeidvaluedelte");
	    crxHashobj.put("title", "titelvalue");
	    
	    crxHashobjfinal.putAll(crxHashobj);
	    hashobjfinal.putAll(hashobj);
	    
	   final int crxhashobjsize =crxHashobj.size();
	   final int hashobjfinalsize =hashobjfinal.size();
	
	   
	   System.out.println("crxHashobjfinal stored before "+crxHashobjfinal);

	    
	    //TO CHECK IF BOTH THE MAP'S KEY AND VALUE ARE EQUAL
	    
	    if(hashobj.equals(crxHashobj))
	    	{
	    	System.out.println("BOth the maps are equal");
	    	}
	    else if(!(hashobj.equals(crxHashobj)))
	    {
	    	System.out.println("BOth the maps are NOT equal");
	    }
	    
	    
	  //TO FIND OUT THE PROPERTIES MISSING IN AEM CRX when the maps are of different size
	    
	    HashSet<String> AEMCRXkeys= new HashSet<>(crxHashobj.keySet());
	  
	    HashSet<String> unionKeys = new HashSet<>(hashobj.keySet());
	    
	    System.out.println("JUST Union keys " +unionKeys);
	    
	    unionKeys.addAll(crxHashobj.keySet());
	    
	    System.out.println("union keys + crxhashobj " +unionKeys);
	     
	    unionKeys.removeAll(crxHashobj.keySet());
	    
	    
	    System.out.println("Total union keys - hashobj " +unionKeys);
	    
	    System.out.println("Properties misiing in crx " +unionKeys);
	     
	    System.out.println(unionKeys);
	    
	   
	    for (String Key : AEMCRXkeys)

        {
	    	 
	    	System.out.println("Inside for loop before removal" +crxHashobj);
	    	hashobj.remove(Key, hashobj.get(Key));
	    	 
	    	System.out.println("Inside for loop after removal" +hashobj);
          
        }
	    
	    System.out.println("KEYS MISSING IN CRX MAP " +hashobj);
	    
	    
	    
	  //TO FIND OUT THE PROPERTIES MISSING IN AEM CRX when the maps are of equal size
	    
	    HashSet<String> druaplkeystwo = new HashSet<>(crxHashobj.keySet());
	    	
	    for (String Key : druaplkeystwo)

        {

	    	hashobj.remove(Key, hashobj.get(Key));
      }
	    
	    System.out.println("KEYS MISSING IN CRX MAP two " +hashobj);
    
	    HashSet<String> AEMCRXkeystwo = new HashSet<>(crxHashobjfinal.keySet());
	    
	    System.out.println("crxHashobjfinal stored "+crxHashobjfinal);
	    
	    if((hashobjfinalsize == crxhashobjsize) && (!(hashobj.equals(crxHashobjfinal))))
	    {
	    
		    for (String Key : AEMCRXkeystwo)

	        {

		    	 hashobj.remove(Key, hashobj.get(Key));
	        }
	    	
		    System.out.println("KEYS MISSING IN drupal hashmap MAP " +hashobj);
	    	
	    }
	    
	    
	    //To Find out the values that are mismatching in AEM CRX
	    
	    
	    //1) All the keys and values are matching 
	    
	    //2)Maps are of same size but values are different.
	    
	    //2)Drupal map is of more size and values are same 
	    
	    //4)Drupal map is of more size and values are different 
	    
	    //5)Drupal map is of less size and value are same
	    
	    
	    
	    //1) All the keys and values are matching /different
	    
	    if((hashobjfinalsize==crxhashobjsize))
	    {
	       for (String Key : hashobjfinal.keySet())

           {
               if (hashobjfinal.get(Key).equals(crxHashobjfinal.get(Key))) {
            	   
                   System.out.println("Both the Map values are matching");
                   
               } else {
                   System.out.println("AAAAAAAA Both the Map values are NOT matching" + Key);

                   crxMissingValuesArrayList.add(Key);

                   System.out.println("crxMissingValuesArrayList" + crxMissingValuesArrayList);
               }

           }
	       
	    }     
	       
	       
	       
	       //Drupal map is of more size and values are different 
	       
	      if((hashobjfinalsize >crxhashobjsize))
	      {
	       for (String Key : crxHashobjfinal.keySet())

           {
               if (hashobjfinal.get(Key).equals(crxHashobjfinal.get(Key))) {
            	   
                   System.out.println("Both the Map values are matching");
                   
               } else {
                   System.out.println("AAAAAAAA Both the Map values are NOT matching" + Key);

                   crxMissingValuesArrayList.add(Key);

                   System.out.println("crxMissingValuesArrayList" + crxMissingValuesArrayList);
               }

           }
	      }
	      
	      
	      
	       //Drupal map is of less size and values are same /different 
	       
		      if((hashobjfinalsize <crxhashobjsize))
		      {
		       for (String Key : hashobjfinal.keySet())

	           {
	               if (hashobjfinal.get(Key).equals(crxHashobjfinal.get(Key))) {
	            	   
	                   System.out.println("Both the Map values are matching");
	                   
	               } else {
	                   System.out.println("AAAAAAAA Both the Map values are NOT matching" + Key);

	                   crxMissingValuesArrayList.add(Key);

	                   System.out.println("crxMissingValuesArrayList" + crxMissingValuesArrayList);
	               }

	           }
		      }
	      
	      
	      
}
	
	
}


	


