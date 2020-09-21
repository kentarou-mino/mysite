package sample;

public class FinallySample {

	public static void main(String[] args) {

		String test = new FinallySample().check();
		System.out.println(test);

	}

	private String check() {

		System.out.println("start");
		try {
			//throw new Exception();
			System.out.println("try");
			checkTest();
		} catch (NullPointerException e) {
			System.out.println("catch");
			System.out.println("NullPointerException");
			return "catch";
		} catch (Exception e) {
			System.out.println("catch");
			System.out.println("Exception");
			return "catch";
		} finally {
			System.out.println("finally");
		}
		return "end";
	}

	void checkTest() throws NullPointerException {

		throw new NullPointerException();
	}
}
