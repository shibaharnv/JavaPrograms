package javaallpgmspackage;

public class ThiskeyowrdVariableHiding {

	//Instance variable
	
	int a =10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variable hiding is local variable value hiding the instance variable value.
	
		ThiskeyowrdVariableHiding obj = new ThiskeyowrdVariableHiding();
		obj.print();
	}
	
	
	void print()
	
	{
		//Local variable value hiding the instance variable value.
		
		int a =30;
		System.out.println(a);
		
		//this keyword can be used to refer to any member of the current object from within an instance Method or a constructor. 
		
		System.out.println(this.a);
	}
	

}
