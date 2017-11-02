package model;

public class Circle extends Shape {
	
	double radius;

	public Circle(double r, String n) {
		this.radius = r;
		// this.name = n;
		super.name = n;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	public double diameter() {
		return 2 * this.radius;
	}
	
}
