package javaallpgmspackage;

public class Countdigits {

	public static void main(String[] args) {
		
		int n=0;
		
		String value ="1234";
		
		int size =value.length();
		
		System.out.println(size);
		
		
		for(int i=0;i<value.length();i++)
		{
			n= n+1;
		}
		
		System.out.println("Value of n is " +n);
		
		if(n==4)
		{
			System.out.println("Working as expected");
		}

	}

}
