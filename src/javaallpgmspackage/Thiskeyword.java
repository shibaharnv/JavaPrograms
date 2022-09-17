package javaallpgmspackage;

public class Thiskeyword {

	 String name;
	 int rollno;


	public static void main(String[] args) {
		
		
		Thiskeyword obj = new Thiskeyword("shibahar",15);
		obj.display();
		
	}




	
	
	Thiskeyword(String name,int rollno)
	
	{
		
		 name=name;
		 
		 rollno=rollno;
		 
		
	}
	
	void display()
	
	{
		System.out.println("name " +name + "" +rollno);
	}
	
}
