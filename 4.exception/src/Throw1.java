
public class Throw1 {
	
	static void greet(String name) throws ClassNotFoundException, InterruptedException {
		if (name.equals("John")) {
			throw new InterruptedException();
		}
		if (name.equals("Natch")) {
			throw new ClassNotFoundException();
		}
		System.out.println("Hello! " + name);
	}

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			greet("John");
		} catch (InterruptedException e) {
			System.out.println("Bye. " + e.toString());
		}
		
		try {
			greet("Natch");
		} catch (InterruptedException e) {
			System.out.println("Bye. " + e.toString());
		} catch (ClassNotFoundException e) {
			System.out.println("Bye. " + e.toString());
		}
	}
	
}
