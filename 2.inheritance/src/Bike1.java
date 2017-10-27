import model.Vehicle1;

public class Bike1 extends Vehicle1 {
	
	int speed = 100;

	void display() {
		System.out.println("super speed = " + super.speed);// will print speed of Vehicle now
		System.out.println("this speed = " + this.speed);
	}

	public static void main(String args[]) {
		Bike1 b = new Bike1();
		b.display();
	}
	
}
