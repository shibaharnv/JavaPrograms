package javaallpgmspackage;

import java.util.Arrays;

public class Arraysmovingzerostoend {

	public static void main(String[] args) {
		
		
	int a[] ={1,2,0,0,5,7,0,7,8,9,0};
	
	
	int arraylength =a.length;
	
	System.out.println(arraylength);
	
	int count =0;
	
	int endcount=0;
	
	for(int i =0; i<arraylength; i++)
	{
		
		if (a[i]!=0)
		{
			a[count++]= a[i];
		}
		
		else
		{
			endcount=endcount+1;
		}
		
		
		/*if (a[i]==0)
		{
			endcount=endcount+1;
		}*/
		
/*		 while (count < arraylength) 
	            a[count++] = 0; */
		
/*		else 
		{
			a[endcount--]=a[i];
			
			//a[i]=a[endcount--];
		}
		
	
*/
	}
	
	
	System.out.println("Beoferfinal " +Arrays.toString(a) );
	
/*	int finalvalue =arraylength-endcount;
	
	for( finalvalue=4;finalvalue>=endcount;finalvalue++)
	{
		a[finalvalue]=0;
	}
	*/
	int finalvalue =arraylength-endcount;
	
	System.out.println("Final value "+finalvalue);
	
	while(finalvalue<arraylength)
	{
		a[finalvalue]=0;
		finalvalue++;
	}
	
	System.out.println("End count " +endcount);
	
	 System.out.println("Array after pushing zeros to the back: "); 
	 
	 
	 System.out.println(Arrays.toString(a));

	
	
	}

}
