package javaallpgmspackage;

import java.util.ArrayList;

public class UniquenumberinArray {

	public static void main(String[] args) {
		
		
		int count=0;
		int a[] = new int[5];
		
		//Arraylist arraylistobj = new Arraylist();
		
		ArrayList<Integer> arraylistProdobj = new ArrayList<Integer> ();
		
		int flag;

		
		a[0]=15;
		a[1]=15;
		a[2]=15;
		a[3]=17;
		a[4]=15;
		
		
	int arraysize=	a.length;
	System.out.println(arraysize);
	
//	for(int )
	
	for(int i=0;i<arraysize;i++)
		
	{
		for(int j=i+1;j<arraysize;j++)
		{
			if(a[i]!=a[j])
			{
				flag=1;
				}
			
			else{
				flag=0;
			}
		
	
			
			if(flag==1)
			{
				
			count++;
			System.out.println("Unique value is "+a[j]);
				
				//arraylistProdobj.add(a[j]);
				
				//System.out.println("Unique numbers are " +arraylistProdobj);
			}
			
			else if (flag==0)
			{
				System.out.println("This value appears more than once " +a[i]);
				arraylistProdobj.add(a[j]);
				System.out.println("Unique numbers are " +arraylistProdobj);
			}
	
		}
	}
	//System.out.println("Unique numbers are " +arraylistProdobj);
	//System.out.println("Number of unique values are "+count);
	}
}
		
		
	


