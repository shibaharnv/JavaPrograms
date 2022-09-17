package javainterviewprograms;

public class Duplicateintegerarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = new int[4];
		
		int duplicate[] = new int[a.length];
		int count=0;
		
		a[0]=3;
		a[1]=4;
		a[2]=4;
		a[3]=4;
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					
					count++;
					
					duplicate[count-1] =a[i];
				}
			}
			
			

		}
		
	
		
	}

}
