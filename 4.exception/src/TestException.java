import org.junit.Test;

public class TestException {
	
	@Test(expected=ArithmeticException.class)
	public void testWithExpected() {
		@SuppressWarnings("unused")
		double a = 10/0;
	}
	
	@Test
	public void testWithoutExpected() {
		@SuppressWarnings("unused")
		double a = 10/0;
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testWithIncorrectExpected() {
		@SuppressWarnings("unused")
		double a = 10/0;
	}
}
