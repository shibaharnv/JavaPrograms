package javaallpgmspackage;

public class EnumClass {
	
	
	//Enum is a datatype which has fixed set of constants 
	
	
	
	enum seasons {
		
		Summer ,winter,spring,auntumn;
		
		//Semi colon is optional
	}

	public static void main(String[] args) {
		
		
		//values() method returns an array containing all the values of the enum.
		
		for(seasons S : seasons.values())
		{
			System.out.println(S);
		}
		
		System.out.println(seasons.valueOf("auntumn"));
		
		
	}

		
	
}


	

