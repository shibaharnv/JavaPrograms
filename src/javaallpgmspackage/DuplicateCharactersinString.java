package javaallpgmspackage;

public class DuplicateCharactersinString {

	public static void main(String[] args) {
		
		String text = "shibahar";
		
		int textlength = text.length();
		int count =0;
		
		//String s = "helloThisIsA1234Sample";
		
	
		
		
		for(int i=0;i<textlength;i++)
		{
			
			for(int j=i+1;j<textlength;j++)
			{
			
			char character1 =text.charAt(i);
			char character2  =text.charAt(j);
			
			if(character1 == character2)
			{
				count++;
			}
			
			//System.out.println(character1);
			
			}
			
			//System.out.println(character1);
			
		}
		
		System.out.println("Duplicate Characters are " +count);
		
		

	}

}
