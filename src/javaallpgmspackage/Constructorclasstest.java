package javaallpgmspackage;

public class Constructorclasstest {
	
	Constructorclasstest()
	{
		System.out.println("This is a constructor of constructor class test");
	}
	
	Constructorclasstest(String name)
	{
		
		this();
		System.out.println("This is a constructor of constructor class test" +name);
	}


}
