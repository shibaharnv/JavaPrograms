package javaallpgmspackage;

public class Greatestnumberinarray {

	public static void main(String[] args) {
		
		
		
		int a[] = new int[4];
		
		a[0] = 41;
		a[1]=60;
		a[2] =45;
		a[2] =71;
		
		 int max = a[0]; 
		
		
	/*	for(int i =0; i<a.length;i++)
		{*/
			
			//int maxvalue=a[0];
	/*		
			if(a[i]>a[0])
			{
			
				max=a[i];
				
			}*/
			
			 for (int i = 0; i < a.length; i++) 
			 {
	             if (a[i] > max) 
	                 max = a[i]; 
			 }
	     
			
			
			//System.out.println("Greatest number in the array is " +maxvalue);
		//}
		
		System.out.println("Greatest number in the array is " +max);

	}

}
