package javaallpgmspackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi");

		ArrayList<String> arraylistobj1 = new ArrayList<String> ();

		ArrayList<String> arraylistobj2 = new ArrayList<String> ();
		
		ArrayList<String> arraylistobj3 = new ArrayList<String> ();
		ArrayList<String> arraylistobj4 = new ArrayList<String> ();
		
		arraylistobj3.add("123");
		
		arraylistobj3.add("456");
		arraylistobj4.add("123");
		arraylistobj4.add("456");
		
		System.out.println(arraylistobj3.equals(arraylistobj4));
		
		
		//arraylistobj1.add("rex");
		arraylistobj1.add("hi");
		arraylistobj1.add("bye");
		arraylistobj1.add("Thank you");
		arraylistobj1.add("Super");
		//arraylistobj1.add("fine");
		//arraylistobj1.add("Good");
		
		
		
		
		
		arraylistobj2.add("hi");
		arraylistobj2.add("bye");
		arraylistobj2.add("Super");
		arraylistobj2.add("Good");
		arraylistobj2.add("Thank you");	
		
		
		//arraylistobj2.add("fine");
		//arraylistobj2.add("awesome");
		
		int arraylistobj1size = arraylistobj1.size();
		int arraylistobj2size = arraylistobj2.size();
		
		System.out.println("arraylistobj1size" +arraylistobj1size);
		
		System.out.println("arraylistobj2size" +arraylistobj2size);
		
	
		System.out.println("hrwerwi");
		
		
	/*	  Collections.sort(arraylistobj1);
		  Collections.sort(arraylistobj2); */
		
		if(arraylistobj1.equals(arraylistobj2))
		{
			System.out.println("Both are matching");
		
		}
		
		else
		{
			if(arraylistobj1.size()>arraylistobj2.size())
			{
				System.out.println("arraylistobj1 size is greater");
				
				for(String diff :arraylistobj2)
				{
					arraylistobj1.remove(diff);
					System.out.println(arraylistobj1);
				}
				
		
				System.out.println("Final Difference for 1st loop " +arraylistobj1);
				
			}
			
			else
			{
				
				if(arraylistobj1.size()<arraylistobj2.size())
				{
					System.out.println("arraylistobj2 size is greater");
					
					for(String diff :arraylistobj1)
					{
						arraylistobj2.remove(diff);
						System.out.println(arraylistobj2);
					}
					
			
					System.out.println("Final Difference for 2nd loop " +arraylistobj2);
					
				}
				
			}
			
		
				
			if(arraylistobj1size ==arraylistobj2size)
				{
				for(String diff :arraylistobj2)
				{
					arraylistobj1.remove(diff);
					System.out.println(arraylistobj1);
				}
					if(arraylistobj1.isEmpty() )
				{
					System.out.println("Header order is different");
				}
				
					else{
				
				System.out.println("Final Difference for 3rd loop " +arraylistobj1);
					}
				}
		
			
			
		/*	if(arraylistobj1.isEmpty() )
			{
				System.out.println("Header order is different");
			}*/
			
		//if(arraylistobj1.size()>arraylistobj2.size())
		/*
		//if(arraylistobj1size<arraylistobj1size)
		{
			System.out.println("arraylistobj1size is greater");
			for(String diff :arraylistobj2)
			{
				arraylistobj1.remove(diff);
				System.out.println(arraylistobj1);
			}
			System.out.println("Final Difference for 1st loop " +arraylistobj1);
				
	}
		
		//else
		{
			
			System.out.println("arraylistobj2size is greater");
			for(String diff :arraylistobj1)
			{
				arraylistobj2.remove(diff);
				System.out.println(arraylistobj2);
			}
			System.out.println("Final Difference for 2nd loop " +arraylistobj2);
				
			
			
			System.out.println("arraylistobj2size is greater");
			for(String diff :arraylistobj2)
			{
				arraylistobj1.remove(diff);
				System.out.println(arraylistobj1);
			}
			
			if(arraylistobj1.isEmpty() )
			{
				System.out.println("Header order is different");
			}
			else
			{
			System.out.println("Final Difference for 2nd loop " +arraylistobj1);
			}
			
			
		}
		
		
			for(int i=0;i<arraylistobj1size;i++)
		{
			for(int j=i+1;i<arraylistobj2size;j++)
			{
				if(!arraylistobj1.get(i).equals(arraylistobj2.get(j)))
				{
					
				}
			}
		}*/

	}
	}
	

}
