package javaallpgmspackage;

import java.util.Arrays;
import java.util.Collections;

public class Sortingarraydescending {

	public static void main(String[] args) {
		
		   // Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types.
		
		Integer a[] = {312,5234,534,765,867,867,86786,3453,253,253,523,645,645,645876,886,788};
		
		Arrays.sort(a, Collections.reverseOrder());
		
		System.out.println("Final list " +Arrays.toString(a));

	}

}
