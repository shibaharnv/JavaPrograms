package javaallpgmspackage;

import java.util.Arrays;

public class Reversearraytest {

	public static void main(String[] args) {
		
		int temp=0;
		
		int a[] ={1,2,3};
		
		
		int arraylenth=a.length;
		
		
		for(int i=0;i<arraylenth/2;i++)
		{
			temp =a[i];
			
		a[i]	=a[arraylenth-i-1];
		a[arraylenth-i-1]=temp;
		}
		
		
		System.out.println("After reverese" +Arrays.toString(a));

	}

}
