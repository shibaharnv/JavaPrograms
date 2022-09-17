package javaallpgmspackage;

public class Constructoroverloadingstudent {

	//CONSTRUCTOR OVERLOADING
	
	public static void main(String[] args) {
		
		Constructoroverloadingstudent obj = new Constructoroverloadingstudent("Shibahar");
		Constructoroverloadingstudent obj2 = new Constructoroverloadingstudent("Manoj", "2nd");
	}

	public Constructoroverloadingstudent(String name)
	
	{
		System.out.println(name);
		
	}
	
	public Constructoroverloadingstudent(String name, String Class)
	
	{
		System.out.print("Name : "+name  );
		
		System.out.println(" . Class : "+Class  );
		
	}
	
}
