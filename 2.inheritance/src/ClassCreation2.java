public class ClassCreation2 {
	
	static class A {
		A() {
			System.out.println("class A");
		}
	}

	static class B extends A {
		
		B() {
			
		}
		
		B(int val) {
			// super();
			System.out.println("class B, value=" + val);
		}
	}

	static class C extends B {
		int x;
		
		C(int val) {
			// must have super();
			// super(val);
			System.out.println("class C, value=" + val);
		}
	}
	
	public static void main(String[] args) {
		C c1 = new C(5);
		c1.x = 10;
	}
	
}
