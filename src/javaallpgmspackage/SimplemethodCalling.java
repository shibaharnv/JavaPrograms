package javaallpgmspackage;

public class SimplemethodCalling {
	
	
 static int c;
 
 
public static void main(String[] args) {
		// TODO Auto-generated method stub

	SimplemethodCalling obj = new SimplemethodCalling();
	
	obj.add(5, 8);
	
	System.out.println(c);
		
	}
	
	
	public  int add (int a , int b)
	
	{
		
		 c = a+b;
		
		
		return c;
		
	}

}
