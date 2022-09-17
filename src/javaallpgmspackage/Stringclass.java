package javaallpgmspackage;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		String stringobj = new String ();
		stringobj.concat("hi");
		*/
		
		
		
		char ch[] = new char[3];
		
		ch[0] ='a';
		ch[1]= 'b';
		ch[2]= 'c';
		
		
		String s = new String(ch);
		
		System.out.println(s);
		
		String st1 = "   This world is - nice";
		
		String st4 ="+1-34567890(3443)";
		
		String st5 ="+1";
		
		String st6 = "-34567890";
		
		String st7="(3443)";
		
	
		String st8 =st5.replace("+", "").concat(st6.replace("-", "")).concat(st7.replace("(", "").replace(")", ""));
		String stx= 	st4.replace("+", "").replace("-", "").replace("(", "").replace(")", "");
		System.out.println("replace string " +stx);
		System.out.println("Contact string " +st8);
		
		System.out.println("values Matching " +st8.equalsIgnoreCase(stx));
		
	
		//String xxxx= st1.split('-')[1].trim();
	
		//System.out.println("xxxx value is " +xxxx);
		

	
		
		String st2 = "Beautiful";
		
		
		System.out.println("SUBSTRTING  OF  " +st2.substring(0, 4));
		
		System.out.println("Contatenation " +st1.concat(" is new"));
	
		System.out.println("Character at " +st2.charAt(0));
		
		//If both the string are Equal we will get the result as Zero.
		
		System.out.println("Compare " +st1.compareToIgnoreCase(st2));
		
		String st3 =st1.replace("-", "").trim();
		
		System.out.println("After replacing " +st3);
		
		// Split the String 
		
		String splt[] =st1.split("-");
		

//	IMPORTANT SPLIT THE STRING [0] REFERS TO THE FIRST PART OF THE SPLIT STRING
		
		//[1] REFERS TO THE SECOND  PART OF THE SPLIT STRING
		
		String yyyyy = st1.split("-")[0].trim();
		
		System.out.println("Value of YYYY" +yyyyy);
	
	
	System.out.println("Main text " +st5);
		
	System.out.println("First Value is "+splt[0]);

	System.out.println("Second Value is "+splt[1]);
	
	System.out.println("After trimming First String is"  +st1.trim());
	
		
		}
	
	
	Stringclass ()
	
	{
		System.out.println("new");
	}

}
