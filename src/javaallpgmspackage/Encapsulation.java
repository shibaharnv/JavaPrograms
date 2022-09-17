package javaallpgmspackage;

public class Encapsulation {
	
	 private int a ;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		
		obj.setA(10);
		
		System.out.println("Get value is "+obj.getA());
		
	}

}



