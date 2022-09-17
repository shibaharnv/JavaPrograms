package javaallpgmspackage;

import java.util.ArrayList;

public class Duplicateintegerinarraylist {

	public static void main(String[] args) {
		
		int count=0;
		
		ArrayList obj = new ArrayList();
		
		obj.add('a');
		obj.add('b');
		obj.add('c');
		obj.add('c');
		obj.add('d');
		
		for(int i= 0;i<obj.size();i++)
		{
			for(int j=i+1;j<obj.size();j++)
			{
				if(obj.get(i)==obj.get(j))
				{
			/*		char z = (char) obj.get(i);
					char y = (char) obj.get(j);
					System.out.println("z value is " +z);
					System.out.println("y value is " +y);
					
					System.out.println("z index value is " +obj.indexOf(z));
					System.out.println("y index value is " +obj.indexOf(y));
					//System.out.println("y index value is " +y);
*/					count++;
					
					System.out.println("The duplicate value in the arraylist is  "+obj.get(i));
					System.out.println("The duplicate value is in Index " +obj.indexOf(obj.get(i)));
					System.out.println("The duplicate value is in Index " +obj.indexOf(obj.get(j)));
				}
			}
		}
		
		System.out.println("Total number of  duplicate values are "+count);

	}
}


