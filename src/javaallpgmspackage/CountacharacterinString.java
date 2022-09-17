package javaallpgmspackage;

public class CountacharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		
		String word ="shibahara";
		
		for(int i=0;i<word.length();i++)
		{
			
			char c = word.charAt(i);
			
			if(c=='a')
			{
				count++;
			}
			
			
			
		}
		
		System.out.println("The character a appears "+count+" times in the word "+word+"");
	}

}
