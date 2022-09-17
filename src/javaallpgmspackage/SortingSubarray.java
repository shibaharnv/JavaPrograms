package javaallpgmspackage;

import java.util.Arrays;

public class SortingSubarray {

	public static void main(String[] args) {
		
		
		int a[] ={4,306,7756,34,534,7978,76,24356,77561,7567,666,71};
		
		//Sorting sub array from 2 to 5
		
		
		// note the finishing  n+1
		
		//Arrays.sort(a,0, 12);
		
		Arrays.sort(a,0, 5);
		
		System.out.println(Arrays.toString(a));

	}

}
