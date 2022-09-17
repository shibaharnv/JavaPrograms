package javaallpgmspackage;

import java.util.ArrayList;

public class Firstduplicateelementinanarray {

	public static void main(String[] args) {

		
		int a[] ={1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
		
		ArrayList<Integer> arraylistobj1 = new ArrayList<Integer> ();
		
		int count=0;
		
		
		int arraylength = a.length;
		
		System.out.println("Array length "+arraylength);
		
		for(int i=0;i<arraylength;i++)
		{
			System.out.println(a[i]);
			
			for(int j=i+1;j<arraylength;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					int duplicatearrayelement =a[i];
					arraylistobj1.add(duplicatearrayelement);
					
					//System.out.println("Duplicate element is "+duplicatearrayelement);
					
					
					
				}
				
				
				
			}
			
			
			
		}
		
		System.out.println("Duplicate elements are "+arraylistobj1.toString());
		
		
		//finding first duplicate element :
		
		int firstduplicateelement = arraylistobj1.get(0);
		
		System.out.println("First duplicate element in the array " +firstduplicateelement);
		
		System.out.println("Total number of duplicate elements "+count);
		
		
	
	
	
	
	//first duplicate element in the array 
	
	//input 	int a[] ={1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
	
	//output :4
	
		int b[] ={1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
		
		int barraylength =b.length;
		
		int firstbduplicateelemenet = 0 ;
		
		for(int k=0;k<barraylength-1;k++)
		{
			if(b[k]==b[k+1])
			{
				 firstbduplicateelemenet =b[k];
				// break;
			}
		}
		
		System.out.println("firstbduplicateelemenet " +firstbduplicateelemenet);

}	
	
		
	
	
	
	
	

}
