package sample;

public class FinallySample {

	public static void main(String[] args) {

		String test = check();
		System.out.println(test);

	}

	private static String check() {

		try {
			throw new Exception();
		} catch (Exception e) {
			return null;
		} finally {
			System.out.println("finally");
			//return  "(`・ω・)b" ;
		}

	}

	public static void checkTest() throws NullPointerException {

				throw new NullPointerException();
	}
}
