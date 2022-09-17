package javaallpgmspackage;

import java.util.Random;

public class Randomstringgenerationbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String base = "sfhkdsjhfkjdshfkdsjhfdskjhfkh";

		StringBuffer stringobj = new StringBuffer();

		Random randomnoobj = new Random();

		for (int i = 0; i <5; i++)

		{

			int number = randomnoobj.nextInt(16);

			stringobj.append(base.charAt(number));

		}
		System.out.println(stringobj);

	}

}
