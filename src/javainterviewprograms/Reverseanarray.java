package javainterviewprograms;

public class Reverseanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30 ,40,50};
		
	int temp;
		
		/*
		 * temp =a[0]; a[0]=a[4]; a[4]=temp;
		 */
		int i=0;
		
		int j= a.length-1;
		
		System.out.println("Before reversing");
		
		for(int x=0; x<a.length; x++)
		{
			 System.out.println(a[x]+ " ");
		}
		

		
		//a[0] ==a[4]
		//a[1]= a[3]
		//a[2] =a[2]
		
	
		
		while(i<=j)
		{
			temp =a[i];
			a[i] =a[j];
			a[j]=temp;
			
			i =i+1;
			j=j-1;
		}
		
		
		System.out.println("After reversing");
		
		for(int y=0; y<a.length; y++)
		{
			 System.out.println(a[y]+ " ");
		}
		
	}

}
