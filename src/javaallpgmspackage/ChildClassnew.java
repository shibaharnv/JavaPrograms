package javaallpgmspackage;

public class ChildClassnew extends InheritanceParentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChildClassnew childobj = new ChildClassnew();
		
		childobj.methodname("fromchildclass");
		
		String value=	childobj.getClass().getSimpleName();
		
		
	
		System.out.println("Class name : " +value);
		

		
	}

}
