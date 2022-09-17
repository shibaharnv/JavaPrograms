package javaallpgmspackage;

import java.util.ArrayList;

public class ForEachloopJava {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList <String> Arraylistobj = new ArrayList<String> ();
	
	Arraylistobj.add("Firsttext");
	
	Arraylistobj.add("Secondtext");
	
	Arraylistobj.add("thridtext");
	
	System.out.println("Size of the array list : " +Arraylistobj.size());
	
	
/*	for(int i=0; i<Arraylistobj.size(); i++)
	{
		System.out.println(Arraylistobj.get(i));
	}
	*/
	
/*	for(String S :Arraylistobj )
	{
		//int i=1;
		System.out.println(S);
		//i++;
		
		System.out.println("Last statement");
		
		
	}*/
	
	
	for(String Z :Arraylistobj)
	{
		System.out.println(Z);
	}
	
	/*	
		ArrayList<Integer> arraylistobj = new ArrayList<Integer> ();
		
		arraylistobj.add(1);
		
		//arraylistobj.add(2, 3);
		
		arraylistobj.add(2);
		
		arraylistobj.add(1, 4);
		
		for( int i : arraylistobj)
		{
			System.out.println("Index of "+i+" : " +arraylistobj.indexOf(i));
		}
		*/
	}

}
