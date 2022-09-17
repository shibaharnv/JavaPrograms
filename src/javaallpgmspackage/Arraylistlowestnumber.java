package javaallpgmspackage;

public class Arraylistlowestnumber {

	public static void main(String[] args) {
		
		
		int a[] = new int[3];
		
		a[0]=41;
		a[1]=30;
		a[2]=40;
		
 	int arraysize = a.length;
 	
 	int minvalue=a[0];
	
	for(int i=0;i<arraysize;i++)
	{
	
		if(a[i]<a[0])
		{
			minvalue=a[i];
		}
		
	}
	
	System.out.println(minvalue);
		
		

	}

}
