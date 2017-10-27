
public class Throw4 {
	
	public static void main(String args[]) {
		try {
			method1();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		method3();
	}
	
	public static void method3() throws Exception {
		method4();
	}
	
	public static void method4() throws Exception {
		method5();
	}
	
	public static void method5() throws Exception {
		throw new Exception();
	}
	
}
