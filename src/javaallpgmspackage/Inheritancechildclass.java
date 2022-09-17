package javaallpgmspackage;

public class Inheritancechildclass extends InheritanceParentclass {

	public static void main(String[] args) {
		
		Inheritancechildclass obj = new Inheritancechildclass();
		
		obj.methodoverridingmethod();
		
		InheritanceParentclass parentobj = new InheritanceParentclass();
		
		parentobj.methodoverridingmethod();

	}
	
	
	public void methodoverridingmethod()
	{
		System.out.println("Exam");
	}
	
	
	

}
