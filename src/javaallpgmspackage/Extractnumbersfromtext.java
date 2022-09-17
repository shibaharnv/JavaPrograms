package javaallpgmspackage;

public class Extractnumbersfromtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Vergleich 57";
		s = s.replaceAll("\\D+","");
		
		System.out.println(s);
		
	}

}
