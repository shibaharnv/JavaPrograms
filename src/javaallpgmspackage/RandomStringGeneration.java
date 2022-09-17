package javaallpgmspackage;

import java.util.Random;

public class RandomStringGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomStringGeneration obj = new RandomStringGeneration();

		obj.getRandomString(4);

	}

	public String getRandomString(int length) {

		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < length; i++) {

			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
			System.out.println(sb);

		}

		System.out.println(sb);
		return sb.toString();

	}
}
