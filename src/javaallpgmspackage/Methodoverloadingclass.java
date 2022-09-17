package javaallpgmspackage;

public class Methodoverloadingclass {

	public static void main(String[] args) {

		
		Methodoverloadingclass obj = new Methodoverloadingclass();
		
		obj.print(5);
		
		obj.print(10, 16);
	}
	
	
	
	void print(int a)
	
	{
		System.out.println("My Print method " +a);
	}

	
	void print(int a, int b)
	
	{
		System.out.println("My Print method " +a );
		System.out.println("My Print method " +b );
		
		
		
		
		
	}
	
	
}
