package javaallpgmspackage;

public class Enumasssigningvalues {
	
	enum size {
		
		Small(10),
		Medium(50),
		large(100);
		
		int value;
		
		private size( int value)
		{
			this.value= value;
		}
	}

	public static void main(String[] args) {
		
		
		for(size s : size.values())
		{
			System.out.println(s+" "+s.value);
		}
		
	

	}

}
