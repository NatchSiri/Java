import model.Vehicle2;

public class Bike2 extends Vehicle2 {
	
	Bike2() {
		super();// will invoke parent class constructor
		System.out.println("Bike is created");
	}

	public static void main(String args[]) {
		Bike2 b = new Bike2();
		b.setSpeed(10);
		System.out.print(b.getSpeed());
	}
	
}
