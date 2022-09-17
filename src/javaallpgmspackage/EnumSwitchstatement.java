package javaallpgmspackage;

public class EnumSwitchstatement {
	
	
	enum day {MOnday, Sunday, Tuesday}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		day d = day.Tuesday;
		
		
		switch(d)
		{
		
		case MOnday:
			System.out.println("Monday");
			break;
		
		
		case Tuesday:
			System.out.println("Result is Tuesday");
			break;
			
		}
		
	}

}
