package javaallpgmspackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Arrayrepeatedstring {

	public static void main(String[] args) {
		
		int count =0;
		
		ArrayList <String> obj = new ArrayList ();
		
		obj.add("Shibahar");
	
		obj.add("Shibahar");
		obj.add("Shibahar");
		
		
		
	    LinkedHashSet<String> hashSet = new LinkedHashSet<>(obj);
        
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);
         
        System.out.println("list without duplicates"+listWithoutDuplicates);
		
		
		
	
		
		System.out.println("AFTER  SHIBAHAR" +obj);
		//obj.clear();
		 obj.removeIf( name -> name.equals("Shibahar"));
		 
		System.out.println("AFTER REMOVING SHIBAHAR" +obj);
		
		for(int i= 0;i<obj.size();i++)
		{
			for(int j=i+1;j<obj.size();j++)
			{
				if(obj.get(i)==obj.get(j))
				{
					System.out.println("The repeated value is " +obj.get(i));
					System.out.println("The repeated value is " +obj.get(j));
					count++;
				}
			}
		}
		
		System.out.println("It is appearing "+ count);

	}

}
