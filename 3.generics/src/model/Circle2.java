package model;

public class Circle2 extends GeometricObject2 {
	
	private double radius;
	
	public Circle2(double radius) {
		setRadius(radius);
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle2 area = " + this.getArea();
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
