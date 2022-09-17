package javaallpgmspackage;

public class Ascendingarray {

	public static void main(String[] args) {
		
		int temp;
		
		int a[] = new int[3];
		
		a[0] =14;
		a[1]=8;
		a[2]=33;		
		
		
		int alength =a.length;
		
		System.out.println(alength);
		
		
		for(int i=0;i<=alength;i++)
		{
			if(a[i]<a[i+1])
			{
				temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}

	}

}
