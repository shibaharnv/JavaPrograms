package javaallpgmspackage;

public class integertostring {
	
	public static void main(String[] args) {
		
	int in = 10;
	
	String str = "Mano";
	
	String Stype = str.getClass().getName();
	
	String Itype  =String.valueOf(in);
			
	
	System.out.println("type " +Itype.getClass().getName());
	
	if(Stype.equals("java.lang.String"))
		
	{
		System.out.println("ITs a String");
	}
	
	
	}

}
