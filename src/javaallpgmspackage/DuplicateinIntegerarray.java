package javaallpgmspackage;

public class DuplicateinIntegerarray {

	public static void main(String[] args) {
		
		int i,j;
		
		int count=0;
		
		int a[] = new int[5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 4;
		
		//int b[] = {1,2,3,4,5};
		
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
			
					
					System.out.println("the duplicate array value is " +a[j]);
					System.out.println("This duplicate value present in a["+j+"] th  and a["+i+"] th array index");
						
				}
									
			}
		}
		
		System.out.println("Number of duplicate values are " +count);
		
		}
	
/*	public static int getarrayindex(int a[],int value)
	
	{
		int k = 0;
		
		for(int f=0;f<a.length;f++)
		{
			if(a[f]==value)
			
			k= f;
			break;
		}
		
		
		return k;
		
	}
	*/
	

}
