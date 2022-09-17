package javaallpgmspackage;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistmerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arraylistobj1 = new ArrayList<String>();

		ArrayList<String> arraylistobj2 = new ArrayList<String>();

		arraylistobj1.add("i");

		arraylistobj1.add("love");

		arraylistobj2.add("u");

		arraylistobj1.addAll(arraylistobj2);

		System.out.println(arraylistobj1);

	}
}
