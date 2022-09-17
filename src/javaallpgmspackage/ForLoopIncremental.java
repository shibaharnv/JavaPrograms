package javaallpgmspackage;

public class ForLoopIncremental {

	public static void main(String[] args) {
		
		
		int i =10;
		
		
		for( i =0;i< 10; i=i+2 )
			
		{
			System.out.println(i);
		}
		
		// print a number from  10 to 1 
		
		for(int x =10; x>=1;x--)
		{
			System.out.println(x);
		}
		
		// print a numbers like 10,8,6,4,2 ,0
		
		
		for(int z=10;z>=0;z=z-2)
		{
			System.out.println("z value is " +z);
		}
		
		
		
		// print zero to -10 
		
		for(int j=0;j>=-10;j=j-2)
		{
			System.out.println("j value is  " +j);
		}
		

	}

}
