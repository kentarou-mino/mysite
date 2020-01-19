package sample;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureRandomTest {

	public static void main(String[] args) {

		createCode();
		check();

	}

	private static void check() {

		int count = 0;
		do {
			count++;
			System.out.println("(`・ω・)b");

			//		} while (count < 5);
		} while (count < 5);
	}

	private static void createCode() {
		for (int count = 0; count < 4; count++) {
			byte bytes[] = new byte[16];
			SecureRandom secRandom;
			try {
				secRandom = SecureRandom.getInstance("SHA1PRNG");
				secRandom.nextBytes(bytes);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}

			StringBuffer buf = new StringBuffer();
			for (int i = 0; i < bytes.length; i++) {
				buf.append(String.format("%02x", bytes[i]));
			}
			System.out.println(buf.toString());
		}

		System.out.println("----------------");

	}

}
