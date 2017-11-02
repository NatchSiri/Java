package model;

public class Square extends Shape {
	
	double height;

	public Square(double h, String n) {
		this.height = h;
		// super.name = n;
		this.name = n;
	}

	@Override
	double perimeter() {
		return 4 * this.height;
	}
	
}