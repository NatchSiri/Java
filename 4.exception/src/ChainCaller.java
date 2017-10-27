
public class ChainCaller {
	
	public static void main(String[] args) {
		ChainCaller t = new ChainCaller();
		t.method1(6, 3);
		t.method1(6, 0);
		
		//method1(7, 0); cannot call because method1 is non-static function
	}
	
	// check method
	public void method1(double a, double b) {
		try {
			System.out.println(method2(a, b));
		} catch (ArithmeticException ae) {
			System.out.println("Divided by zero not allowed");
		}
	}
	
	// Method that do something
	public String method2(double a, double b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException();
		else
			return a + "/" + b + "=" + a / b;
	}
	
}
