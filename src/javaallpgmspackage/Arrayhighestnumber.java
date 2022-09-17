package javaallpgmspackage;

public class Arrayhighestnumber {

	public static void main(String[] args) {
		
		
		int a[] = new int[3];
		
		a[0] = 200;
		a[1]=1070;
		a[2] =385;
		
		int i=0;
		
		int maxvalue =a[0];

		for( i=0;i<a.length;i++)
		{
			if(a[i]>a[0])
			{
				maxvalue=a[i];
				//a[0]= maxvalue;
			}
			
		}
		
		System.out.println("The highest array value is  "  +maxvalue);
		
		
		//ALOGORITHM
		
		// 1. Get the size of the array and form a loop
		// 2. Check if b[i] is greater than b[0]  
		//3. if b[i] is greater then max value = b[i] and then reassign max value to b[0]
		//4.
		
		
		
/*		
		int[] b= {1,2,3,3};
		
		int maxvalue=0;
		
		String[] words ={"shibahar","Manoj","Ram"};
		
		char[] characters={'c','d','e','f'};
		
		for(int j=0;j<b.length;j++)
		{
			
			if(b[j]>b[0])
			{
				maxvalue=b[j];
				b[0]=maxvalue;
			}
		}
		
		System.out.println("The highest array value is  "  +maxvalue);
	}*/

	}
	
	
	
}
