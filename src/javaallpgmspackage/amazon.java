package javaallpgmspackage;

public class amazon {
	
	
	public static void main(String[] args) {
		String s = "aabb";
		
		printOccurencesChars(s);
	}

	// assuming only ASCII chars in string.
	private static void printOccurencesChars(String s) {

		int[] count = new int[256];
	/*	for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}*/
		
	
		
		char[] c = s.toCharArray();
		int charVal = -1;
		
		for (int i = 0; i < c.length; i++) {
			//charVal = (int) c[i];
			//c[i]
			
			System.out.println("charVal" +charVal);
			count[charVal]++;
		}
		
		
		
		StringBuilder sb = new StringBuilder();
		int charCount = -1;
		
		for (int i = 0; i < count.length; i++) {
			charCount = count[i];
			if (charCount > 0) {
				sb.append((char)i + "" + charCount);
			}			
		}
		
		System.out.println(sb.toString());
	}

}
