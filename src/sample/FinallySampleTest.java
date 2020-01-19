package sample;

import org.junit.Test;

public class FinallySampleTest {

	@Test(expected = NullPointerException.class)
	public void test() {

		FinallySample test = new FinallySample();
		test.checkTest();

	}

}
