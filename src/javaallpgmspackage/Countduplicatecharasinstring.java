package javaallpgmspackage;

public class Countduplicatecharasinstring {

	public static void main(String[] args) {

		String givenstring = "abbcabcbacccc";
		
		
		int acount=0;
		int bcount=0;
		int ccount=0;
		
		
		
		char[] stringtochararray = givenstring.toCharArray();
		
		for(int i=0;i<stringtochararray.length;i++)
		{
			
			char singlechar =stringtochararray[i];
			
			System.out.println("singlechar " +singlechar);
			
			if(singlechar=='a')
			{
				acount++;
			}
			
			
			if(singlechar=='b')
			{
				bcount++;
			}
			
			if(singlechar=='c')
			{
				ccount++;
			}
		}
		
		
		System.out.println("No of times char a appeared in string  " +acount);
		System.out.println("No of times char b appeared in string  " +bcount);
		System.out.println("No of times char c appeared in string  " +ccount);
	}

}
