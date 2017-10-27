package model;

public class Circle extends GeometricObject {
	
	private double radius;
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
