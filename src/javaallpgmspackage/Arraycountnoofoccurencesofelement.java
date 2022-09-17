package javaallpgmspackage;

import java.util.Scanner;

public class Arraycountnoofoccurencesofelement {

	public static void main(String[] args) {

		Scanner scanobj = new Scanner(System.in);
		
		int input = scanobj.nextInt();
		
		int count =0;
		
		int a[]={1,2,3,4,5,5,9,9,9,9};
		
		
		int arraylength = a.length;
		
		System.out.println("Array length " +arraylength);
		
		for(int i=0; i<arraylength;i++)
		{
			if(a[i]==input)
			{
				count++;
			}
		}
		
		System.out.println("Element "+input+" occurs "+count+" times in the array");
	}

}
