
public class Throw2 {
	
	public static double divide(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a/b;
	}
	
	public static void main(String[] args) throws ArithmeticException {
		int a, b;
		
		a = 1;
		b = 10;
		System.out.println(divide(a, b));
		
		a = 10;
		b = 0;
		System.out.println(divide(a, b));
		
	}
	
}
