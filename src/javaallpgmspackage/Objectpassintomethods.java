package javaallpgmspackage;

public class Objectpassintomethods {

	public static void main(String[] args) {
		
		
		Objectpassintomethods obj1 = new Objectpassintomethods();
		
		
		
		obj1.print(5);

		obj1.printtwo("My string");

	}

	
	public void print(int obj1)
	
	{
		
		System.out.println("hi " +obj1);
		
	}
	
	
	public void printtwo (String obj1)
	
	{
		
		System.out.println("hi " +obj1);
		
	}
	
}
