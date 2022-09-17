package javaallpgmspackage;

public class Findspecifictextcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String text = "xyzautoxyzauto";
		
		char[] strchararray = text.toCharArray();
		
		
		int textlength =text.length();
		
		int count =0;
		
		int charlength=strchararray.length;
	
		System.out.println("Char length " +charlength);
		
		
		for(int i=0; i<charlength;i++)
			
	{
			
			if(strchararray[i]=='a')
			{
				if((strchararray[i+1]=='u') &&(strchararray[i+2]=='t')&&(strchararray[i+3]=='o'))
				{
					count++;
				}
			}
		
		//if((strchararray[i]=='a') ||(strchararray[i]=='u') ||(strchararray[i]=='t')||(strchararray[i]=='o'))
			
		
		
		//System.out.println(strchararray[i]);
	}
	
		
		System.out.println("Times "+count);
		
		
	}

}
